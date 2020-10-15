package stud.studRest;

public class Project 
{
	private int pno,dur;
	private String name,platform;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	@Override
	public String toString() {
		return "Project [Pno=" + pno + ", dur=" + dur + ", name=" + name
				+ ", platform=" + platform + "]";
	}
	
}
