package rest4;

import java.lang.reflect.*;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class User extends JsonStringBuilder{

	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String name;
	
	
	public String toString(){
		return "User [ id="+ id + ", name="+ name + "]";
	}
    
}