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

import org.bimserver.models.ifc2x3tc1.IfcWaterProperties;

public class GetAttributeSubIfcWaterProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWaterProperties(Object object, String string) {
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
		if (string.equals("IsPotable")) {
			resultList.add(((IfcWaterProperties) object).getIsPotable());
			 //1Tristate
		}
		else if (string.equals("Hardness")) {
			resultList.add(((IfcWaterProperties) object).getHardness());
			 //1double
		}
		else if (string.equals("PHLevel")) {
			resultList.add(((IfcWaterProperties) object).getPHLevel());
			 //1double
		}
		else if (string.equals("HardnessAsString")) {
			resultList.add(((IfcWaterProperties) object).getHardnessAsString());
			 //1String
		}
		else if (string.equals("ImpuritiesContent")) {
			resultList.add(((IfcWaterProperties) object).getImpuritiesContent());
			 //1double
		}
		else if (string.equals("PHLevelAsString")) {
			resultList.add(((IfcWaterProperties) object).getPHLevelAsString());
			 //1String
		}
		else if (string.equals("AlkalinityConcentration")) {
			resultList.add(((IfcWaterProperties) object).getAlkalinityConcentration());
			 //1double
		}
		else if (string.equals("AcidityConcentration")) {
			resultList.add(((IfcWaterProperties) object).getAcidityConcentration());
			 //1double
		}
		else if (string.equals("ImpuritiesContentAsString")) {
			resultList.add(((IfcWaterProperties) object).getImpuritiesContentAsString());
			 //1String
		}
		else if (string.equals("DissolvedSolidsContent")) {
			resultList.add(((IfcWaterProperties) object).getDissolvedSolidsContent());
			 //1double
		}
		else if (string.equals("AlkalinityConcentrationAsString")) {
			resultList.add(((IfcWaterProperties) object).getAlkalinityConcentrationAsString());
			 //1String
		}
		else if (string.equals("AcidityConcentrationAsString")) {
			resultList.add(((IfcWaterProperties) object).getAcidityConcentrationAsString());
			 //1String
		}
		else if (string.equals("DissolvedSolidsContentAsString")) {
			resultList.add(((IfcWaterProperties) object).getDissolvedSolidsContentAsString());
			 //1String
		}
		return resultList;
	}
}
