
public class e17 {
	public static void main(String[] args) {
		int i = 0;
		for(i = 1000;i <= 2000;i++){
			if(i%123 == 0){
				break;
			}
		}
		System.out.println("第一个能被123整除的数是"+i);
	}
}
