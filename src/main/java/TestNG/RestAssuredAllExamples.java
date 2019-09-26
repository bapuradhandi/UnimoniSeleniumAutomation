package TestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAllExamples {
	
	@Test
	public void restExample() {
		
		//open the baseURL
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
		
		//create request object
		RequestSpecification request = RestAssured.given();
		
		//create response object
		Response response = request.request(Method.GET, "/Hyderabad");
		
		//displaying the response
		String responseStr = response.getBody().asString();
		System.out.println(responseStr);
		
		//displaying status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		//displaying status line
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		
	}

}
