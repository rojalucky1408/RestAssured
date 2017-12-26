package students;

import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class StudentDeletteTest {
	@BeforeClass
	public static void Init(){
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
}
	@Test
	public void DeleteStudent(){
	
		given()
		.when()
		.delete("/113")
		.then()
		.statusCode(204);
	
	
	
	}
}

