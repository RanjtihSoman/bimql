package nl.wietmazairac.bimql.get.attribute;

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

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertyBoundedValue;

public class GetAttributeSubIfcPropertyBoundedValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyBoundedValue(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("UpperBoundValue")) {
			resultList.add(((IfcPropertyBoundedValue) object).getUpperBoundValue());
			 //1IfcValue
		}
		else if (string.equals("LowerBoundValue")) {
			resultList.add(((IfcPropertyBoundedValue) object).getLowerBoundValue());
			 //1IfcValue
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcPropertyBoundedValue) object).getUnit());
			 //1IfcUnit
		}
		else if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyBoundedValue) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcPropertyBoundedValue) object).getPropertyForDependance().get(i));
			}
			 //3EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyBoundedValue) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPropertyBoundedValue) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyBoundedValue) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcPropertyBoundedValue) object).getPropertyDependsOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyBoundedValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertyBoundedValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
