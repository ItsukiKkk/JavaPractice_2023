
public class Student1 {
	int age;
	int avgscore;
	int score;
	Student1(){
		System.out.println("�ұ���ʼ����");
	}
	int examination(int mark){
		score = mark;
		return score;
	}
	double avg(int score1,int score2,int score3){
		int s = 0;
		s = (score1+score2+score3)/3;
		return s;
	}
	void StudyWhere(){
		System.out.println("�Ͷ�����δ��");
	}
	int AddScore(int score4,int score5,int score6){
		double a = avg(score4,score5,score6)+5;
		return (int)a;
	}
	
}
