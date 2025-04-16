
public class e12 {
	public static void main(String[] args) {
		int[][] x = new int[5][];
		x[0] = new int[4];
		x[1] = new int[3];
		x[2] = new int[1];
		x[3] = new int[2];
		for (int rowIndex = 0; rowIndex < x.length; rowIndex++) {
			System.out.println("µÚ" + (rowIndex+1)+"ÐÐ");
			if(x[rowIndex] == null){
				System.out.println(x[rowIndex]);
				continue;
			}
		for (int columnIndex = 0; columnIndex < x[rowIndex].length; columnIndex++) {
			System.out.println(x[rowIndex][columnIndex]+" ");
		}
		System.out.println();
		}
	}
}
