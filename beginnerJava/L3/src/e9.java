import java.util.Scanner;
public class e9 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("�����·�");
		int mon = sca.nextInt();
			if(mon==12 || mon == 1 || mon == 2){
				System.out.println("��Լ�Ƕ���");
			}else{
				if(mon==3 || mon == 4 || mon == 5){	
					System.out.println("��Լ�Ǵ���");	
				}else{
					if(mon==6 || mon == 7 || mon == 8){
						System.out.println("��Լ���ļ�");
					}else{
						System.out.println("��Լ���＾");
					}
				}
			}
		sca.close();
	}
}
