package UnimoniSeleniumAutomation.UnimoniSeleniumAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestDeleteTC {
	
	@Test
	public void restDeleteTC() {
		
		//baseURI
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		//response object
		Response response = request.request(Method.DELETE, "/delete/56232");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	}

}
