package com.learn.myrest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class HelloWorld {
	@PathParam("id") String id;
	@PathParam("name") String name;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String displayHelloWorld()
	{
		return "Success HelloWorld";
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/id={id}&name={name}")
	public String displayHelloWorldWithParam()
	{
		
		return "Success HelloWorld with Param "+id + " name : "+name;
	}
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String displayHelloWorld1(@FormParam("id") String id, @FormParam("name") String name)
	{
		return "Success HelloWorld post with id " + id + " name : " + name;
	}
}
