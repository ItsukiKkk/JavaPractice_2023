import java.util.Scanner;
public class ob2_2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("��������a");
		int a = sc1.nextInt();
		System.out.println("��������b");
		int b = sc2.nextInt();
		System.out.println("����һ������");
		String s = sc.next();
		switch (s) {
		case "+":
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*":
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case "/":
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		default:
			System.out.println("�������");
			break;
		}
		sc.close();
		sc1.close();
		sc2.close();
	}
}
