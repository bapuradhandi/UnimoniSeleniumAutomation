package TestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDeleteTest {
	
	@Test
	public void restDeleteTest() {
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.request(Method.DELETE, "/delete/72396");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
	}

}
