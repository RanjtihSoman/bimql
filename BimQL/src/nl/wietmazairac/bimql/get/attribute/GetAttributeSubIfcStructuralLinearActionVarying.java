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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLinearActionVarying;

public class GetAttributeSubIfcStructuralLinearActionVarying {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLinearActionVarying(Object object, String string) {
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
		if (string.equals("VaryingAppliedLoadLocation")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getVaryingAppliedLoadLocation());
			 //1IfcShapeAspect
		}
		else if (string.equals("SubsequentAppliedLoads")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getSubsequentAppliedLoads().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getSubsequentAppliedLoads().get(i));
			}
			 //1EList
		}
		else if (string.equals("ProjectedOrTrue")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getProjectedOrTrue());
			 //2IfcProjectedOrTrueLengthEnum
		}
		else if (string.equals("CausedBy")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getCausedBy());
			 //3IfcStructuralReaction
		}
		else if (string.equals("DestabilizingLoad")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getDestabilizingLoad());
			 //3Tristate
		}
		else if (string.equals("AppliedLoad")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getAppliedLoad());
			 //3IfcStructuralLoad
		}
		else if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getGlobalOrLocal());
			 //3IfcGlobalOrLocalEnum
		}
		else if (string.equals("AssignedToStructuralItem")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getAssignedToStructuralItem());
			 //3IfcRelConnectsStructuralActivity
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearActionVarying) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralLinearActionVarying) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralLinearActionVarying) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
