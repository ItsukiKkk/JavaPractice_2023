
public class Monkey1 {
	int age;
	int ability;
	void killNiu(){
		System.out.println("��ɱţħ��");
	}
	void reply(int money){
		System.out.println("��ʦ����"+money+"Ԫ��������");
	}
	int buy(int money, int price){
		reply(money/2);
		int count = 0;
		return money/2/price;

	}
}
