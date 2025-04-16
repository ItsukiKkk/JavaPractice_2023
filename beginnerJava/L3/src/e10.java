import java.util.Scanner;

public class e10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:	System.out.println("工作日");	break;	
			case 6:				
			case 7:	System.out.println("休息日");	break;
			default:System.out.println("输入错误");
		sc.close();	
		}
	}
}
