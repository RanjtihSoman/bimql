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

import org.bimserver.models.ifc2x3tc1.IfcTextStyleFontModel;

public class GetAttributeSubIfcTextStyleFontModel {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyleFontModel(Object object, String string) {
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
		if (string.equals("FontStyle")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontStyle());
			 //1String
		}
		else if (string.equals("FontVariant")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontVariant());
			 //1String
		}
		else if (string.equals("FontWeight")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontWeight());
			 //1String
		}
		else if (string.equals("FontFamily")) {
			//3xxx
			for (int i = 0; i < ((IfcTextStyleFontModel) object).getFontFamily().size(); i++) {
				resultList.add(((IfcTextStyleFontModel) object).getFontFamily().get(i));
			}
			 //1EList
		}
		else if (string.equals("FontSize")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontSize());
			 //1IfcSizeSelect
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTextStyleFontModel) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
