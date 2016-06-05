package rest4;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.eclipse.jdt.internal.compiler.classfmt.FieldInfo;


import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jackson.*;

@Path("/v1/status/")
public class vb_status {
	@Path("{varX}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User returnTitle(@PathParam("varX") Integer varx){
		ObjectMapper mapper = new ObjectMapper();
		UserFactory factory = new UserFactory(varx);
		User user = factory.getUser();
		//JsonStringBuilder s = new JsonStringBuilder(user);
		//return s.toString();
		
		return user;
	} 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String returnJsona(String incomingData){
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			User itemEntry = mapper.readValue(incomingData, User.class);
			return itemEntry.toString();
		}
		catch(Exception ex)
		{
			return "{ \"Blad\" : \"kurwa exception\" }";
		}
		
		//return "{ \"Blad\" : \"kurwa\" }";
	}
}
