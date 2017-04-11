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

import org.bimserver.models.ifc2x3tc1.IfcSlab;

public class GetAttributeSubIfcSlab {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSlab(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcSlab) object).getPredefinedType());
			 //1IfcSlabTypeEnum
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcSlab) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcSlab) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcSlab) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcSlab) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcSlab) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasPorts().size(); i++) {
				resultList.add(((IfcSlab) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcSlab) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcSlab) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcSlab) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasProjections().size(); i++) {
				resultList.add(((IfcSlab) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcSlab) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcSlab) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSlab) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcSlab) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcSlab) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcSlab) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSlab) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSlab) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSlab) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSlab) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSlab) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSlab) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSlab) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSlab) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSlab) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSlab) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSlab) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSlab) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
