package stud.studRest;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("Projects")
public class ProResource
{
	proRepository repo1 = new proRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> getProjects()
	{
		return repo1.getProjects();
	}
	
	@POST
	@Path("Project")
	@Consumes(MediaType.APPLICATION_JSON)
	public Project createProject(Project p1)
	{
		System.out.println(p1);
		repo1.create(p1);
		return p1;
	}
	
	@PUT
	@Path("Project")
	@Consumes(MediaType.APPLICATION_JSON)
	public Project updateProject(Project p1)
	{
		System.out.println(p1);
		repo1.update(p1);
		return p1;
	}
	
	@DELETE
	@Path("Project/{pno}")
	public Project deleteProject(@PathParam("pno")int pno)
	{
		
		Project p = repo1.getProject(pno);
		if(p.getPno()!=0)
			repo1.delete(pno);
		
		return p;
	}
	

}
