package jaxRs;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.jdt.internal.compiler.classfmt.FieldInfo;

import entities.Spectacle;
import jpa.SpectacleHandler;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;


@Path("/v1/status/") ///{varX}
public class vb_status {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnTitle(){
		
		User user = new User();
		user.setId(2);
		user.setName("Ola");
		
		return user.toString();}
	
	@POST 
	@Path("post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User returnJsona(String incomingData){
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			User itemEntry = mapper.readValue(incomingData, User.class);
			return itemEntry;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
		
		//return "{ \"Blad\" : \"kurwa\" }";
	}
	
	
}
