import java.util.Scanner;

public class ob3_1 {
	public static void main(String[] args) {
		int x = 39;
		int n = 0;
		System.out.println("�²�����֣���5��");
		do{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a == x){
				System.out.println("��ȷ");
			}else{
				System.out.println("����ʣ"+(4-n)+"�λ���");
				n++;
			}
		}while(n < 5);
		System.out.println("���Դ���������");
	}
}
