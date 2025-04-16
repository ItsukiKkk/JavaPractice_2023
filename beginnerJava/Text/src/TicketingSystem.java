import java.util.ArrayList;
import java.util.Scanner;

public class TicketingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean out = true;
		//��¼user��i��¼ע��ɹ�����Ȼ�����
		User []users = new User[100];
		int i = 0;
		//order������Ҫ����
		Order orders[] = new Order[5];
		orders[0] = new Order("G101",100,50);
		orders[1] = new Order("G102",200,35);
		orders[2] = new Order("G103",300,30);
		orders[3] = new Order("G104",250,40);
		orders[4] = new Order("G105",150,45);
		//�Ƿ��¼
		boolean ifLogin = false;
		//cart������Ҫ����
		ArrayList<Cart> carts = new ArrayList<>(); 
		//z���湺����Ʒ��Ϣ
		int z = 0;

		do {
			System.out.println("��������������������������ӭʹ�ù�Ʊϵͳ������������������������");
			System.out.println("1. ע��");
			System.out.println("2. ��¼");
			System.out.println("3. ����Ʊ");
			System.out.println("4. �ҵĶ���");
			System.out.println("5. �˳�");
			System.out.println("��������������������������������������������������������������������������");
			System.out.println("��������ִ�еĲ���");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean case1 = true;
				do {
					//�ж��û����Ƿ��ظ�
					boolean cover = false;
					//�ж��û����Ƿ��������
					boolean judge = true;
					//�ж������޸��û��������Ƿ���ȷ
					boolean reName = false;
					System.out.println("������ע���û��������ȴ���6λֻ����ʹ��СдӢ��������");
					String name = sc.next();
					char []nameChar = name.toCharArray();
					//�ֿ��жϳ��Ⱥ;����ַ���
					if(name.length() > 6){
						for (int j = 0; j < nameChar.length; j++) {
							if( (nameChar[j] >= 61 && nameChar[j] <= 80) || 
									(nameChar[j] >= 48 && nameChar[j] <= 57)){
								judge = true;
							}else{
								judge = false;
								break;
							}
						}
						if(judge == true){
							for(User user: users){
								if(user != null && name.equals(user.name)){
									System.out.println("�û����ظ�����������");
									cover = true;
									reName = true;
									break;
								}
							}
						}
						if(reName == false){
							System.out.println("������ע������");
							String pw = sc.next();
							System.out.println("������ע������");
							String email = sc.next();
							if(cover == false){
								users[i] = new User(name,pw, email);
								System.out.println("ע��ɹ�*");
								i++;
								case1 = false;
							}
						}
					}else{
						judge = false;
					}
					if(judge == false){
						System.out.println("�û�����ʽ����");
					}
				} while (case1);
				break;
			case 2:
				boolean case2 = true;
				//��¼�����Ƿ����
				boolean compareNa = false;
				//��¼�����Ƿ����
				boolean comparePw = false;
				//��¼���������ٴ�
				int j = 0;
				do {
					boolean isName = true;
					do {
						System.out.println("�������û���");
						String name = sc.next();
						for(User user: users){
							if(user != null && name.equals(user.name)){
								compareNa = true;
								System.out.println("�û�����ȷ");
								isName = false;
								break;
							}
						}
						if(!compareNa){
							System.out.println("�û����������");
						}
					} while (isName);
					boolean isMail = true;
					do {
						System.out.println("����������");
						String pw = sc.next();
						for(User user: users){
							if(user != null &&  pw.equals(user.pw)){
								System.out.println("����ɹ�");
								comparePw = true;
								isMail = false;
								break;
							}
						}
						if(comparePw == false){
							System.out.println("�����������");
							//������û���������ȷ����ж�
							boolean enter = false;
							j++;
							if(j > 3){
								//һ�������ظ����һ��������
								boolean find = true;
								do {
									System.out.println("�һ����빦��");
									System.out.println("�������û���");
									String findName = sc.next();
									System.out.println("�����������ַ");
									String findMail = sc.next();
									//��ѯ�û���λ������λ��
									int k = 0;
									//�ȶ�������û���
									for(User user: users){
										if(user != null){
											if(findName.equals(user.name) && findMail.equals(user.email)){
												enter = true;
												k++;
												break;
											}
										}
									}
									//�������
									if( enter == false){
										System.out.println("�������");
										System.out.println("�Ƿ�������롾y/n��");
										String findChioce = sc.next();
										if(findChioce.equals("n")){
											find = false;
											case2 = false;
										}else {
											find = true;
										}
									} else {
									    System.out.println("������������");
									    String newPw = sc.next();
									    if (k > 0 && users[k-1] != null) {
									        users[k-1].setPw(newPw);
									        System.out.println("���óɹ�");
									        find = false;
									        case2 = false;
									        isMail = false;
									    } else {
									        System.out.println("��Ч�������û���Ϣ������");
									        // ������Ҫ���ж��⴦��������������Ȳ���
									    }
									}
								} while (find);
							}else{
								System.out.println("����������"+(4-j)+"��,���������������");
								continue;
							}
						//������ȷ����빺��Ʊ
						}else{
							ifLogin = true;
							case2 = false;
							isMail = false;
						}
					} while (isMail);
				} while (case2);
				break;
			case 3:
				boolean reCart = false;
				boolean buyRe = true;
				if(ifLogin == true){
					do {
						//���޳���
						boolean findCar = false;
						System.out.println("����Ʊ");
						System.out.println("����\t�۸�\t����");
						for(Order order: orders){
							System.out.println(order.num+"\t"+order.price+"\t"+order.amount);
						}
						System.out.println("�����빺��ĳ���");
						String car = sc.next();
						//��¼����λ��
						int c = 0;
						for(Order order: orders){
							if( car.equals(order.num) ){
								findCar = true;
								break;
							}
							c++;
						}
						if(findCar){
							System.out.println("�����빺�������");
							int carNum = sc.nextInt();
							if( carNum <= orders[c].amount ){
								if(carts != null){
								//���ﳵ�ĳ����ظ�
//									for(Order order: orders){
										for(Cart cart:carts){
											if(car.equals(cart.num)){
												orders[c].amount -= carNum;
												cart.amount += carNum;
												System.out.println("����ɹ�");
												z++;
												buyRe = false;
												reCart = true;
												break;
											}
										}
//										if (reCart) {
//									    	break; // ���ҵ�ƥ����ʱ�˳��ⲿѭ��
//									    }
//									}
								}
								//���β��ظ�
//								if(reCart == false){
//									//���治ͬ���ι�����Ʒ��Ϣ����¼cart�Ĺ�������
//									carts[z] = new Cart(car, carNum);
//									System.out.println("����ɹ�");
//									//�ı�ó��ε�order����
//									orders[c].amount = orders[c].amount - carNum;
//									z++;
//									buyRe = false;
//								}
								if (reCart == false) {
								    // ���治ͬ���ι�����Ʒ��Ϣ����¼cart�Ĺ�������
								    carts.add(new Cart(car, carNum));
								    System.out.println("����ɹ�");
								    // �ı�ó��ε�order����
								    orders[c].amount -= carNum;
								    z++;
								    buyRe = false;
								}
							}else{
								System.out.println("��Ʊ���㣡����������");
							}
						}else{
							System.out.println("���޴˳��Σ�����������");
						}
						//ifYes����
						boolean ifYes = true;
						do {
							System.out.println("�Ƿ������Ʊ��[Y/N]");
							String a = sc.next();
							if("Y".equals(a)){
								ifYes = false;
								buyRe = true;
							}else if("N".equals(a)){
								ifYes = false;
								break;
							}else{
								System.out.println("�����������������");
							}
						} while (ifYes);
					} while (buyRe);
				}else{
					System.out.println("���ȵ�¼���ٹ�Ʊ");
				}
				break;
			case 4:
				boolean case4 = true;
				do {
					if(ifLogin == true){
						System.out.println("�ҵĶ�����");
						for (Cart cart : carts) {
//						    if (cart != null) {
//						    	for(Order order:orders){
//						    		if(order.num.equals(cart)){
						    			System.out.println("���Σ�"+cart.num+"\t"+"�ѹ���������"+cart.amount);
//						    		}
//						    	}
						        
//						    }
						}
						System.out.println("����N���ز˵�");
						String last = sc.next();
						if(last.equals("N")){
							case4 = false;
						}
					}else{
						System.out.println("���ȵ�¼���ٲ鿴�ҵĶ���");
					}
				} while (case4);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (out);
	}
}
