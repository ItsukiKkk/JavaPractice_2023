
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		boolean bo = true;
		Scanner sc = new Scanner(System.in);
		User []users = new User[100];
		//��¼��ע�������j
		int j = 0;
		//��ʼ�����ﳵ����
		PersonalCart []carts = new PersonalCart[100];
		do {
			System.out.println("---------------��ӭ����ĳ�������---------------");
			System.out.println("1��������תת");
			System.out.println("2��ע�����˺�");
			System.out.println("3���ټ�");
			System.out.println("����Ҫ��ʲô��\t��ѡ������Ҫ�ķ���");
			String choose1 = sc.next();
			boolean boo1 = true;
			switch (choose1) {
			case "1":
				do {
					System.out.println("---------------��ӭ����ĳ�������---------------");
					System.out.println("1�������˺�");
					System.out.println("2�������ϼ�");
					System.out.println("ѡ������Ҫ�ķ���");
					int login = sc.nextInt();
					switch (login) {
					case 1:
						boolean match = false;
						System.out.println("�������û�����");
						String name = sc.next();
						System.out.println("�������û����룺");
						String pw = sc.next();
						for(User user : users){
							if(user != null && name.equals(user.name) && pw.equals(user.pw)){
								System.out.println("����ɹ�*");
								match = true;
								break;
							}
						}
						if(match == false){
							System.out.println("�û��������ڻ��������");
						}else{
							boolean second = true;
							do {
								System.out.println("---------------��ӭ����ĳ�������---------------");
								System.out.println("1.�鿴��Ʒ");
								System.out.println("2.������Ʒ");
								System.out.println("3.�鿴���ﳵ");
								System.out.println("4.�鿴������Ϣ");
								System.out.println("5.������һ��");
								System.out.println("ѡ������Ҫ�ķ���");
								int choose2 = sc.nextInt();
								switch (choose2) {
								case 1:
									System.out.println("��Ʒ��ţ�1   ��Ʒ��ƻ��  ��������̨��ƻ��");
									System.out.println("��Ʒ��ţ�2  ��Ʒ������  ������̨���ش���");
									System.out.println("��Ʒ��ţ�3  ��Ʒ������  ���������ɱ����㽶");
									System.out.println("��Ʒ��ţ�4  ��Ʒ��������  �������������ڳ�����");
									System.out.println("��Ʒ��ţ�5  ��Ʒ��â��  �����������ز�");
									System.out.println("��Ʒ��ţ�6  ��Ʒ������  �������½������");
									System.out.println("��������˳�");
									String exitRandon = sc.next();
									break;
								case 2:
									Fruit []fruits = new Fruit[6];
									fruits[0] = new Fruit(1,"ƻ��",100.0,20);
									fruits[1] = new Fruit(2,"����",100.0,100);
									fruits[2] = new Fruit(3,"����",50.0,100);
									fruits[3] = new Fruit(4,"������",20.0,100);
									fruits[4] = new Fruit(5,"â��",100.0,100);
									fruits[5] = new Fruit(6,"����",50.0,150);
									
									boolean judgeFruit = true;
									int i = 0;
									do {
										boolean exist = false;
										System.out.println("��Ʒ�б�");
										System.out.println("��Ʒ��ţ�1   ��Ʒ��ƻ��  �۸�100.0  ����ʣ�ࣺ20");
										System.out.println("��Ʒ��ţ�2  ��Ʒ������  �۸�100.0  ����ʣ�ࣺ100");
										System.out.println("��Ʒ��ţ�3  ��Ʒ������  �۸�50.0  ����ʣ�ࣺ100");
										System.out.println("��Ʒ��ţ�4  ��Ʒ��������  �۸�20.0  ����ʣ�ࣺ100");
										System.out.println("��Ʒ��ţ�5  ��Ʒ��â��  �۸�100.0  ����ʣ�ࣺ100");
										System.out.println("��Ʒ��ţ�6  ��Ʒ������  �۸�50.0  ����ʣ�ࣺ150");
										System.out.println("�����������Ʒ����ţ�");
										int fruitId = sc.nextInt();
										for(Fruit fruit : fruits){
											if(fruitId == fruit.number){
												System.out.println("��ѡ�����Ʒ�ǣ�"+ fruits[fruitId - 1].fruitName);
												exist = true;
											}
										}
										if(exist == false){
											System.out.println("����������������������");
										}else{
											System.out.println("�����빺����Ʒ�ĸ���");
											int fruitAmount = sc.nextInt();
											if(fruitAmount <= fruits[fruitId - 1].amount){
												System.out.println("�㹺�����"+ fruits[fruitId - 1].fruitName+" "+fruitAmount+"��");
												System.out.println("������Ҫ����ʲô������[y/n]");
												String yesOr = sc.next();
												if(yesOr.equals("n")){
													for (int k = 0; k <= i; k++) {
														carts[k].setNumber(fruitId - 1);
														carts[k].setAmount(fruitAmount);
														// fruitId ˮ������Ҷ�Ӧ�۸�ļ��㷽��
														switch (fruitId) {
													    case 1:
													        carts[k].setPrice1(fruitAmount);
													        break;
													    case 2:
													        carts[k].setPrice2(fruitAmount);
													        break;
													    case 3:
													        carts[k].setPrice3(fruitAmount);
													        break;
													    case 4:
													        carts[k].setPrice4(fruitAmount);
													        break;
													    case 5:
													        carts[k].setPrice5(fruitAmount);
													        break;
													    case 6:
													        carts[k].setPrice6(fruitAmount);
													        break;
													}
														carts[k].setFruitName(fruits[fruitId - 1].fruitName);
														i++;
													}
													System.out.println("��Ʒ���빺�ﳵ�ɹ�*");
													judgeFruit = false;
												}
											}
										}
										
									} while (judgeFruit);
									break;
								case 3:
									double sum = 0;
									boolean cardJudge = true;
									do {
										System.out.println("---------------�ҵĹ��ﳵ---------------");
										for(PersonalCart cart : carts){
											if(cart != null){
												System.out.println("��ţ�"+cart.getNumber()+"  ��Ʒ����"+cart.getFruitName()+"  ������"+cart.getAmount()+"  ����"+cart.printPrice()+"  С��"+cart.getPrice());
												sum += cart.getPrice();
											}
										}
										System.out.println("�ܼ۸�"+ sum);
										Date date = new Date();
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
										System.out.println("����ʱ��  "+sdf.format(date));
										System.out.println("------------------------------");
										System.out.println("1.��չ��ﳵ��ȫ������");
										System.out.println("2.������һ��");
										System.out.println("��ѡ��");
										int chooseCard = sc.nextInt();
										switch (chooseCard) {
										case 1:
											if(sum > 500 && sum < 1500){
												System.out.println("��ϲ����ɹ������ѹ�500��ð�����Ա");
											}else if(sum > 1500 && sum < 3500){
												System.out.println("��ϲ����ɹ������ѹ�1500��ð׽��Ա");
											}else if(sum > 3000){
												System.out.println("��ϲ����ɹ������ѹ�3000�����ʯ��Ա");
											}else{
												System.out.println("����ɹ�");
											}
											break;
										case 2:
											cardJudge = false;
											break;
										default:
											break;
										}
									} while (cardJudge);
									break;
								case 4:
									
									break;
								case 5:
									second = false;
									break;
								default:
									break;
								}
							} while (second);
						}
						
						break;
					case 2:
						boo1 = false;
						break;
					default:
						break;
					}
				} while (boo1);
				break;
			case "2":
				boolean boo2 = true;
				do {
					System.out.println("---------------��ӭ����ĳ�������---------------");
					System.out.println("1����ʼע��");
					System.out.println("2�������ϼ�");
					System.out.println("ѡ������Ҫ�ķ���");
					int sign = sc.nextInt();
					switch (sign) {
					case 1:
						boolean bool = false;
						System.out.println("��������ע����û���");
						String name = sc.next();
						System.out.println("����������");
						String pw = sc.next();
						System.out.println("�������û��Ա�");
						String sex = sc.next();
						System.out.println("�������ֻ���");
						String phone = sc.next();
						System.out.println("�������׳���(�״γ�ֵ ��300-500��20��500������50)");
						int money = sc.nextInt();
						if(j > 0){
							//�ж����������Ƿ��ظ�
							for(User user : users){
								if( user != null&&(name.equals(user.name) || phone.equals(user.phone))){
									System.out.println("�û������ֻ����ظ�");
									bool = true;
									break;
								}
							}
							//ȫɸ����������
							if(bool == false){
								users[j] = new User(name,pw,sex,phone,money);
								System.out.println("ע��ɹ�*");
								j++;
							}
						}else{
							users[j] = new User(name,pw,sex,phone,money);
							System.out.println("ע��ɹ�*");
							j++;
						}
						//ʵ�ֵ����������һ������ҳ�棬���ﲻ�������ò�ѭ��
						boo2 = false;
						break;
					case 2:
						boo2 = false;
						break;
					default:
						break;
					}
				} while (boo2);
				break;
			case "3":
				System.exit(0);
				break;
			default:
				break;
			}
		} while (bo);
	}
}
