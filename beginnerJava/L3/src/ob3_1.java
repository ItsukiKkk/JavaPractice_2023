import java.util.Scanner;

public class ob3_1 {
	public static void main(String[] args) {
		int x = 39;
		int n = 0;
		System.out.println("猜测该数字，限5次");
		do{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a == x){
				System.out.println("正确");
			}else{
				System.out.println("错误还剩"+(4-n)+"次机会");
				n++;
			}
		}while(n < 5);
		System.out.println("尝试次数已用完");
	}
}
