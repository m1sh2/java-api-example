package it.datsko;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import org.json.JSONException;
import org.json.JSONObject;
//import javax.json.stream.JsonGenerator;

@Path("/user-service") 

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
//   @Produces(MediaType.APPLICATION_XML)
   @Produces("text/plain")
//   @Produces("application/json")
   public String getUser() {
	  return "Hello World!!!!";
   }
   
   @GET
   @Path("/users/john")
   @Produces("application/json")
   public String User() throws JSONException {
	   return new JSONObject()
			   .put("name", "John")
			   .put("surname", "Smith")
			   .put("city", "New York")
			   .put("country", "U.S.A.")
			   .put("phone", "+1111111111")
			   .put("email", "email.email@email.email")
			   .toString();
   }
   
   public List<User> getUsers(){ 
      return userDao.getAllUsers();
   }  
}
