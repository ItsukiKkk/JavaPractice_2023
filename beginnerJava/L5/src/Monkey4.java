
public class Monkey4 {

	int age;
	int ability;
	Monkey4(int a){
		age = a;
		System.out.println("年龄是："+age);
	}
	Monkey4(){
		
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


