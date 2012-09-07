package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcMechanicalFastener {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMechanicalFastener(Object object, String string) {
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
		if (string.equals("NominalDiameterAsString")) {
			resultList.add(((IfcMechanicalFastener) object).getNominalDiameterAsString());
			 //1String
		}
		else if (string.equals("NominalLengthAsString")) {
			resultList.add(((IfcMechanicalFastener) object).getNominalLengthAsString());
			 //1String
		}
		else if (string.equals("NominalDiameter")) {
			resultList.add(((IfcMechanicalFastener) object).getNominalDiameter());
			 //1double
		}
		else if (string.equals("NominalLength")) {
			resultList.add(((IfcMechanicalFastener) object).getNominalLength());
			 //1double
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasPorts().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasProjections().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcMechanicalFastener) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcMechanicalFastener) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcMechanicalFastener) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcMechanicalFastener) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getDecomposes().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastener) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcMechanicalFastener) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcMechanicalFastener) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcMechanicalFastener) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcMechanicalFastener) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcMechanicalFastener) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcMechanicalFastener) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
