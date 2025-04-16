
public class Monkey1 {
	int age;
	int ability;
	void killNiu(){
		System.out.println("刺杀牛魔王");
	}
	void reply(int money){
		System.out.println("代师傅把"+money+"元还给观音");
	}
	int buy(int money, int price){
		reply(money/2);
		int count = 0;
		return money/2/price;

	}
}
