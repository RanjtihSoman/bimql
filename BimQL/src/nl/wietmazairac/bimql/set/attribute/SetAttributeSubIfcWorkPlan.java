package nl.wietmazairac.bimql.set.attribute;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc2x3tc1.IfcWorkPlan;

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
