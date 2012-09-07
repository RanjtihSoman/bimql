package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPath {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPath(Object object, String string) {
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
		if (string.equals("EdgeList")) {
			//3xxx
			for (int i = 0; i < ((IfcPath) object).getEdgeList().size(); i++) {
				resultList.add(((IfcPath) object).getEdgeList().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPath) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPath) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPath) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPath) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
