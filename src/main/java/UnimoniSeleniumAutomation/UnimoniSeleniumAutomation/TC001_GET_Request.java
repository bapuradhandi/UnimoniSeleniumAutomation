package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
		
		@Test
		public void getWeatherDetails() {
			
			//specify baseURI
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
			
			//Request object
			RequestSpecification httpRequest = RestAssured.given();
			
			//Response object
			Response response = httpRequest.request(Method.GET, "/Hyderabad");
			
			System.out.println(response);
			System.out.println(response.getBody());
			
			String responseBody = response.getBody().asString();
			System.out.println("response body is: " +responseBody);
			
			//status code validation
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			
			//status line validation
			String statusLine = response.getStatusLine();
			System.out.println(statusLine);
			Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
			
		}


	
}
