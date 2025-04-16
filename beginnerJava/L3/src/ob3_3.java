
public class ob3_3 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if(i%10 == 9 || i/10 == 9){
				System.out.println(i);
			}
			i++;
		}	
	}
}
