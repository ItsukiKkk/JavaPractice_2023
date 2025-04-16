
public class e7 {
	public static void main(String[] args) {
		int [] item = new int[10];
		int total = 0;
		for (int index = 0; index < item.length; index++) {
			item[index] = index*3;
		}
		for (int index = 0; index < item.length; index++) {
			total += item[index];
		}
		System.out.println("total="+total);
	}
}
