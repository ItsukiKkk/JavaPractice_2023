
public class sdfedf {
	public static void main(String[] args) {
		Student students [] = new Student [5];
		students [0] = new Student(1,"张三","男",20,"11301");
		students [1] = new Student(2,"李四","男",21,"11302");
		int age = students[0].getAge();
		System.out.println(age);
		System.out.println("编号\t姓名\t性别\t年龄\t班级\t");
	}
}
