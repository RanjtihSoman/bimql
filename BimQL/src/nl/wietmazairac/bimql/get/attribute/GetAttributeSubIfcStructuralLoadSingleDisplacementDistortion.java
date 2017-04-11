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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleDisplacementDistortion;

public class GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion(Object object, String string) {
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
		if (string.equals("DistortionAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDistortionAsString());
			 //1String
		}
		else if (string.equals("Distortion")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDistortion());
			 //1double
		}
		else if (string.equals("RotationalDisplacementRXAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRXAsString());
			 //2String
		}
		else if (string.equals("RotationalDisplacementRYAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRYAsString());
			 //2String
		}
		else if (string.equals("RotationalDisplacementRZAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRZAsString());
			 //2String
		}
		else if (string.equals("DisplacementXAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementXAsString());
			 //2String
		}
		else if (string.equals("DisplacementYAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementYAsString());
			 //2String
		}
		else if (string.equals("DisplacementX")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementX());
			 //2double
		}
		else if (string.equals("DisplacementY")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementY());
			 //2double
		}
		else if (string.equals("DisplacementZ")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementZ());
			 //2double
		}
		else if (string.equals("DisplacementZAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementZAsString());
			 //2String
		}
		else if (string.equals("RotationalDisplacementRX")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRX());
			 //2double
		}
		else if (string.equals("RotationalDisplacementRY")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRY());
			 //2double
		}
		else if (string.equals("RotationalDisplacementRZ")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRZ());
			 //2double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
