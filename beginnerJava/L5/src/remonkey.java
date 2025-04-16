
public class remonkey {
	String color;
	String sex;
	int two,three;
    remonkey() {
        sex = "公";
        System.out.println("性别是："+sex);
    }
	void sexsual(String s){
		sex = s;
		System.out.println("性别是："+sex);
	}
	int addTwo(int a,int b){
		int sum = a+b;
		two = sum;
		return two;
	}
	int addThree(int a,int b,int c){
		int sum = a+b+c;
		three = sum;
		return three;
	}
}
