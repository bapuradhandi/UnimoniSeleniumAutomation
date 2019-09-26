package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Register_Customer_API {
	
	
	@Test
	public void registerCustomer() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		
		//creating a request object
		RequestSpecification httprequest = RestAssured.given();
		
		JsonObject requestParams = new JsonObject();
		
		  requestParams.addProperty("FirstName","Bapu102");
		  requestParams.addProperty("LastName","Radhandi03");
		  requestParams.addProperty("UserName","BRadhandi02");
		  requestParams.addProperty("Password","rajabapu@123");	
		  requestParams.addProperty("Email","bradhandi134@gmail.com");
		  
		  httprequest.body(requestParams.toString());
		  
		  //Response object
		  Response response = httprequest.request(Method.POST,"/register");
		  
		//print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		  Assert.assertEquals(successCode, "OPERATION_SUCCESS");
		  
		  
	}

}
