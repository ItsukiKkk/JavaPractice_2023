
public class e23 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 1;i <= 4;i++){
			for (int j = 0; j < 4;j++) {
				for (int k = 0; k < 4; k++) {
					num++;
				}		
			}
		}
		System.out.println("能组成"+num+"个不同的三位数");
	}
}
