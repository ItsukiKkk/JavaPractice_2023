
public class Student {
	int age;
	int score1,score2,score3;
	int score;
	void studyWhere(){
		System.out.println("就读于青凌未来教育");
	}
	int examination(int mark){
		score = mark;
		return score;
	}
	double avg(int score11,int score22,int score33){
		score1 = score11;
		score2 = score22;
		score3 = score33;
		return (score1+score2+score3)/3;
	}
}
