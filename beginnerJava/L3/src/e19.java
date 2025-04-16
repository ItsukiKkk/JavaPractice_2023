
public class e19 {
	public static void main(String[] args) {
		long sum = 0;
		int i = 1;
			while(i<7){
				long c = 1;
				for (int j = 1; j <= i; ++j) {
				c=c*j;
				}
				i++;
				sum = sum+c;
			}
		System.out.println("1~6µÄ½×³ËÏà¼Ó="+sum);
	}
}
