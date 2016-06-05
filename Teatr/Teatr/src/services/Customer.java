package services;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import ejb.CustomerManager;
import ejb.CustomerManagerInt;
import ejb.CustomerManagerInterface;

@Path("customer")
public class Customer {

	@EJB
	public CustomerManager customerManager;
	
	public Customer(){
		
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getCustomer(){
		return "<h3>Customer count: "+customerManager.getCustomerCount()+"</h3>";
		
	}
	@GET
	@Path("int")
	@Produces(MediaType.TEXT_HTML)
	public String getCustomerCountInt(){

		return "<h3>Customer count: "+customerManager.getCustomerCount()+"</h3>";
		
	}
	
}
