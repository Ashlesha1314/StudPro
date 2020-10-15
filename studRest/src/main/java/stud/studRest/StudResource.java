package stud.studRest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.*;

@Path("Students")
public class StudResource
{
	studRepository repo = new studRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents()
	{
		return repo.getStudents();
	}
    
	@POST
	@Path("Student")
	@Consumes(MediaType.APPLICATION_JSON)
	public Student createStudent(Student s1)
	{
		System.out.println(s1);
		repo.create(s1);
		return s1;
	}
	
	@PUT
	@Path("Student")
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(Student s1)
	{
		System.out.println(s1);
		repo.update(s1);
		return s1;
	}
	
	@DELETE
	@Path("Student/{Sno}")
	public Student deleteStudent(@PathParam("Sno")int Sno)
	{
		
		Student s = repo.getStudent(Sno);
		if(s.getSno()!=0)
			repo.delete(Sno);
		
		return s;
	}
}
