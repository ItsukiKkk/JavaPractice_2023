
public class ob1 {
	public static void main(String[] args) {
		int[] a = new int[30];
		int[] sum = new int[6];
		int x = 0;
		for (int i = 1; i < a.length; i++) {
			x = 2*i;
			a[i] = x;
		}
		for (int j = 0; j < sum.length; j++) {
			sum[j] = a[j]+a[j+1]+a[j+2]+a[j+3]+a[j+4];
		}
		for (int k = 0; k < sum.length; k++) {
			System.out.println(sum[k]);
		}
	}
}
