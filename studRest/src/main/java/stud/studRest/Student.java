package stud.studRest;
import java.util.*;


public class Student {
	private int Sno;
	private String name;
	private Date dob,doj;
	
	
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Student [Sno=" + Sno + ", name=" + name + ", dob=" + dob
				+ ", doj=" + doj + "]";
	}
    
}
