package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcWorkPlan {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWorkPlan() {
	}

	public SetAttributeSubIfcWorkPlan(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CreationDate")) {
			//2NoEList
			 //2void
			 //2IfcDateTimeSelect
		}
		else if (attributeName.equals("TotalFloatAsString")) {
			//2NoEList
			((IfcWorkPlan) object).setTotalFloatAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("TotalFloat")) {
			//2NoEList
			((IfcWorkPlan) object).setTotalFloat(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("Duration")) {
			//2NoEList
			((IfcWorkPlan) object).setDuration(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DurationAsString")) {
			//2NoEList
			((IfcWorkPlan) object).setDurationAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("FinishTime")) {
			//2NoEList
			 //2void
			 //2IfcDateTimeSelect
		}
		else if (attributeName.equals("WorkControlType")) {
			//2NoEList
			 //2void
			 //2IfcWorkControlTypeEnum
		}
		else if (attributeName.equals("UserDefinedControlType")) {
			//2NoEList
			((IfcWorkPlan) object).setUserDefinedControlType(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Purpose")) {
			//2NoEList
			((IfcWorkPlan) object).setPurpose(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("StartTime")) {
			//2NoEList
			 //2void
			 //2IfcDateTimeSelect
		}
		else if (attributeName.equals("Identifier")) {
			//2NoEList
			((IfcWorkPlan) object).setIdentifier(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcWorkPlan) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
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
			((IfcWorkPlan) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcWorkPlan) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
