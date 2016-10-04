package com.med;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/OperationService")
public class OperationService {

	@GET
	@Path("/operation")
	@Produces(MediaType.APPLICATION_XML)
	public String getOperation() {
		return "";
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String add(@FormParam("a") double a, @FormParam("b") double b, @Context HttpServletResponse servletResponse)
			throws IOException {
		return "<result>" + (a + b) + "</result>";
	}

	@POST
	@Path("/substract")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String substract(@FormParam("a") double a, @FormParam("b") double b,
			@Context HttpServletResponse servletResponse) throws IOException {
		return "<result>" + (a - b) + "</result>";
	}

	@POST
	@Path("/multiply")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String multiply(@FormParam("a") double a, @FormParam("b") double b,
			@Context HttpServletResponse servletResponse) throws IOException {
		return "<result>" + (a * b) + "</result>";
	}

	@POST
	@Path("/divide")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String divide(@FormParam("a") double a, @FormParam("b") double b,
			@Context HttpServletResponse servletResponse) throws IOException {
		return "<result>" + (a / b) + "</result>";
	}

	@OPTIONS
	@Path("/operation")
	@Produces(MediaType.APPLICATION_XML)
	public String getSupportedOperations() {
		return "<operations>GET, POST</operations>";
	}
}