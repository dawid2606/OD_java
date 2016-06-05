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


@Path("/v1/status/{varX}") ///{varX}
public class vb_status {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnTitle(@PathParam("varX") Integer varx){
		
		UserFactory factory = new UserFactory(varx);
		User user = factory.getUser();
		JsonStringBuilder s = new JsonStringBuilder(user);
		return s.toString();	
	}
	
	
}