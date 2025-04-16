import java.util.Scanner;
public class ob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入成绩");
		double score = sc.nextInt();
		if(score < 60){
			System.out.println("差");
		}else if(score >= 60 && score <= 75){
			System.out.println("中");
		}else if(score >= 75 && score <= 95){
				System.out.println("中");
		}else{
			System.out.println("优");
		}
		sc.close();
	}
}
