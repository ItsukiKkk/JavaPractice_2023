import java.util.Scanner;

public class EXAM {
	public static void main(String[] args) {
        String[][] user = new String[10][2];
        boolean bo = true;
   	    Scanner sc = new Scanner(System.in);
		do {
		    System.out.println("ѧ������ϵͳ");
		    System.out.println("��ѡ���ܣ�1.����2.ע��");
		    String ch = sc.next();
		    //����
		    if (ch.equals("1")) {
		    	int j = 0;
		    	boolean bo1;
		    	do {
                    System.out.println("�������û���");
                    String name = sc.next();
                    System.out.println("����������");
                    String pw = sc.next();
                    bo1 = true;
                    for (int i = 0; i < user.length; i++) {
                        if (name.equals(user[i][0]) && pw.equals(user[i][1])) {
                            System.out.println("����ɹ�");
                            bo1 = false;
                            break;
                        }
                    }
                    if (bo1 == true) {
                        if (j < 2) {
                            j++;
                            System.out.println("������󣬻�������" + (3 - j) + "��");
                        } else {
                            System.out.println("����������󳬹����Σ�ϵͳ�ر�");
                            System.exit(0);
                        }
                    }
                    bo = false;
                } while (bo1);
			// ע�����
		    }if (ch.equals("2")) { 
		        int i = 0;
		        boolean bo2 = true;
		        do {
		            // �û���
		            System.out.println("������ע���û������˺���������������ĸ��д�����һ���ַ�Ϊ�������");
		            String name = sc.next();
		            char firstna = name.charAt(0);
		            char lastna = name.charAt(name.length() - 1);
		            if ((firstna >= 65 && firstna <= 90) && (lastna >= 33 && lastna <= 47)) {
		                System.out.println("�û�������Ҫ��");
		            } else {
		                System.out.println("�û��������벻����Ҫ������������");
		                continue;
		            }
		            // ����
		            System.out.println("������ע�����룺��������������ĸ��д�����һ���ַ�Ϊ�������");
		            String pw = sc.next();
		            char firstpw = pw.charAt(0);
		            char lastpw = pw.charAt(pw.length() - 1);
		            if ((firstpw >= 65 && firstpw <= 90) && (lastpw >= 33 && lastpw <= 47)) {
		                System.out.println("ע��ɹ�");
		            } else {
		                System.out.println("�û��������벻����Ҫ������������");
		                continue;
		            }
		           user [i][0] = name;
		           user [i][1] = pw;
		           i++;
		           bo2 = false;
		        } while (bo2);
		    }else{
		    	
		    }
		} while (bo);
	    Student students [] = new Student [100];
		students [0] = new Student(1,"����","��",20,"11301");
		students [1] = new Student(2,"����","��",21,"11302");
		students [2] = new Student(3,"����","��",20,"11301");
		students [3] = new Student(4,"����","��",19,"11301");
		students [4] = new Student(5,"����","��",18,"11301");
	    boolean box = true;
	    do {
		    System.out.println("��ӭʹ������ѧ������ϵͳ");
		    System.out.println("--------------------------------------------");
		    System.out.println("1����ʾ����ѧ����Ϣ");
		    System.out.println("2�����ݱ�Ų�ѯѧ����Ϣ");
		    System.out.println("3�����ݱ���޸�ѧ������");
		    System.out.println("4�����������޸�ѧ���༶");
		    System.out.println("5�����ݰ༶��ѯȫ��ѧ����Ϣ");
		    System.out.println("--------------------------------------------");
		    System.out.println("��ѡ��[1/2/3/4/5]��");
		    String choose = sc.next();
	    	switch (choose) {
			case "1":
				System.out.println("���\t����\t�Ա�\t����\t�༶\t");
				for (int j = 0; j < students.length; j++) {
					Student student = students[j];
					System.out.println(student.num+"\t"+student.name+"\t"+student.sex+"\t"+student.age+"\t"+student.cla);
				}
				System.out.println("�Ƿ������y������n����");
				String choice0 = sc.next();
				if(choice0.equals("n")){
					bo = false;
				}
				break;
			case "2":
				boolean case2 = true; 
				do {
					//�����Ƿ��ҵ�
					boolean boo = false;
					System.out.println("��������");
					int num = sc.nextInt();
					for (Student student : students) {
						
					    if (student != null && student.getNum() == num) {
					        System.out.println("�ҵ�ѧ����Ϣ:");
					        System.out.println("���: " + student.getNum() + ", ����: " + student.getName() +
					                ", �Ա�: " + student.getSex() + ", ����: " + student.getAge() +
					                ", �༶: " + student.getCla());
					        boo = true;
					        break;
					    }
					}
				    if(boo == false){
				    	System.out.println("--------------------------------------------");
				    	System.out.println("��ѧ����Ϣ������");
				    	System.out.println("--------------------------------------------");
				    }
					System.out.println("�Ƿ������ѯ��y������n����");
					String choice1 = sc.next();
					if(choice1.equals("n")){
						case2 = false;
					}
				} while (case2);
				break;
				
			case "3":
				boolean case3 = true; 
				do {
					System.out.println("������Ҫ�޸������ѧ�����");
					int num = sc.nextInt();
					boolean boo = false;
					//��ѧ����Ϣ
					for (Student student : students) {
					    if (student != null && student.getNum() == num) {
					        System.out.println("�ҵ�ѧ����Ϣ:");
					        System.out.println("���: " + student.getNum() + ", ����: " + student.getName() +
					                ", �Ա�: " + student.getSex() + ", ����: " + student.getAge() +
					                ", �༶: " + student.getCla());
					        System.out.println("�������µ�����");
				            int newAge = sc.nextInt();
				         // ��ѧ������������Ϊ�µ�����
				            student.setAge(newAge); 
				            System.out.println("�ѳɹ��޸�ѧ������Ϊ " + newAge);
				            boo = true;
				            break;
					    }
					}
				    if(boo == false){
				    	System.out.println("--------------------------------------------");
				    	System.out.println("��ѧ����Ϣ������");
				    	System.out.println("--------------------------------------------");
				    }
					System.out.println("�Ƿ�����޸ģ�y������n����");
					String choice2 = sc.next();
					if(choice2.equals("n")){
						case3 = false;
					}
				} while (case3);
				break;
				
			case "4":
				boolean case4 = true; 
				do {
					boolean boo = false;
					System.out.println("������Ҫ�޸İ༶��ѧ������");
					String name = sc.next();
					//��ѧ����Ϣ
					for (Student student : students) {
					    if (student != null && student.getName().equals(name)) {
					        System.out.println("�ҵ�ѧ����Ϣ:");
					        System.out.println("���: " + student.getNum() + ", ����: " + student.getName() +
					                ", �Ա�: " + student.getSex() + ", ����: " + student.getAge() +
					                ", �༶: " + student.getCla());
					        System.out.println("�������µİ༶");
				            String newCla = sc.next();
				         // ����Ϊ�µİ༶
				            student.setCla(newCla); 
				            System.out.println("�ѳɹ��޸�ѧ���༶Ϊ " + newCla);
				            boo = true;
				            break;
					    }
					}
				    if(boo == false){
				    	System.out.println("--------------------------------------------");
				    	System.out.println("��ѧ����Ϣ������");
				    	System.out.println("--------------------------------------------");
				    }
					System.out.println("�Ƿ�����޸ģ�y������n����");
					String choice2 = sc.next();
					if(choice2.equals("n")){
						case4 = false;
					}
				} while (case4);
				break;
			case "5":
				boolean case5 = true; 
				do {
					boolean boo = false;
					System.out.println("������༶");
					String clas = sc.next();
					for (Student student : students) {
					    if (student != null && student.getCla().equals(clas)) {
					        System.out.println("�ҵ�ѧ����Ϣ:");
					        System.out.println("���: " + student.getNum() + ", ����: " + student.getName() +
					                ", �Ա�: " + student.getSex() + ", ����: " + student.getAge() +
					                ", �༶: " + student.getCla());
					        boo = true;
					    }
					}
				    if(boo == false){
				    	System.out.println("�ð༶������");
				    }
					System.out.println("�Ƿ������ѯ��y������n����");
					String choice1 = sc.next();
					if(choice1.equals("n")){
						case5 = false;
					}
				} while (case5);
				break;
			default:
				break;
			}
		} while (box);
	}
}
