package rest4;

import java.lang.reflect.*;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
public class JsonStringBuilder {
	
	
	protected String buildJson(Field[] fields, Object o){

		JSONObject obj = new JSONObject();
		String result = "";
		try {
			//Field[] fields = this.getClass().getDeclaredFields();
			
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

