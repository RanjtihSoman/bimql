package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTask {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTask(Object object, String string) {
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
		if (string.equals("TaskId")) {
			resultList.add(((IfcTask) object).getTaskId());
			 //1String
		}
		else if (string.equals("WorkMethod")) {
			resultList.add(((IfcTask) object).getWorkMethod());
			 //1String
		}
		else if (string.equals("IsMilestone")) {
			resultList.add(((IfcTask) object).getIsMilestone());
			 //1Tristate
		}
		else if (string.equals("Priority")) {
			resultList.add(((IfcTask) object).getPriority());
			 //1int
		}
		else if (string.equals("Status")) {
			resultList.add(((IfcTask) object).getStatus());
			 //1String
		}
		else if (string.equals("OperatesOn")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getOperatesOn().size(); i++) {
				resultList.add(((IfcTask) object).getOperatesOn().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsSuccessorFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getIsSuccessorFrom().size(); i++) {
				resultList.add(((IfcTask) object).getIsSuccessorFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsPredecessorTo")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getIsPredecessorTo().size(); i++) {
				resultList.add(((IfcTask) object).getIsPredecessorTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcTask) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcTask) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTask) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTask) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTask) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTask) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTask) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTask) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTask) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTask) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTask) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTask) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
