import java.util.Scanner;

public class EXAM {
	public static void main(String[] args) {
        String[][] user = new String[10][2];
        boolean bo = true;
   	    Scanner sc = new Scanner(System.in);
		do {
		    System.out.println("学生管理系统");
		    System.out.println("请选择功能：1.登入2.注册");
		    String ch = sc.next();
		    //登入
		    if (ch.equals("1")) {
		    	int j = 0;
		    	boolean bo1;
		    	do {
                    System.out.println("请输入用户名");
                    String name = sc.next();
                    System.out.println("请输入密码");
                    String pw = sc.next();
                    bo1 = true;
                    for (int i = 0; i < user.length; i++) {
                        if (name.equals(user[i][0]) && pw.equals(user[i][1])) {
                            System.out.println("登入成功");
                            bo1 = false;
                            break;
                        }
                    }
                    if (bo1 == true) {
                        if (j < 2) {
                            j++;
                            System.out.println("输入错误，还能输入" + (3 - j) + "次");
                        } else {
                            System.out.println("连续输入错误超过三次，系统关闭");
                            System.exit(0);
                        }
                    }
                    bo = false;
                } while (bo1);
			// 注册界面
		    }if (ch.equals("2")) { 
		        int i = 0;
		        boolean bo2 = true;
		        do {
		            // 用户名
		            System.out.println("请输入注册用户名：账号密码必须符合首字母大写，最后一个字符为特殊符号");
		            String name = sc.next();
		            char firstna = name.charAt(0);
		            char lastna = name.charAt(name.length() - 1);
		            if ((firstna >= 65 && firstna <= 90) && (lastna >= 33 && lastna <= 47)) {
		                System.out.println("用户名符合要求");
		            } else {
		                System.out.println("用户名或密码不符合要求，请重新输入");
		                continue;
		            }
		            // 密码
		            System.out.println("请输入注册密码：密码必须符合首字母大写，最后一个字符为特殊符号");
		            String pw = sc.next();
		            char firstpw = pw.charAt(0);
		            char lastpw = pw.charAt(pw.length() - 1);
		            if ((firstpw >= 65 && firstpw <= 90) && (lastpw >= 33 && lastpw <= 47)) {
		                System.out.println("注册成功");
		            } else {
		                System.out.println("用户名或密码不符合要求，请重新输入");
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
		students [0] = new Student(1,"张三","男",20,"11301");
		students [1] = new Student(2,"李四","男",21,"11302");
		students [2] = new Student(3,"王五","男",20,"11301");
		students [3] = new Student(4,"麻六","男",19,"11301");
		students [4] = new Student(5,"赵七","男",18,"11301");
	    boolean box = true;
	    do {
		    System.out.println("欢迎使用青凌学生管理系统");
		    System.out.println("--------------------------------------------");
		    System.out.println("1、显示所有学生信息");
		    System.out.println("2、根据编号查询学生信息");
		    System.out.println("3、根据编号修改学生年龄");
		    System.out.println("4、根据姓名修改学生班级");
		    System.out.println("5、根据班级查询全部学生信息");
		    System.out.println("--------------------------------------------");
		    System.out.println("请选择[1/2/3/4/5]：");
		    String choose = sc.next();
	    	switch (choose) {
			case "1":
				System.out.println("编号\t姓名\t性别\t年龄\t班级\t");
				for (int j = 0; j < students.length; j++) {
					Student student = students[j];
					System.out.println(student.num+"\t"+student.name+"\t"+student.sex+"\t"+student.age+"\t"+student.cla);
				}
				System.out.println("是否继续；y继续，n结束");
				String choice0 = sc.next();
				if(choice0.equals("n")){
					bo = false;
				}
				break;
			case "2":
				boolean case2 = true; 
				do {
					//跟踪是否被找到
					boolean boo = false;
					System.out.println("请输入编号");
					int num = sc.nextInt();
					for (Student student : students) {
						
					    if (student != null && student.getNum() == num) {
					        System.out.println("找到学生信息:");
					        System.out.println("编号: " + student.getNum() + ", 姓名: " + student.getName() +
					                ", 性别: " + student.getSex() + ", 年龄: " + student.getAge() +
					                ", 班级: " + student.getCla());
					        boo = true;
					        break;
					    }
					}
				    if(boo == false){
				    	System.out.println("--------------------------------------------");
				    	System.out.println("该学生信息不存在");
				    	System.out.println("--------------------------------------------");
				    }
					System.out.println("是否继续查询？y继续，n结束");
					String choice1 = sc.next();
					if(choice1.equals("n")){
						case2 = false;
					}
				} while (case2);
				break;
				
			case "3":
				boolean case3 = true; 
				do {
					System.out.println("请输入要修改年龄的学生编号");
					int num = sc.nextInt();
					boolean boo = false;
					//找学生信息
					for (Student student : students) {
					    if (student != null && student.getNum() == num) {
					        System.out.println("找到学生信息:");
					        System.out.println("编号: " + student.getNum() + ", 姓名: " + student.getName() +
					                ", 性别: " + student.getSex() + ", 年龄: " + student.getAge() +
					                ", 班级: " + student.getCla());
					        System.out.println("请输入新的年龄");
				            int newAge = sc.nextInt();
				         // 将学生的年龄设置为新的年龄
				            student.setAge(newAge); 
				            System.out.println("已成功修改学生年龄为 " + newAge);
				            boo = true;
				            break;
					    }
					}
				    if(boo == false){
				    	System.out.println("--------------------------------------------");
				    	System.out.println("该学生信息不存在");
				    	System.out.println("--------------------------------------------");
				    }
					System.out.println("是否继续修改？y继续，n结束");
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
					System.out.println("请输入要修改班级的学生姓名");
					String name = sc.next();
					//找学生信息
					for (Student student : students) {
					    if (student != null && student.getName().equals(name)) {
					        System.out.println("找到学生信息:");
					        System.out.println("编号: " + student.getNum() + ", 姓名: " + student.getName() +
					                ", 性别: " + student.getSex() + ", 年龄: " + student.getAge() +
					                ", 班级: " + student.getCla());
					        System.out.println("请输入新的班级");
				            String newCla = sc.next();
				         // 设置为新的班级
				            student.setCla(newCla); 
				            System.out.println("已成功修改学生班级为 " + newCla);
				            boo = true;
				            break;
					    }
					}
				    if(boo == false){
				    	System.out.println("--------------------------------------------");
				    	System.out.println("该学生信息不存在");
				    	System.out.println("--------------------------------------------");
				    }
					System.out.println("是否继续修改？y继续，n结束");
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
					System.out.println("请输入班级");
					String clas = sc.next();
					for (Student student : students) {
					    if (student != null && student.getCla().equals(clas)) {
					        System.out.println("找到学生信息:");
					        System.out.println("编号: " + student.getNum() + ", 姓名: " + student.getName() +
					                ", 性别: " + student.getSex() + ", 年龄: " + student.getAge() +
					                ", 班级: " + student.getCla());
					        boo = true;
					    }
					}
				    if(boo == false){
				    	System.out.println("该班级不存在");
				    }
					System.out.println("是否继续查询？y继续，n结束");
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
