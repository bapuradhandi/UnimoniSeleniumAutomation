package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetTest {
	
	@Test
	public void getTest() {
		
		//Specify Base URI
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee";
		
		//creating a Request object
		RequestSpecification request = RestAssured.given();
		
		//creating a Response object
		Response response = request.request(Method.GET, "/55689");
		
		//displaying the jsonbody
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		//displaying status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, "200");
		
		//displaying status line
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
}

}