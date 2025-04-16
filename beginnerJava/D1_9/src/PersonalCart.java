
public class PersonalCart {
	int number;
	String fruitName;
	double price;
	int amount;
	double unitPrice;
	public PersonalCart() {
		super();
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public String getFruitName(){
		return fruitName;
	}
	public void setFruitName(String fruitName){
		this.fruitName = fruitName;
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice1(int amount){
		this.price = amount*100;
	}
	public void setPrice2(int amount){
		this.price = amount*100;
	}
	public void setPrice3(int amount){
		this.price = amount*50;
	}
	public void setPrice4(int amount){
		this.price = amount*20;
	}
	public void setPrice5(int amount){
		this.price = amount*100;
	}
	public void setPrice6(int amount){
		this.price = amount*50;
	}
	public double printPrice(){
		 switch (number) {
		case 1:
			unitPrice = 100.0;
			break;
		case 2:
			unitPrice = 100.0;
			break;
		case 3:
			unitPrice = 50.0;
			break;
		case 4:
			unitPrice = 20.0;
			break;
		case 5:
			unitPrice = 100.0;
			break;
		case 6:
			unitPrice = 100.0;
			break;
		default:
			break;
		}
		 return unitPrice;
	}
}
