package TestNG;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUpdateTC {
	
	@Test
	public void restUpdateTC() {
		
		//baseURI
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		//creating a jsonobject
		JsonObject jsonParams = new JsonObject();
		
		jsonParams.addProperty("name","BapuNewTestNew");
		jsonParams.addProperty("salary","10009");
		jsonParams.addProperty("age","31");
		
		//updating a jsonrecord
		request.body(jsonParams.toString());
		
		//response object
		Response response = request.request(Method.PUT, "/update/75159");
		
		System.out.println(response.getBody().asString());
		
		//status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		//status line
		String statusLine = response.statusLine();
		System.out.println(statusLine);
	}

}
