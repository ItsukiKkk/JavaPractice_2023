
public class e24 {
	public static void main(String[] args) {
		int n = 5;
		int m = 1;
		for(m = 1;m < 10;m += 2){	
				for (int j = 1; j < n ; j++) {
				System.out.print(" ");
				}
			n--;
			for (int i = 1; i <= m; i++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
