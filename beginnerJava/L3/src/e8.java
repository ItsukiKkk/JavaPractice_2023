import java.util.Scanner;
public class e8 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("输入年龄");
		int ages = sca.nextInt();
		if(ages<18){
			System.out.println("未成年");
		}else{
			if(18<ages && ages<35){
				System.out.println("中年");
			}else{
				System.out.println("老年");
			}
		}
		sca.close();
	}

}
