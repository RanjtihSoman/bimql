package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.store.RenderEnginePluginDescriptor;

public class GetAttributeSubIfcEnginePluginDescriptor {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEnginePluginDescriptor(Object object, String string) {
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
		if (string.equals("PluginClassName")) {
			resultList.add(((RenderEnginePluginDescriptor) object).getPluginClassName());
			 //1String
		}
		else if (string.equals("DefaultName")) {
			resultList.add(((RenderEnginePluginDescriptor) object).getName());
			 //1String
		}
		return resultList;
	}
}
