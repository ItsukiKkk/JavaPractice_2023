import java.util.Scanner;
public class ob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ɼ�");
		double score = sc.nextInt();
		if(score < 60){
			System.out.println("��");
		}else if(score >= 60 && score <= 75){
			System.out.println("��");
		}else if(score >= 75 && score <= 95){
				System.out.println("��");
		}else{
			System.out.println("��");
		}
		sc.close();
	}
}
