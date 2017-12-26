package students;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import student.Model.Student;

public class StudentPatchTest {
	@BeforeClass
	public static void Init(){
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
}
	@Test
	public void updateStudent(){
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Selenium");
		courses.add("cucumber");
		courses.add("JAVA");
		courses.add("Rest Assured");
		
		Student student = new Student();
		student.setFirstName("RR");
		student.setLastName("Reddy");
		student.setEmail("rojareddy@gmail.com");
		student.setProgramme("Computer Sceince");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.patch("/101")
		.then()
		.statusCode(200);
		
	}
}




