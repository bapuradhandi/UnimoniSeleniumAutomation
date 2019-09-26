package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPostTC {
	
	@Test
	public void restPostTC() {
		
		//baseURI
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/";
		
		//request
		RequestSpecification request = RestAssured.given();
		
		JsonObject jsonParams = new JsonObject();
		jsonParams.addProperty("name","BapuNewTest");
		jsonParams.addProperty("salary","10000");
		jsonParams.addProperty("age","30");
		
		request.body(jsonParams.toString());
		
		Response response = request.request(Method.POST, "/create");
		
		//displaying status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(200, statusCode);
		
		//display statusline
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
		
	}

}
