package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRectangularTrimmedSurface {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRectangularTrimmedSurface(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getDim());
			 //1int
		}
		else if (string.equals("BasisSurface")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getBasisSurface());
			 //1IfcSurface
		}
		else if (string.equals("U1AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU1AsString());
			 //1String
		}
		else if (string.equals("V1AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV1AsString());
			 //1String
		}
		else if (string.equals("U2AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU2AsString());
			 //1String
		}
		else if (string.equals("V2AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV2AsString());
			 //1String
		}
		else if (string.equals("U1")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU1());
			 //1double
		}
		else if (string.equals("V1")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV1());
			 //1double
		}
		else if (string.equals("U2")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU2());
			 //1double
		}
		else if (string.equals("V2")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV2());
			 //1double
		}
		else if (string.equals("Usense")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getUsense());
			 //1Tristate
		}
		else if (string.equals("Vsense")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getVsense());
			 //1Tristate
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRectangularTrimmedSurface) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRectangularTrimmedSurface) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRectangularTrimmedSurface) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRectangularTrimmedSurface) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
