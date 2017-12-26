package students;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;



public class StudentGetTest {
	
	@BeforeClass
	public static void Init(){
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		
	}
	
	@Test
	public void getInfo(){
				
		Response response = given()
		.when()
		.get("/list");
		
		//System.out.println(response.body().asString());
		// asString() -> complete string will be printed in  a single line
		System.out.println(response.body().prettyPrint()); 
		//prettyPrint will print the output in a good format
		
		
		
		//To validate Status Code 
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
		
	}
	@Test
	public void getStudentInfo(){
		/* Response response = given()
				.when()
				.get("/List?programme = Computer Science");
		System.out.println(response.body().prettyPeek()); 
		*/
		
		Response response =given()
		.param("programme", "Computer Science")  //shows how many computer science students are there
		.when()
		.get("/list");
		
		System.out.println(response.prettyPeek());
	}



	
	}


	
	
	


