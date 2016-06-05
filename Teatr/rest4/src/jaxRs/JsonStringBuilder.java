
package jaxRs;

import java.lang.reflect.Field;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
public class JsonStringBuilder {
	Object o;
	public JsonStringBuilder(Object o){
		this.o = o;
	}
	
	public String toString(){

		JSONObject obj = new JSONObject();
		String result = "";
		try {
			Field[] fields = o.getClass().getDeclaredFields();
			for(Field field : fields){
				obj.put(field.getName(), field.get(o));
				result = obj.toString();
		}
		
	} catch (JSONException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
	}
}