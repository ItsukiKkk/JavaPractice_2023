
public class Monkey2 {
	int age;
	int ability;
	Monkey2(){
		System.out.println("���췽��������");
	}
	void killNiu(){
		System.out.println("��ɱţħ��");
	}
	void repay(int money){
		System.out.println("��ʦ����"+money+"Ԫ��������");
	}
	int buy(int money, int price){
		repay(money/2);
		int count = 0;
		return money/2/price;

	}
}
