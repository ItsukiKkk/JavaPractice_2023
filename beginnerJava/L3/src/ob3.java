import java.util.Scanner;
public class ob3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int a = sc.nextInt();
		int j = 1;
		if(a > 0){
			for (int i = 1; i <= a; i++) {
				j = j*i;
			}
			System.out.println(a+"�Ľ׳�Ϊ"+j);
		}
		sc.close();
	}
}
