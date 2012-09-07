package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcWindowLiningProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWindowLiningProperties() {
	}

	public SetAttributeSubIfcWindowLiningProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LiningDepth")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setLiningDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LiningThickness")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setLiningThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransomThickness")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setTransomThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShapeAspectStyle")) {
			//1NoEList
			 //1void
			 //1IfcShapeAspect
		}
		else if (attributeName.equals("FirstTransomOffsetAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setFirstTransomOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SecondTransomOffsetAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setSecondTransomOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FirstMullionOffsetAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setFirstMullionOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SecondMullionOffsetAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setSecondMullionOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MullionThickness")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setMullionThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MullionThicknessAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setMullionThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FirstTransomOffset")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setFirstTransomOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SecondTransomOffset")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setSecondTransomOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FirstMullionOffset")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setFirstMullionOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SecondMullionOffset")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setSecondMullionOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LiningDepthAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setLiningDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LiningThicknessAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setLiningThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TransomThicknessAsString")) {
			//1NoEList
			((IfcWindowLiningProperties) object).setTransomThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcWindowLiningProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcWindowLiningProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
