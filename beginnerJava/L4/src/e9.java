
public class e9 {
	public static void main(String[] args) {
		int [] a = new int[]{1,2,3,4,5,6,47};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a [j] < a [j+1]){
					int b = a[j+1];
					a [j+1] = a [j];
					a [j] = b;
				} 
			}
		}
		for (int x = 0; x < a.length; x++) {
		System.out.println(a[x]);
		}
	}
}
