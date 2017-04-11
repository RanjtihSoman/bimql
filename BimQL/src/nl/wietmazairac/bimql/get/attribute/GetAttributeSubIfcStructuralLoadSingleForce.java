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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleForce;

public class GetAttributeSubIfcStructuralLoadSingleForce {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadSingleForce(Object object, String string) {
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
		if (string.equals("ForceXAsString")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getForceXAsString());
			 //1String
		}
		else if (string.equals("ForceYAsString")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getForceYAsString());
			 //1String
		}
		else if (string.equals("ForceZAsString")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getForceZAsString());
			 //1String
		}
		else if (string.equals("MomentXAsString")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getMomentXAsString());
			 //1String
		}
		else if (string.equals("MomentYAsString")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getMomentYAsString());
			 //1String
		}
		else if (string.equals("MomentZAsString")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getMomentZAsString());
			 //1String
		}
		else if (string.equals("ForceX")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getForceX());
			 //1double
		}
		else if (string.equals("ForceY")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getForceY());
			 //1double
		}
		else if (string.equals("ForceZ")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getForceZ());
			 //1double
		}
		else if (string.equals("MomentX")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getMomentX());
			 //1double
		}
		else if (string.equals("MomentY")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getMomentY());
			 //1double
		}
		else if (string.equals("MomentZ")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getMomentZ());
			 //1double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadSingleForce) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
