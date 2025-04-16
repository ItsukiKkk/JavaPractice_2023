
public class Test {
	public static void main(String[] args) {
		Monkey houge = new Monkey();
			houge.age = 45;
			System.out.println("猴子的年龄是："+houge.age+"岁");
		Monkey1 houzi = new Monkey1();
			houzi.killNiu();
			int a = houzi.buy(100,5);
			System.out.println("师傅买了"+a+"包香烟");
	}
}
