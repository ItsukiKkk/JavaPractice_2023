package task;

public class User {
	String name;
	String pw;
	String phone;
	double charge;
	String title;
	double discount;
	public User(String name, String pw, String phone, double charge, String title,double discount) {
		super();
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.charge = charge;
		this.title = title;
		this.discount = discount;
	}
	public User() {
		super();
	}
	
}
