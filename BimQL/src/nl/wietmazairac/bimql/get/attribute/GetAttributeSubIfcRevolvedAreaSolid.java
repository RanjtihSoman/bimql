package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRevolvedAreaSolid {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRevolvedAreaSolid(Object object, String string) {
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
		if (string.equals("Angle")) {
			resultList.add(((IfcRevolvedAreaSolid) object).getAngle());
			 //1double
		}
		else if (string.equals("AngleAsString")) {
			resultList.add(((IfcRevolvedAreaSolid) object).getAngleAsString());
			 //1String
		}
		else if (string.equals("Axis")) {
			resultList.add(((IfcRevolvedAreaSolid) object).getAxis());
			 //1IfcAxis1Placement
		}
		else if (string.equals("SweptArea")) {
			resultList.add(((IfcRevolvedAreaSolid) object).getSweptArea());
			 //2IfcProfileDef
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRevolvedAreaSolid) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcRevolvedAreaSolid) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRevolvedAreaSolid) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRevolvedAreaSolid) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRevolvedAreaSolid) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRevolvedAreaSolid) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
