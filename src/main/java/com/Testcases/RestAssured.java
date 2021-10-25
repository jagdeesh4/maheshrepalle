package com.Testcases;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.ResponseOptions;
import io.restassured.response.Response;
 import static io.restassured.RestAssured.given;

public class RestAssured {
@Test
	public void test12()
    {
		String url="https://dog.ceo/api/breeds/image/random";
		
		ExtractableResponse<Response> res1= given().contentType("application/json").when()
				.get(url).then().extract();
		
		@SuppressWarnings("unchecked")
		String resp=((ResponseOptions<Response>) res1).getBody().asString();
		System.out.println(resp);
		
		@SuppressWarnings("unchecked")
		int code=((ResponseOptions<Response>) res1).getStatusCode();
		System.err.println(code);
		
		JsonPath js=new JsonPath(resp);
		System.err.println(js.getString("status"));
		
	
	
	}
}
