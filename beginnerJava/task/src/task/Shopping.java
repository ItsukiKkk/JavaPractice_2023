package task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//记录注册个数
		User []users = new User[100];
		int i = 0;
		//水果
		Fruit []fruit = new Fruit[6]; 
		fruit[0] = new Fruit("苹果","烟台大苹果","1",100,20);
		fruit[1] = new Fruit("菠萝","台湾特大菠萝","2",100,100);
		fruit[2] = new Fruit("香蕉","菲律宾甜香蕉","3",50,100);
		fruit[3] = new Fruit("车厘子","美国进口车厘子","4",20,100);
		fruit[4] = new Fruit("芒果","海南特产","5",100,100);
		fruit[5] = new Fruit("提子","新疆甜红提","6",50,150);
		//记录放进购物车的次数
		ArrayList<Card> cards = new ArrayList<>();
		//记录登入用户在user的位置
		int index = 0;
		do {
			boolean login = false;
			System.out.println("---------------欢迎来到某宝购物店---------------");
			System.out.println("1、到店里转转");
			System.out.println("2、注册新账号");
			System.out.println("3、再见");
			System.out.println("请选择您需要的服务");
			int choice = sc.nextInt();
			switch (choice) {
			case 2:
				System.out.println("---------------账号注册---------------");
				System.out.println("1、开始注册");
				System.out.println("2、返回上一级");
				System.out.println("请选择您需要的服务");
				int choice1 = sc.nextInt();
				if(choice1 == 1){		
					String name;
					do {
						boolean b = true;
						System.out.println("请输入注册用户名");
						name = sc.next(); 
						for(User user: users){
							if(user!= null && name.equals(user.name)){
								System.out.println("用户名重复请重新输入");
								b = false;
								break;
							}
						}
						if(b){
							break;
						}						
					} while (true);
					System.out.println("请输入注册密码");
					String pw = sc.next();
					System.out.println("请输入注册性别");
					String sex = sc.next();
					String phone;
					do {
						boolean b = true;
						System.out.println("请输入注册手机号");
						phone = sc.next();
						if(phone.length() != 11){
							System.out.println("手机格式错误请重新输入");
							continue;
						}
						for(User user: users){
							if(user != null && phone.equals(user.phone)){
								System.out.println("手机号重复请重新输入");
								b = false;
								break;
							}
						}
						if(b){
							break;
						}
					} while (true);
					System.out.println("请输入首充金额（首次充值 充300-500赠20，500以上赠50）：");
					double charge = sc.nextInt();
					if(charge >= 300 && charge <= 500){
						charge += 20;
					}else if(charge > 500){
						charge += 50;
					}else{
					}
					users[i] = new User(name,pw,phone,charge,"<普通会员>",1.0);
					System.out.println("注册成功");
					i++;
				}
				break;
			case 1:
				if(users[0] == null){
					System.out.println("无注册记录请返回注册");
					break;
				}
				System.out.println("---------------欢迎来到某宝购物店---------------");
				System.out.println("1、登入账号");
				System.out.println("2、返回上级");
				System.out.println("选择您需要的服务");
				int choice2 = sc.nextInt();
				if(choice2 == 1){
					boolean b = true;
					do {
						System.out.println("请输入用户名：");
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
							System.out.println("该用户不存在");
							continue;
						}
					} while (b);
					boolean c = true;
					do {
						System.out.println("请输入用户密码：");
						String pw = sc.next();
						if(pw.equals(users[index].pw)){
							c = false;
							login = true;
							System.out.println("登入成功");
							break;
						}
						if(c){
							System.out.println("密码错误");
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
				System.out.println("登录成功*");
				do {
					System.out.println("---------------欢迎来到某宝购物店---------------");
					System.out.println("1.查看商品");
					System.out.println("2.购买商品");
					System.out.println("3.查看购物车");
					System.out.println("4.查看个人信息");
					System.out.println("5.返回上一层");
					System.out.println("选择您需要的服务");
					int choose = sc.nextInt();
					switch (choose) {
					case 2:
						do {
							System.out.println("商品列表");
							for (int j = 0; j < fruit.length; j++) {
								System.out.println(
										"物品序号："+fruit[j].number+"  "
										+"商品："+fruit[j].name+"  "
										+"价格："+fruit[j].price+"  "
										+"限量剩余："+fruit[j].amount
								);
							}
							do {
								System.out.println("请输入购买的商品（序号）:");
								String number = sc.next();
								//判断序号是否正确
								boolean b = false;
								for(int k = 0; k < fruit.length; k++){
									if(number.equals(fruit[k].number)){
										//判断购物车中是否有重复商品
										b = true;
										//购物车为空
										System.out.println("您购买的是"+ fruit[k].name);
										if(cards.isEmpty()){
											do {
												System.out.println("请输入购买的数量:");
												int amount = sc.nextInt();
												if(amount > fruit[k].amount){
													System.out.println("数量超过商品总量，请重新输入");
													continue;
												}
												Card card = new Card(fruit[k].name, fruit[k].number, fruit[k].price, amount); 
												cards.add(card);
												fruit[k].amount -= amount;
												break;
											} while (true);
										//购物车不为空
										}else{
											boolean ifRepeat = false;
											do {
												System.out.println("请输入购买的数量:");
												int amount = sc.nextInt();
												//判断数量是否超过总数
												if(amount > fruit[k].amount){
													System.out.println("数量超过商品总量，请重新输入");
													continue;
												}else{
													//水果与购物车水果重复
													for(Card card: cards){
														if(card.number.equals(number)){
															card.amount += amount;
															fruit[k].amount -= amount; 
															ifRepeat = true;
															break;
														}
													}
													//水果与购物车水果不重复
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
									System.out.println("您输入有误请重新输入");
									continue;
								}else{
									System.out.println("商品加入购物车成功！");
									break;
								}
							} while (true);
							boolean boo = true;
							do {
								for(Card card: cards){
									System.out.println("您购买的商品是："+card.name+"   数量："+card.amount+"   单价："+card.price);
								}
								System.out.println("您还需要购买什么东西吗？[y/n]");
								String judge = sc.next();
								if(judge.equals("n")){
									boo = false;
									success = false;
									break;
								}else if(judge.equals("y")){
									break;
								}else{
									System.out.println("请重新选择");
								}
							} while (boo);
						} while (success);
						break;
					case 1:
						for(Fruit fruits: fruit){
							System.out.println("商品："+fruits.name+"  简述："+fruits.slogan);
						}
						System.out.println("按任意键退出");
						String any = sc.next();
						break;
					case 3:
						double sum = 0;
						System.out.println("---------------我的购物车---------------");
						for(Card card: cards){
							System.out.println("序号"+card.number+"   商品："+card.name+"   数量："+card.amount+"   单价："
									+card.price+"   小计："+(card.amount * card.price));
							sum += card.amount * card.price;
						}
						System.out.println("总价："+(sum*users[index].discount)+ users[index].title);
						Date date = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("北京时间：yyyy年MM月dd号");
						System.out.println(sdf.format(date));
						System.out.println("------------------------------");
						System.out.println("1.清空购物车（全部购买）");
						System.out.println("2.返回上一层");
						System.out.println("请选择");
						int choose3 = sc.nextInt();
						do {
							if(choose3 == 1){
								if(sum > users[index].charge){
									System.out.println("余额不足，请充值");
									break;
								}
								users[index].charge -= sum;
								if(sum > 500 && sum < 1500){
									System.out.println("恭喜购买成功，消费过500获得白银会员");
									users[index].title = "<白银会员>";
									users[index].discount = 0.98;
								}else if(sum > 1500 && sum < 3500){
									System.out.println("恭喜购买成功，消费过1500获得白金会员");
									users[index].title = "<白金会员>";
									users[index].discount = 0.95;
								}else if(sum > 3000){
									System.out.println("恭喜购买成功，消费过3000获得钻石会员");
									users[index].title = "<钻石会员>";
									users[index].discount = 0.9;
								}else{
									System.out.println("购买成功");
								}
								cards.clear();
								break;
							}else if(choose3 == 2){
								break;
							}else{
								System.out.println("请重新选择");
								break;
							}
						} while (true);
						break;
					case 4:
						System.out.println("尊敬的"+users[index].name+"用户您的信息如下：");
						System.out.println("会员："+users[index].title+"（"+(users[index].discount * 10)+"折）");
						System.out.println("账号："+users[index].name);
						System.out.println("手机号："+users[index].phone);
						System.out.println("剩余金额："+users[index].charge+"元");
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
