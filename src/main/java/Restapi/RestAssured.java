package Restapi;

import org.testng.annotations.Test;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.given;

public class RestAssured {
	
	@Test
	public void response()
	{
		String url="/api/users?page=2";
		ExtractableResponse<Response> res=given().contentType("application/json").when()
				.get(url).then().extract();
		
		@SuppressWarnings("unchecked")
		String res1=((ResponseOptions<Response>) res).getBody().asString();
		System.out.println("res1");
				
		
		
		
		
	}

}
