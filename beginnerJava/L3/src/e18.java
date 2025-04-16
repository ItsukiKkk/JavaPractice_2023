
public class e18 {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("统计开始：");
		for(int a = 1;a <= 20;++a){
			if(a%4 != 0){
				continue;
			}
			++i;
			System.out.println("能被4整除的数是:"+a);
		}
		System.out.println("一共有"+i+"数字");
	}
}
