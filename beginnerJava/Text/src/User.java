
public class User {
	String name;
	String pw;
	String email;
	public User(String name,String pw,String email) {
		super();
		this.name = name;
		this.pw = pw;
		this.email = email;
	}
	public User() {
		super();
	}
	public void setPw(String pw){
		this.pw = pw;
	}

}
