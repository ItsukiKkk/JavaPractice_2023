import java.util.Scanner;
public class e9 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("输入月份");
		int mon = sca.nextInt();
			if(mon==12 || mon == 1 || mon == 2){
				System.out.println("大约是冬季");
			}else{
				if(mon==3 || mon == 4 || mon == 5){	
					System.out.println("大约是春季");	
				}else{
					if(mon==6 || mon == 7 || mon == 8){
						System.out.println("大约是夏季");
					}else{
						System.out.println("大约是秋季");
					}
				}
			}
		sca.close();
	}
}
