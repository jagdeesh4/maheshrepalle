package com.Testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.assertion.BodyMatcher;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.given;

public class restapisample1 {
	@Test
	public void test11()
	{
		
		String serviceurl ="https://dog.ceo/api/breeds/image/random";
		 
		ExtractableResponse<Response> res= given()
				//.config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()))
				.contentType("application/json")
				.when().get(serviceurl).then().extract();
		
		
	@SuppressWarnings("unchecked")
	String val = ((ResponseOptions<Response>)res).getBody().asString();
	@SuppressWarnings("unchecked")
	int code = ((ResponseOptions<Response>)res).getStatusCode();
	System.out.println(val);
	System.err.println(code);	
	
	JsonPath txt11= new JsonPath(val);
	
	System.err.println(txt11.get("status"));
		
	}

}
