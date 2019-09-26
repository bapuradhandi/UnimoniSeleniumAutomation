package TestNG;

import io.restassured.http.Method;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUpdateTest {
	
	@Test
	public void updateTest() {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
		
		RequestSpecification request = RestAssured.given();
		

		
		JsonObject jsonParams = new JsonObject();
		
		jsonParams.addProperty("name", "BapuLatest");
		jsonParams.addProperty("salary", "10000");
		jsonParams.addProperty("age", "31");
		
		request.body(jsonParams.toString());
		
		Response response = request.request(Method.PUT, "/update/55704");
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
	}

}
