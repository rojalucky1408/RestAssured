package students;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import student.Model.Student;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;


public class StudentPostTest {
	@BeforeClass
	public static void Init(){
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
}
	@Test
	public void createNewStudent(){
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Selenium");
		courses.add("cucumber");
		
		Student student = new Student();
		student.setFirstName("Roja");
		student.setLastName("Reddy");
		student.setEmail("roja@gmail.com");
		student.setProgramme("Computer Sceince");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(200);
		
	}
	@Test
	public void createNewStuden1(){
		ArrayList<String> courses = new ArrayList<>();
		courses.add("mechanics");
		
		
		Student student = new Student();
		student.setFirstName("pallavi");
		student.setLastName("vittu");
		student.setEmail("vittu@gmail.com");
		student.setProgramme("Mechanical Engineering");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(200);
		
	}
}