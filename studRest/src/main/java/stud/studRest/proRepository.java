package stud.studRest;
import java.sql.*;
import java.util.*;
public class proRepository
{
	Connection con=null;
	
	public proRepository()
	{
		String url="jdbc:mysql://localhost:3306/student_project";
		String username="root";
		String password="root";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public List<Project> getProjects()
	{
		List<Project> projects = new ArrayList<>();
		String sql="select * from PROJECT";
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Project p = new Project();
				p.setPno(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDur(rs.getInt(3));
				p.setPlatform(rs.getString(4));
				projects.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return projects;
	}
	
	public void create(Project p1)
	{
		String sql = "insert into PROJECT values(?,?,?,?)";
		try
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,p1.getPno());
			st.setString(2,p1.getName());
			st.setInt(3,p1.getDur());
			st.setString(4,p1.getPlatform());
			st.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void update(Project p1)
	{
		String sql = "update PROJECT set PRJ_NAME=?,PRJ_DUR=?,PRJ_PLATFORM=? where PRJ_NO=?";
		try
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, p1.getName());
			st.setInt(2, p1.getDur());
			st.setString(3, p1.getPlatform());
			st.setInt(4, p1.getPno());
			st.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public Project getProject(int pno) 
	{
		List<Project> projects = new ArrayList<>();
		String sql="select * from PROJECT";
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Project p = new Project();
				p.setPno(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDur(rs.getInt(3));
				p.setPlatform(rs.getString(4));
				projects.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(Project p : projects)
		{
			if(p.getPno()==pno)
				return p;
		}
		
		return null ;
	}
	
	public void delete(int pno) {
		String sql = "delete from PROJECT where PRJ_NO=?";
		try
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,pno);
			st.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
