import java.util.Scanner;
public class work2 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("������λ������");
		double a = sca.nextDouble();
		int b,c,d,sum;
		b = (int)(a/100);
		c = (int)((a-b*100)/10);
		d = (int)(a-b*100-c*10);
		sum = b+c+d;
		System.out.println("��λ="+d);
		System.out.println("ʮλ="+c);
		System.out.println("��λ="+b);
		System.out.println("��ʮ��λ���"+sum);
	sca.close();
	}
}
