
public class Monkey2 {
	int age;
	int ability;
	Monkey2(){
		System.out.println("构造方法被调用");
	}
	void killNiu(){
		System.out.println("刺杀牛魔王");
	}
	void repay(int money){
		System.out.println("代师傅把"+money+"元还给观音");
	}
	int buy(int money, int price){
		repay(money/2);
		int count = 0;
		return money/2/price;

	}
}
