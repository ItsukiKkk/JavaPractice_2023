
public class User {
	String name,pw,sex,phone;
	int money;
	public User(String name, String pw, String sex, String phone,int money) {
		super();
		this.name = name;
		this.pw = pw;
		this.sex = sex;
		this.phone = phone;
		this.money = money;
	}
	public User(){
		
	}
	public String getName(){
		return name;
	}
	public String getPw(){
		return pw;
	}
	public String getSex(){
		return sex;
	}
	public String getPhone(){
		return phone;
	}
	public String setName(String name){
		this.name = name;
		return name;
	}
	public String setPw(String pw){
		this.pw = pw;
		return pw;
	}
	public String setSex(String sex){
		this.sex = sex;
		return sex;
	}
	public String setPhone(String phone){
		this.phone = phone;
		return phone;
	}
	public int setMoney(int money){
		if(money < 500 && money > 300){
			this.money = money + 20;
		}else if(money > 500){
			this.money = money + 50;
		}else{
			this.money = money;
		}
		return money;
	}
	public int getMoney(){
		return money;
	}
}
