import java.util.Scanner;

public class sss {
	public static void main(String[] args) {
		int i = 0;
		PersonalCart []carts = new PersonalCart[100];
		Scanner sc = new Scanner(System.in);
		int fruitId = sc.nextInt();
		int fruitAmount = sc.nextInt();
		Fruit []fruits = new Fruit[6];
		fruits[0] = new Fruit(1,"苹果",100.0,20);
		fruits[1] = new Fruit(2,"菠萝",100.0,100);
		fruits[2] = new Fruit(3,"菠萝",50.0,100);
		fruits[3] = new Fruit(4,"车厘子",20.0,100);
		fruits[4] = new Fruit(5,"芒果",100.0,100);
		fruits[5] = new Fruit(6,"提子",50.0,150);

				carts[i] = new PersonalCart();
				carts[i].setNumber(fruitId - 1);
				carts[i].setAmount(fruitAmount);
				// fruitId 水果编号找对应价格的计算方法
				switch (fruitId) {
			    case 1:
			        carts[ i  ].setPrice1(fruitAmount);
			        break;
			    case 2:
			        carts[i].setPrice2(fruitAmount);
			        break;
			    case 3:
			        carts[i].setPrice3(fruitAmount);
			        break;
			    case 4:
			        carts[i].setPrice4(fruitAmount);
			        break;
			    case 5:
			        carts[i].setPrice5(fruitAmount);
			        break;
			    case 6:
			        carts[i].setPrice6(fruitAmount);
			        break;
			    }
				carts[i].setFruitName(fruits[fruitId - 1].fruitName);
				i++;
			System.out.println("好");
	}
}
