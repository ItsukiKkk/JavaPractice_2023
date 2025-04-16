package task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��¼ע�����
		User []users = new User[100];
		int i = 0;
		//ˮ��
		Fruit []fruit = new Fruit[6]; 
		fruit[0] = new Fruit("ƻ��","��̨��ƻ��","1",100,20);
		fruit[1] = new Fruit("����","̨���ش���","2",100,100);
		fruit[2] = new Fruit("�㽶","���ɱ����㽶","3",50,100);
		fruit[3] = new Fruit("������","�������ڳ�����","4",20,100);
		fruit[4] = new Fruit("â��","�����ز�","5",100,100);
		fruit[5] = new Fruit("����","�½������","6",50,150);
		//��¼�Ž����ﳵ�Ĵ���
		ArrayList<Card> cards = new ArrayList<>();
		//��¼�����û���user��λ��
		int index = 0;
		do {
			boolean login = false;
			System.out.println("---------------��ӭ����ĳ�������---------------");
			System.out.println("1��������תת");
			System.out.println("2��ע�����˺�");
			System.out.println("3���ټ�");
			System.out.println("��ѡ������Ҫ�ķ���");
			int choice = sc.nextInt();
			switch (choice) {
			case 2:
				System.out.println("---------------�˺�ע��---------------");
				System.out.println("1����ʼע��");
				System.out.println("2��������һ��");
				System.out.println("��ѡ������Ҫ�ķ���");
				int choice1 = sc.nextInt();
				if(choice1 == 1){		
					String name;
					do {
						boolean b = true;
						System.out.println("������ע���û���");
						name = sc.next(); 
						for(User user: users){
							if(user!= null && name.equals(user.name)){
								System.out.println("�û����ظ�����������");
								b = false;
								break;
							}
						}
						if(b){
							break;
						}						
					} while (true);
					System.out.println("������ע������");
					String pw = sc.next();
					System.out.println("������ע���Ա�");
					String sex = sc.next();
					String phone;
					do {
						boolean b = true;
						System.out.println("������ע���ֻ���");
						phone = sc.next();
						if(phone.length() != 11){
							System.out.println("�ֻ���ʽ��������������");
							continue;
						}
						for(User user: users){
							if(user != null && phone.equals(user.phone)){
								System.out.println("�ֻ����ظ�����������");
								b = false;
								break;
							}
						}
						if(b){
							break;
						}
					} while (true);
					System.out.println("�������׳���״γ�ֵ ��300-500��20��500������50����");
					double charge = sc.nextInt();
					if(charge >= 300 && charge <= 500){
						charge += 20;
					}else if(charge > 500){
						charge += 50;
					}else{
					}
					users[i] = new User(name,pw,phone,charge,"<��ͨ��Ա>",1.0);
					System.out.println("ע��ɹ�");
					i++;
				}
				break;
			case 1:
				if(users[0] == null){
					System.out.println("��ע���¼�뷵��ע��");
					break;
				}
				System.out.println("---------------��ӭ����ĳ�������---------------");
				System.out.println("1�������˺�");
				System.out.println("2�������ϼ�");
				System.out.println("ѡ������Ҫ�ķ���");
				int choice2 = sc.nextInt();
				if(choice2 == 1){
					boolean b = true;
					do {
						System.out.println("�������û�����");
						String name = sc.next();
						int j = 0;
						for(User user: users){
							if(user != null && name.equals(user.name)){
								b = false;
								index = j;
								break;
							}
							j++;
						}
						if(b){
							System.out.println("���û�������");
							continue;
						}
					} while (b);
					boolean c = true;
					do {
						System.out.println("�������û����룺");
						String pw = sc.next();
						if(pw.equals(users[index].pw)){
							c = false;
							login = true;
							System.out.println("����ɹ�");
							break;
						}
						if(c){
							System.out.println("�������");
							continue;
						}
					} while (c);
				}
				break;
			case 3:
				System.exit(0);
			default:
				break;
			}
			if(login == true){
				boolean success = true;
				cards.clear();
				System.out.println("��¼�ɹ�*");
				do {
					System.out.println("---------------��ӭ����ĳ�������---------------");
					System.out.println("1.�鿴��Ʒ");
					System.out.println("2.������Ʒ");
					System.out.println("3.�鿴���ﳵ");
					System.out.println("4.�鿴������Ϣ");
					System.out.println("5.������һ��");
					System.out.println("ѡ������Ҫ�ķ���");
					int choose = sc.nextInt();
					switch (choose) {
					case 2:
						do {
							System.out.println("��Ʒ�б�");
							for (int j = 0; j < fruit.length; j++) {
								System.out.println(
										"��Ʒ��ţ�"+fruit[j].number+"  "
										+"��Ʒ��"+fruit[j].name+"  "
										+"�۸�"+fruit[j].price+"  "
										+"����ʣ�ࣺ"+fruit[j].amount
								);
							}
							do {
								System.out.println("�����빺�����Ʒ����ţ�:");
								String number = sc.next();
								//�ж�����Ƿ���ȷ
								boolean b = false;
								for(int k = 0; k < fruit.length; k++){
									if(number.equals(fruit[k].number)){
										//�жϹ��ﳵ���Ƿ����ظ���Ʒ
										b = true;
										//���ﳵΪ��
										System.out.println("���������"+ fruit[k].name);
										if(cards.isEmpty()){
											do {
												System.out.println("�����빺�������:");
												int amount = sc.nextInt();
												if(amount > fruit[k].amount){
													System.out.println("����������Ʒ����������������");
													continue;
												}
												Card card = new Card(fruit[k].name, fruit[k].number, fruit[k].price, amount); 
												cards.add(card);
												fruit[k].amount -= amount;
												break;
											} while (true);
										//���ﳵ��Ϊ��
										}else{
											boolean ifRepeat = false;
											do {
												System.out.println("�����빺�������:");
												int amount = sc.nextInt();
												//�ж������Ƿ񳬹�����
												if(amount > fruit[k].amount){
													System.out.println("����������Ʒ����������������");
													continue;
												}else{
													//ˮ���빺�ﳵˮ���ظ�
													for(Card card: cards){
														if(card.number.equals(number)){
															card.amount += amount;
															fruit[k].amount -= amount; 
															ifRepeat = true;
															break;
														}
													}
													//ˮ���빺�ﳵˮ�����ظ�
													if(ifRepeat == false){
														Card card = new Card(fruit[k].name, fruit[k].number, fruit[k].price, amount);
														fruit[k].amount -= amount; 
														cards.add(card);
														break;
													}
												}
												break;
											} while (true);
											
										}
									}
								}
								if(b == false){
									System.out.println("��������������������");
									continue;
								}else{
									System.out.println("��Ʒ���빺�ﳵ�ɹ���");
									break;
								}
							} while (true);
							boolean boo = true;
							do {
								for(Card card: cards){
									System.out.println("���������Ʒ�ǣ�"+card.name+"   ������"+card.amount+"   ���ۣ�"+card.price);
								}
								System.out.println("������Ҫ����ʲô������[y/n]");
								String judge = sc.next();
								if(judge.equals("n")){
									boo = false;
									success = false;
									break;
								}else if(judge.equals("y")){
									break;
								}else{
									System.out.println("������ѡ��");
								}
							} while (boo);
						} while (success);
						break;
					case 1:
						for(Fruit fruits: fruit){
							System.out.println("��Ʒ��"+fruits.name+"  ������"+fruits.slogan);
						}
						System.out.println("��������˳�");
						String any = sc.next();
						break;
					case 3:
						double sum = 0;
						System.out.println("---------------�ҵĹ��ﳵ---------------");
						for(Card card: cards){
							System.out.println("���"+card.number+"   ��Ʒ��"+card.name+"   ������"+card.amount+"   ���ۣ�"
									+card.price+"   С�ƣ�"+(card.amount * card.price));
							sum += card.amount * card.price;
						}
						System.out.println("�ܼۣ�"+(sum*users[index].discount)+ users[index].title);
						Date date = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("����ʱ�䣺yyyy��MM��dd��");
						System.out.println(sdf.format(date));
						System.out.println("------------------------------");
						System.out.println("1.��չ��ﳵ��ȫ������");
						System.out.println("2.������һ��");
						System.out.println("��ѡ��");
						int choose3 = sc.nextInt();
						do {
							if(choose3 == 1){
								if(sum > users[index].charge){
									System.out.println("���㣬���ֵ");
									break;
								}
								users[index].charge -= sum;
								if(sum > 500 && sum < 1500){
									System.out.println("��ϲ����ɹ������ѹ�500��ð�����Ա");
									users[index].title = "<������Ա>";
									users[index].discount = 0.98;
								}else if(sum > 1500 && sum < 3500){
									System.out.println("��ϲ����ɹ������ѹ�1500��ð׽��Ա");
									users[index].title = "<�׽��Ա>";
									users[index].discount = 0.95;
								}else if(sum > 3000){
									System.out.println("��ϲ����ɹ������ѹ�3000�����ʯ��Ա");
									users[index].title = "<��ʯ��Ա>";
									users[index].discount = 0.9;
								}else{
									System.out.println("����ɹ�");
								}
								cards.clear();
								break;
							}else if(choose3 == 2){
								break;
							}else{
								System.out.println("������ѡ��");
								break;
							}
						} while (true);
						break;
					case 4:
						System.out.println("�𾴵�"+users[index].name+"�û�������Ϣ���£�");
						System.out.println("��Ա��"+users[index].title+"��"+(users[index].discount * 10)+"�ۣ�");
						System.out.println("�˺ţ�"+users[index].name);
						System.out.println("�ֻ��ţ�"+users[index].phone);
						System.out.println("ʣ���"+users[index].charge+"Ԫ");
						break;
					case 5:
						login = false;
						break;

					default:
						break;
					}
				} while (login);
			}
		} while (true);
	}
}
