
public class e18 {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("ͳ�ƿ�ʼ��");
		for(int a = 1;a <= 20;++a){
			if(a%4 != 0){
				continue;
			}
			++i;
			System.out.println("�ܱ�4����������:"+a);
		}
		System.out.println("һ����"+i+"����");
	}
}
