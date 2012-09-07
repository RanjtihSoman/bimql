package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcPropertyReferenceValue {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPropertyReferenceValue() {
	}

	public SetAttributeSubIfcPropertyReferenceValue(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("UsageName")) {
			//1NoEList
			((IfcPropertyReferenceValue) object).setUsageName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PropertyReference")) {
			//1NoEList
			 //1void
			 //1IfcObjectReferenceSelect
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcPropertyReferenceValue) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcPropertyReferenceValue) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
