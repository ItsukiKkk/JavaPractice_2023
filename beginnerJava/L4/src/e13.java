
public class e13 {
	public static void main(String[] args) {
		int[][] a = new int[][]{{1,2,3},{4,5,6}};
		int[][] b = new int[3][2];
		System.out.println("source matrix");
		for (int rowIndex= 0; rowIndex < a.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < a[rowIndex].length; columnIndex++) {
				System.out.print(a[rowIndex][columnIndex]+"");
				b[columnIndex][rowIndex] = a[rowIndex][columnIndex];
			}
			System.out.println("");
		}
		System.out.println("target matrix:");
		for (int rowIndex = 0; rowIndex < b.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < b[rowIndex].length; columnIndex++) {
				System.out.print(b[rowIndex][columnIndex]+"");
			}
			System.out.println("");
		}
	}
}
