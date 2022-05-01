package com.jersey.jjersey;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mybook")
public class myBookResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<myBook> myBookMethod() 
	{
		Connection con=dbConnection.createNewDBconnection();
		myBook m1=new myBook();
		System.out.println("working");
		m1.setBodkId(0);
		m1.setBook("history");
		
		myBook a2=new myBook();
		a2.setBodkId(1);
		a2.setBook("economics");
		
		List<myBook> list=new ArrayList();
		list.add(m1);
		list.add(a2);
		
		
		
		
		return (List<myBook>) list;
	}

}
