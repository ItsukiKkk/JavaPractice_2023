
public class ex2 {
	public static void main(String[] args) {
		System.out.print("1 1 ");
		int j = 1;
		int sum = 0;
		int k = 1;
		for (int i = 1; i < 21; i++) {
			sum = j+k;
			System.out.print(sum+" ");	
			k = j;
			j = sum;
		}
	}
}
