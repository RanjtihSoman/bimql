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

import org.bimserver.models.ifc2x3tc1.IfcRibPlateProfileProperties;

public class SetAttributeSubIfcRibPlateProfileProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRibPlateProfileProperties() {
	}

	public SetAttributeSubIfcRibPlateProfileProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RibSpacingAsString")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setRibSpacingAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RibHeight")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setRibHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RibWidth")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setRibWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RibHeightAsString")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setRibHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RibWidthAsString")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setRibWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RibSpacing")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setRibSpacing(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Thickness")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThicknessAsString")) {
			//1NoEList
			((IfcRibPlateProfileProperties) object).setThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Direction")) {
			//1NoEList
			 //1void
			 //1IfcRibPlateDirectionEnum
		}
	}
}
