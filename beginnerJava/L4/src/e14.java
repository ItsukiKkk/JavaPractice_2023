
public class e14 {
	public static void main(String[] args) {
		int [][]a = new int[10][10];
		for (int index = 0; index < a.length; index++) {
			a[index][0] = 1;
			a[index][index] = 1;
		}
		for (int rIndex = 2; rIndex < a.length; rIndex++) {
			for (int cIndex = 1; cIndex < rIndex; cIndex++) {
				a[rIndex][cIndex] = a[rIndex - 1][cIndex - 1]+a[rIndex - 1][cIndex];
			}
		}
		for (int rIndex = 0; rIndex < a.length; rIndex++) {
			for (int cIndex = 0; cIndex <= rIndex; cIndex++) {
				System.out.print(a[rIndex][cIndex]+"");
			}
			System.out.println();
		}
	}
}
