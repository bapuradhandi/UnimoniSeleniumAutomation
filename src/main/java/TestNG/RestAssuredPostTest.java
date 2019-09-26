package TestNG;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPostTest {

	@Test
	public void restAssuredPostTest() {
		
		
		//specify base URI
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
		
		//creating a request object
		RequestSpecification request = RestAssured.given();
		
		//create JsonObject
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("name","testbapuRadhandi11");
		requestParams.addProperty("salary", "72358");
		requestParams.addProperty("age", "30");
		
		request.body(requestParams.toString());

		
		//creating a response object
		Response response = request.request(Method.POST, "/create");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
}
}
