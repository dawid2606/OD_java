package jax_rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.Spectacle;
import jpa.SpectacleHandler;

@Path("/Spectacles/")
public class SpectacleJaxRs {
	
	public SpectacleJaxRs(){
		
	}
	
	@GET
	//@Path("/getAllSpectacles")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Spectacle> getAllSpectacles() {
		SpectacleHandler sr=new SpectacleHandler();
		return sr.getAllSpectacles();
	}

}
