
public class testStudent {
	public static void main(String[] args) {
		Student xs = new Student();
		xs.studyWhere();
        double avgScore = xs.avg(100, 200, 300);
        System.out.println("平均分数：" + avgScore);
        int examScore = xs.examination(600);
        System.out.println("考试分数：" + examScore);
        Student2 xs1 = new Student2(20);
	}
}
