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

import org.bimserver.models.ifc2x3tc1.IfcWindowPanelProperties;

public class GetAttributeSubIfcWindowPanelProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWindowPanelProperties(Object object, String string) {
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
		if (string.equals("FrameDepthAsString")) {
			resultList.add(((IfcWindowPanelProperties) object).getFrameDepthAsString());
			 //1String
		}
		else if (string.equals("FrameThicknessAsString")) {
			resultList.add(((IfcWindowPanelProperties) object).getFrameThicknessAsString());
			 //1String
		}
		else if (string.equals("OperationType")) {
			resultList.add(((IfcWindowPanelProperties) object).getOperationType());
			 //1IfcWindowPanelOperationEnum
		}
		else if (string.equals("FrameDepth")) {
			resultList.add(((IfcWindowPanelProperties) object).getFrameDepth());
			 //1double
		}
		else if (string.equals("FrameThickness")) {
			resultList.add(((IfcWindowPanelProperties) object).getFrameThickness());
			 //1double
		}
		else if (string.equals("PanelPosition")) {
			resultList.add(((IfcWindowPanelProperties) object).getPanelPosition());
			 //1IfcWindowPanelPositionEnum
		}
		else if (string.equals("ShapeAspectStyle")) {
			resultList.add(((IfcWindowPanelProperties) object).getShapeAspectStyle());
			 //1IfcShapeAspect
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcWindowPanelProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcWindowPanelProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcWindowPanelProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcWindowPanelProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWindowPanelProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWindowPanelProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWindowPanelProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWindowPanelProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWindowPanelProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWindowPanelProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWindowPanelProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
