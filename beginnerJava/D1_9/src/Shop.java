
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		boolean bo = true;
		Scanner sc = new Scanner(System.in);
		User []users = new User[100];
		//记录总注册次数的j
		int j = 0;
		//初始化购物车数组
		PersonalCart []carts = new PersonalCart[100];
		do {
			System.out.println("---------------欢迎来到某宝购物店---------------");
			System.out.println("1、到店里转转");
			System.out.println("2、注册新账号");
			System.out.println("3、再见");
			System.out.println("您需要点什么吗？\t请选择您需要的服务");
			String choose1 = sc.next();
			boolean boo1 = true;
			switch (choose1) {
			case "1":
				do {
					System.out.println("---------------欢迎来到某宝购物店---------------");
					System.out.println("1、登入账号");
					System.out.println("2、返回上级");
					System.out.println("选择您需要的服务");
					int login = sc.nextInt();
					switch (login) {
					case 1:
						boolean match = false;
						System.out.println("请输入用户名：");
						String name = sc.next();
						System.out.println("请输入用户密码：");
						String pw = sc.next();
						for(User user : users){
							if(user != null && name.equals(user.name) && pw.equals(user.pw)){
								System.out.println("登入成功*");
								match = true;
								break;
							}
						}
						if(match == false){
							System.out.println("用户名不存在或密码错误");
						}else{
							boolean second = true;
							do {
								System.out.println("---------------欢迎来到某宝购物店---------------");
								System.out.println("1.查看商品");
								System.out.println("2.购买商品");
								System.out.println("3.查看购物车");
								System.out.println("4.查看个人信息");
								System.out.println("5.返回上一层");
								System.out.println("选择您需要的服务");
								int choose2 = sc.nextInt();
								switch (choose2) {
								case 1:
									System.out.println("物品序号：1   商品：苹果  简述：烟台大苹果");
									System.out.println("物品序号：2  商品：菠萝  简述：台湾特大菠萝");
									System.out.println("物品序号：3  商品：菠萝  简述：菲律宾甜香蕉");
									System.out.println("物品序号：4  商品：车厘子  简述：美国进口车厘子");
									System.out.println("物品序号：5  商品：芒果  简述：海南特产");
									System.out.println("物品序号：6  商品、提子  简述：新疆甜红提");
									System.out.println("按任意键退出");
									String exitRandon = sc.next();
									break;
								case 2:
									Fruit []fruits = new Fruit[6];
									fruits[0] = new Fruit(1,"苹果",100.0,20);
									fruits[1] = new Fruit(2,"菠萝",100.0,100);
									fruits[2] = new Fruit(3,"菠萝",50.0,100);
									fruits[3] = new Fruit(4,"车厘子",20.0,100);
									fruits[4] = new Fruit(5,"芒果",100.0,100);
									fruits[5] = new Fruit(6,"提子",50.0,150);
									
									boolean judgeFruit = true;
									int i = 0;
									do {
										boolean exist = false;
										System.out.println("商品列表");
										System.out.println("物品序号：1   商品：苹果  价格：100.0  限量剩余：20");
										System.out.println("物品序号：2  商品：菠萝  价格：100.0  限量剩余：100");
										System.out.println("物品序号：3  商品：菠萝  价格：50.0  限量剩余：100");
										System.out.println("物品序号：4  商品：车厘子  价格：20.0  限量剩余：100");
										System.out.println("物品序号：5  商品：芒果  价格：100.0  限量剩余：100");
										System.out.println("物品序号：6  商品、提子  价格：50.0  限量剩余：150");
										System.out.println("请输入买的物品（序号）");
										int fruitId = sc.nextInt();
										for(Fruit fruit : fruits){
											if(fruitId == fruit.number){
												System.out.println("您选择的商品是："+ fruits[fruitId - 1].fruitName);
												exist = true;
											}
										}
										if(exist == false){
											System.out.println("您的输入有误，请重新输入");
										}else{
											System.out.println("请输入购买物品的个数");
											int fruitAmount = sc.nextInt();
											if(fruitAmount <= fruits[fruitId - 1].amount){
												System.out.println("你购买的是"+ fruits[fruitId - 1].fruitName+" "+fruitAmount+"件");
												System.out.println("您还需要购买什么东西吗？[y/n]");
												String yesOr = sc.next();
												if(yesOr.equals("n")){
													for (int k = 0; k <= i; k++) {
														carts[k].setNumber(fruitId - 1);
														carts[k].setAmount(fruitAmount);
														// fruitId 水果编号找对应价格的计算方法
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
													System.out.println("商品加入购物车成功*");
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
										System.out.println("---------------我的购物车---------------");
										for(PersonalCart cart : carts){
											if(cart != null){
												System.out.println("序号："+cart.getNumber()+"  商品名："+cart.getFruitName()+"  数量："+cart.getAmount()+"  单价"+cart.printPrice()+"  小计"+cart.getPrice());
												sum += cart.getPrice();
											}
										}
										System.out.println("总价格："+ sum);
										Date date = new Date();
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
										System.out.println("北京时间  "+sdf.format(date));
										System.out.println("------------------------------");
										System.out.println("1.清空购物车（全部购买）");
										System.out.println("2.返回上一层");
										System.out.println("请选择");
										int chooseCard = sc.nextInt();
										switch (chooseCard) {
										case 1:
											if(sum > 500 && sum < 1500){
												System.out.println("恭喜购买成功，消费过500获得白银会员");
											}else if(sum > 1500 && sum < 3500){
												System.out.println("恭喜购买成功，消费过1500获得白金会员");
											}else if(sum > 3000){
												System.out.println("恭喜购买成功，消费过3000获得钻石会员");
											}else{
												System.out.println("购买成功");
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
					System.out.println("---------------欢迎来到某宝购物店---------------");
					System.out.println("1、开始注册");
					System.out.println("2、返回上级");
					System.out.println("选择您需要的服务");
					int sign = sc.nextInt();
					switch (sign) {
					case 1:
						boolean bool = false;
						System.out.println("请输入想注册的用户名");
						String name = sc.next();
						System.out.println("请输入密码");
						String pw = sc.next();
						System.out.println("请输入用户性别");
						String sex = sc.next();
						System.out.println("请输入手机号");
						String phone = sc.next();
						System.out.println("请输入首冲金额(首次充值 冲300-500赠20，500以上赠50)");
						int money = sc.nextInt();
						if(j > 0){
							//判断数组数据是否重复
							for(User user : users){
								if( user != null&&(name.equals(user.name) || phone.equals(user.phone))){
									System.out.println("用户名或手机号重复");
									bool = true;
									break;
								}
							}
							//全筛过符合条件
							if(bool == false){
								users[j] = new User(name,pw,sex,phone,money);
								System.out.println("注册成功*");
								j++;
							}
						}else{
							users[j] = new User(name,pw,sex,phone,money);
							System.out.println("注册成功*");
							j++;
						}
						//实现登入后界面的上一层是主页面，这里不能跳出该层循环
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
