package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralSurfaceMember {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralSurfaceMember(Object object, String string) {
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
			resultList.add(((IfcStructuralSurfaceMember) object).getPredefinedType());
			 //1IfcStructuralSurfaceTypeEnum
		}
		else if (string.equals("ThicknessAsString")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getThicknessAsString());
			 //1String
		}
		else if (string.equals("Thickness")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getThickness());
			 //1double
		}
		else if (string.equals("ReferencesElement")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getReferencesElement().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getReferencesElement().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getConnectedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getConnectedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getAssignedStructuralActivity().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMember) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMember) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralSurfaceMember) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
