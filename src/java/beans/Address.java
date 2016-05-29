package beans;


public class Address {
	
	private String name;
	private String christianname;
	private String email;
	private String mobil;
	
	public Address () {
		this.name="";
		this.christianname="";
		this.email="";
		this.mobil="";
	}
	
	public Address (String name, String christianname, String email, String mobil) {
		this.name=name;
		this.christianname=christianname;
		this.email=email;
		this.mobil=mobil;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChristianname() {
		return christianname;
	}
	public void setChristianname(String christianname) {
		this.christianname = christianname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobil() {
		return mobil;
	}
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	
	

}
