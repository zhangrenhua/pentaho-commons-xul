package org.pentaho.ui.xul.swt.tags;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.components.XulTreeCell;
import org.pentaho.ui.xul.containers.XulTreeRow;
import org.pentaho.ui.xul.swt.SwtElement;
import org.pentaho.ui.xul.dom.Element;

public class SwtTreeCell extends SwtElement implements XulTreeCell {

  String label="";
  String srcUrl=null;
  Object value=null;
  SwtTreeRow parentRow;
  boolean isEditable=false;
  
  public SwtTreeCell(XulComponent parent){
    this(null, parent,null,"treecell");
  }

  public SwtTreeCell(Element self, XulComponent parent, XulDomContainer container, String tagName){
    super(tagName);
    parentRow = (SwtTreeRow) parent;
    parentRow.addCell(this);
  }
  
  public String getLabel() {
    return label;
  }

  public String getSrc() {
    return srcUrl;
  }

  public Object getValue() {
    return value;
  }

  public boolean isEditable() {
    return isEditable;
  }

  public void setEditable(boolean edit) {
    isEditable=edit;
  }

  public void setLabel(String label) {
    this.label=label;
  }

  public void setSrc(String srcUrl) {
    this.srcUrl=srcUrl;
  }

  public void setValue(Object value) {
    this.value=value;
    parentRow.layout();
  }

  public int getSelectedIndex() {
    return 0;
  }

  public void setSelectedIndex(int index) {
    
        // TODO Auto-generated method stub 
      
  }

}
