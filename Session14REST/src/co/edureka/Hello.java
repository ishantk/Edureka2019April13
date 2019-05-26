package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer; -> Configure ServletContainer API in web.xml file

@Path("/hello")
public class Hello { // Web Service
	

	@GET
	@Produces(MediaType.TEXT_PLAIN) // Type of Response to be shared back to Client
	public String sayPlainHello(){ // Web Method
		String response = "This is plain hello form RESTful Web Service";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){ // Web Method
		String response = "<html><body><h3>This is HTML hello form RESTful Web Service</h3></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){ // Web Method
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>This is XML hello form RESTful Web Service</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){ // Web Method
		String response = "{'message':'This is JSON hello form RESTful Web Service'}";
		return response;
	}
	
}
