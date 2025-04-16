
public class ob1_2 {
	public static void main(String[] args) {
		int[] a = {8,6,5,4,1};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				int s = 0;
				if(a[j] > a[j+1]){
					s = a[j+1];
					a[j+1] = a[j];
					a[j] = s;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
