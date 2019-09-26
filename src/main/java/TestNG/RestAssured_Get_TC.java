package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Get_TC {
	
	@Test
	public void restAssuredGetTC() {
		
		System.setProperty("http.ProxyHost", "http://webproxy.uaeexchange.com");
		System.setProperty("http.ProxyPort", "8080");
		
		//specify BaseURI
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/employee/";
		
		//creatinga request object
		RequestSpecification request = RestAssured.given();
		
		//creating a response object
		Response response = request.request(Method.GET, "/56210");
		
		//reading the jsonb
		System.out.println(response.getBody());
		
		//displaying statuscode
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(200, statusCode);
		
		//displaying statusline
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
	}

}
