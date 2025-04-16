import java.util.ArrayList;
import java.util.Scanner;

public class TicketingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean out = true;
		//记录user，i记录注册成功次数然后计入
		User []users = new User[100];
		int i = 0;
		//order功能需要数据
		Order orders[] = new Order[5];
		orders[0] = new Order("G101",100,50);
		orders[1] = new Order("G102",200,35);
		orders[2] = new Order("G103",300,30);
		orders[3] = new Order("G104",250,40);
		orders[4] = new Order("G105",150,45);
		//是否登录
		boolean ifLogin = false;
		//cart功能需要数据
		ArrayList<Cart> carts = new ArrayList<>(); 
		//z储存购买商品信息
		int z = 0;

		do {
			System.out.println("————————————欢迎使用购票系统————————————");
			System.out.println("1. 注册");
			System.out.println("2. 登录");
			System.out.println("3. 购买车票");
			System.out.println("4. 我的订单");
			System.out.println("5. 退出");
			System.out.println("—————————————————————————————————————");
			System.out.println("请输入需执行的操作");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean case1 = true;
				do {
					//判断用户名是否重复
					boolean cover = false;
					//判断用户名是否符合条件
					boolean judge = true;
					//判断重新修改用户名条件是否正确
					boolean reName = false;
					System.out.println("请输入注册用户名，长度大于6位只可以使用小写英文与数字");
					String name = sc.next();
					char []nameChar = name.toCharArray();
					//分开判断长度和具体字符；
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
									System.out.println("用户名重复请重新输入");
									cover = true;
									reName = true;
									break;
								}
							}
						}
						if(reName == false){
							System.out.println("请输入注册密码");
							String pw = sc.next();
							System.out.println("请输入注册邮箱");
							String email = sc.next();
							if(cover == false){
								users[i] = new User(name,pw, email);
								System.out.println("注册成功*");
								i++;
								case1 = false;
							}
						}
					}else{
						judge = false;
					}
					if(judge == false){
						System.out.println("用户名格式错误");
					}
				} while (case1);
				break;
			case 2:
				boolean case2 = true;
				//记录名字是否输错
				boolean compareNa = false;
				//记录密码是否输错
				boolean comparePw = false;
				//记录输错密码多少次
				int j = 0;
				do {
					boolean isName = true;
					do {
						System.out.println("请输入用户名");
						String name = sc.next();
						for(User user: users){
							if(user != null && name.equals(user.name)){
								compareNa = true;
								System.out.println("用户名正确");
								isName = false;
								break;
							}
						}
						if(!compareNa){
							System.out.println("用户名输入错误");
						}
					} while (isName);
					boolean isMail = true;
					do {
						System.out.println("请输入密码");
						String pw = sc.next();
						for(User user: users){
							if(user != null &&  pw.equals(user.pw)){
								System.out.println("登入成功");
								comparePw = true;
								isMail = false;
								break;
							}
						}
						if(comparePw == false){
							System.out.println("密码输入错误");
							//邮箱和用户名输入正确与否判断
							boolean enter = false;
							j++;
							if(j > 3){
								//一个可以重复的找回密码界面
								boolean find = true;
								do {
									System.out.println("找回密码功能");
									System.out.println("请输入用户名");
									String findName = sc.next();
									System.out.println("请输入邮箱地址");
									String findMail = sc.next();
									//查询用户名位于数组位置
									int k = 0;
									//比对邮箱和用户名
									for(User user: users){
										if(user != null){
											if(findName.equals(user.name) && findMail.equals(user.email)){
												enter = true;
												k++;
												break;
											}
										}
									}
									//输入错误
									if( enter == false){
										System.out.println("输入错误");
										System.out.println("是否继续输入【y/n】");
										String findChioce = sc.next();
										if(findChioce.equals("n")){
											find = false;
											case2 = false;
										}else {
											find = true;
										}
									} else {
									    System.out.println("请输入新密码");
									    String newPw = sc.next();
									    if (k > 0 && users[k-1] != null) {
									        users[k-1].setPw(newPw);
									        System.out.println("设置成功");
									        find = false;
									        case2 = false;
									        isMail = false;
									    } else {
									        System.out.println("无效操作，用户信息不存在");
									        // 可能需要进行额外处理，比如重新输入等操作
									    }
									}
								} while (find);
							}else{
								System.out.println("还可以输入"+(4-j)+"次,进入忘记密码界面");
								continue;
							}
						//密码正确后进入购买车票
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
						//有无车次
						boolean findCar = false;
						System.out.println("购买车票");
						System.out.println("车次\t价格\t数量");
						for(Order order: orders){
							System.out.println(order.num+"\t"+order.price+"\t"+order.amount);
						}
						System.out.println("请输入购买的车次");
						String car = sc.next();
						//记录车的位置
						int c = 0;
						for(Order order: orders){
							if( car.equals(order.num) ){
								findCar = true;
								break;
							}
							c++;
						}
						if(findCar){
							System.out.println("请输入购买的数量");
							int carNum = sc.nextInt();
							if( carNum <= orders[c].amount ){
								if(carts != null){
								//购物车的车次重复
//									for(Order order: orders){
										for(Cart cart:carts){
											if(car.equals(cart.num)){
												orders[c].amount -= carNum;
												cart.amount += carNum;
												System.out.println("购买成功");
												z++;
												buyRe = false;
												reCart = true;
												break;
											}
										}
//										if (reCart) {
//									    	break; // 在找到匹配项时退出外部循环
//									    }
//									}
								}
								//车次不重复
//								if(reCart == false){
//									//储存不同车次购买商品信息，记录cart的购买数据
//									carts[z] = new Cart(car, carNum);
//									System.out.println("购买成功");
//									//改变该车次的order数量
//									orders[c].amount = orders[c].amount - carNum;
//									z++;
//									buyRe = false;
//								}
								if (reCart == false) {
								    // 储存不同车次购买商品信息，记录cart的购买数据
								    carts.add(new Cart(car, carNum));
								    System.out.println("购买成功");
								    // 改变该车次的order数量
								    orders[c].amount -= carNum;
								    z++;
								    buyRe = false;
								}
							}else{
								System.out.println("余票不足！请重新输入");
							}
						}else{
							System.out.println("查无此车次！请重新输入");
						}
						//ifYes继续
						boolean ifYes = true;
						do {
							System.out.println("是否继续购票？[Y/N]");
							String a = sc.next();
							if("Y".equals(a)){
								ifYes = false;
								buyRe = true;
							}else if("N".equals(a)){
								ifYes = false;
								break;
							}else{
								System.out.println("输入错误请重新输入");
							}
						} while (ifYes);
					} while (buyRe);
				}else{
					System.out.println("请先登录后再购票");
				}
				break;
			case 4:
				boolean case4 = true;
				do {
					if(ifLogin == true){
						System.out.println("我的订单：");
						for (Cart cart : carts) {
//						    if (cart != null) {
//						    	for(Order order:orders){
//						    		if(order.num.equals(cart)){
						    			System.out.println("车次："+cart.num+"\t"+"已购买数量："+cart.amount);
//						    		}
//						    	}
						        
//						    }
						}
						System.out.println("输入N返回菜单");
						String last = sc.next();
						if(last.equals("N")){
							case4 = false;
						}
					}else{
						System.out.println("请先登录后再查看我的订单");
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
