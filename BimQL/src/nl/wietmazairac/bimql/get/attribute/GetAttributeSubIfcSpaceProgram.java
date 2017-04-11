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

import org.bimserver.models.ifc2x3tc1.IfcSpaceProgram;

public class GetAttributeSubIfcSpaceProgram {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSpaceProgram(Object object, String string) {
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
		if (string.equals("StandardRequiredAreaAsString")) {
			resultList.add(((IfcSpaceProgram) object).getStandardRequiredAreaAsString());
			 //1String
		}
		else if (string.equals("MaxRequiredArea")) {
			resultList.add(((IfcSpaceProgram) object).getMaxRequiredArea());
			 //1double
		}
		else if (string.equals("MinRequiredArea")) {
			resultList.add(((IfcSpaceProgram) object).getMinRequiredArea());
			 //1double
		}
		else if (string.equals("RequestedLocation")) {
			resultList.add(((IfcSpaceProgram) object).getRequestedLocation());
			 //1IfcSpatialStructureElement
		}
		else if (string.equals("SpaceProgramIdentifier")) {
			resultList.add(((IfcSpaceProgram) object).getSpaceProgramIdentifier());
			 //1String
		}
		else if (string.equals("MaxRequiredAreaAsString")) {
			resultList.add(((IfcSpaceProgram) object).getMaxRequiredAreaAsString());
			 //1String
		}
		else if (string.equals("MinRequiredAreaAsString")) {
			resultList.add(((IfcSpaceProgram) object).getMinRequiredAreaAsString());
			 //1String
		}
		else if (string.equals("StandardRequiredArea")) {
			resultList.add(((IfcSpaceProgram) object).getStandardRequiredArea());
			 //1double
		}
		else if (string.equals("HasInteractionReqsFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getHasInteractionReqsFrom().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getHasInteractionReqsFrom().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasInteractionReqsTo")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getHasInteractionReqsTo().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getHasInteractionReqsTo().get(i));
			}
			 //1EList
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getControls().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSpaceProgram) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceProgram) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSpaceProgram) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSpaceProgram) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSpaceProgram) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSpaceProgram) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSpaceProgram) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSpaceProgram) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
