import java.util.Scanner;
public class work2 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("输入三位数整数");
		double a = sca.nextDouble();
		int b,c,d,sum;
		b = (int)(a/100);
		c = (int)((a-b*100)/10);
		d = (int)(a-b*100-c*10);
		sum = b+c+d;
		System.out.println("个位="+d);
		System.out.println("十位="+c);
		System.out.println("百位="+b);
		System.out.println("个十百位求和"+sum);
	sca.close();
	}
}
