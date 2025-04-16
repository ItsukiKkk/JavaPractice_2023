
public class ex4 {
	public static void main(String[] args) {
		int x = 0;
		int sum = 0;
		for (x = 0; x < 31; x++) {
			int y = 30-x;
			sum = 2*x+4*y;
			if(sum == 90){
			System.out.println("¼¦£º"+x+"ÍÃ£º"+y);
			}
		}
	}
}
