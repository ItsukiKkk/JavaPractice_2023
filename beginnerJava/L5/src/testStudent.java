
public class testStudent {
	public static void main(String[] args) {
		Student xs = new Student();
		xs.studyWhere();
        double avgScore = xs.avg(100, 200, 300);
        System.out.println("ƽ��������" + avgScore);
        int examScore = xs.examination(600);
        System.out.println("���Է�����" + examScore);
        Student2 xs1 = new Student2(20);
	}
}
