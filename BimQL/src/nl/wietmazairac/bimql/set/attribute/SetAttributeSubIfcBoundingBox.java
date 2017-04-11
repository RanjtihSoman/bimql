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

import org.bimserver.models.ifc2x3tc1.IfcBoundingBox;

public class SetAttributeSubIfcBoundingBox {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBoundingBox() {
	}

	public SetAttributeSubIfcBoundingBox(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("XDimAsString")) {
			//1NoEList
			((IfcBoundingBox) object).setXDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YDimAsString")) {
			//1NoEList
			((IfcBoundingBox) object).setYDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ZDimAsString")) {
			//1NoEList
			((IfcBoundingBox) object).setZDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("XDim")) {
			//1NoEList
			((IfcBoundingBox) object).setXDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("YDim")) {
			//1NoEList
			((IfcBoundingBox) object).setYDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ZDim")) {
			//1NoEList
			((IfcBoundingBox) object).setZDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Corner")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
	}
}
