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

import org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleRefraction;

public class SetAttributeSubIfcSurfaceStyleRefraction {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSurfaceStyleRefraction() {
	}

	public SetAttributeSubIfcSurfaceStyleRefraction(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RefractionIndex")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setRefractionIndex(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DispersionFactor")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setDispersionFactor(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RefractionIndexAsString")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setRefractionIndexAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DispersionFactorAsString")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setDispersionFactorAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
