
public class e13 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		while(a>20){
			b=a;
		}
		System.out.println("whlie语句中的b="+b);
		do{
			b=a;
		}while(a>20);
		System.out.println("do_while语句中的b="+b);
	}
}
