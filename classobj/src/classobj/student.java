package classobj;

public class student {
	private int  sid= 25;
	private String sname= "akaza";
	private String city = "usa";
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}
	
	
}



