
public class Monkey3 {
	int age;
	int ability;
	Monkey3(int a){
		age = a;
		System.out.println("�����ǣ�"+age);
	}
	Monkey3(){
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
