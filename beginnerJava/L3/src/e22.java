
public class e22 {
	public static void main(String[] args) {
		int num = 3;
		while(num <= 50){
			int tempnum = 2;
			while(tempnum < num){
				if(num % tempnum == 0){
					break;
				}
				++tempnum;
			}
			if(tempnum == num){
				System.out.println(num);
			}
			++num;
		}
	}
}
