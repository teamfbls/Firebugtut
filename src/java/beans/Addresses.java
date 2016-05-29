package beans;


import java.util.ArrayList;

public class Addresses {
	
	private ArrayList<Address> data1 = new ArrayList<Address>();
	private ArrayList<Address> data2 = new ArrayList<Address>();
	
	private String page = "1";
	
	public Addresses() {
		data1.add(new Address("Müller", "Peter", "peter.müller@web.de", "01711234567"));
		data1.add(new Address("Schneider", "Annika", "schneider@gmxde", "01717655342"));
		data1.add(new Address("Müller", "Verena", "verena.müller@web.de", "017687231490"));
		data1.add(new Address("Meier", "Kurt", "kurt@meier.de", "017144332211"));
		data2.add(new Address("Schuster", "Herbert", "Herbert.Schuster@web.de", "01711234567"));
		data2.add(new Address("Walter", "Jasmin", "jwalter@gmxde", "01717655342"));
		data2.add(new Address("Braun", "Alexander", "abraun@web.de", "017687231490"));
	}
	
	public ArrayList<Address> getAdresses() {
		if (page.equals("1")) {
			return data1;
		} else {
			return data2;
		}
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

}
