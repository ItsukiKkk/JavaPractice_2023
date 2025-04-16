
public class e21 {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 1; k < 9; k++) {
					if(i*i*i+j*j*j+k*k*k==k*100+j*10+i)
						System.out.println(k*100+j*10+i+"是水仙花数");
				}
			}
		}
	}
}
