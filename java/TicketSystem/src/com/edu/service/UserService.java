package com.edu.service;

import java.util.Scanner;

import com.edu.seiryo.DBUtil;
import com.seiryo.dao.UserDao;
import com.seiryo.entity.User;

public class UserService {
	Scanner sc = new Scanner(System.in);
	UserDao userDao = new UserDao();
	/*
	 * 注册
	 */
	public void register(){
		//判断用户名是否重复
		boolean ifNameRepeat = false;
		//判断用户名是否符合条件
		boolean ifNameStandard = false;
		System.out.println("请输入注册用户名，长度大于6位只可以使用小写英文与数字");
		String userName = sc.next();
		char []nameChar = userName.toCharArray();
		//分开判断长度和具体字符；
		if(userName.length() > 6){
			for (int j = 0; j < nameChar.length; j++) {
				if( (nameChar[j] >= 97 && nameChar[j] <= 122) || 
						(nameChar[j] >= 48 && nameChar[j] <= 57)){
					ifNameStandard = true;
				}else{
					ifNameStandard = false;
					break;
				}
			}
			if(ifNameStandard){
				ifNameRepeat = userDao.ifNameRepeat(userName);
				if (ifNameStandard) {
					System.out.println("请输入注册密码");
					String userPwd = sc.next();
					System.out.println("请输入注册邮箱");
					String email = sc.next();
					User user = new User(userName,userPwd,email);
					userDao.saveRegister(user);
					System.out.println("注册成功");
				}
			}else{
				System.out.println("用户名格式错误");
				register();
				return;
			}
		}else{
			System.out.println("用户名需大于6位");
			register();
			return;
		}
	}
	/*
	 * 登录验证
	 */
		/*
		 * n记录登录失败次数
		 */
		private	int n = 0;
	public boolean loginQuery(){
		boolean bo = false;
		boolean returnMain = false;
		boolean ifLoginSuccess = false;
		boolean pwCircle = true;
		System.out.println("请输入用户名");
		String userName = sc.next();
		while(pwCircle){
			System.out.println("请输入密码");
			String userPwd = sc.next();
			boolean ifhadAccount = userDao.loginQuery(userName, userPwd);
			if (ifhadAccount) {
				System.out.println("登录成功");
				ifLoginSuccess = true;
				pwCircle = false;
				//1、前几次错误，最后一次正确，这里返回了是否成功，但没有使用
				return ifLoginSuccess;
			}else{
				n++;
				if (n == 3) {
					n = 0;
					//进入忘记密码
					returnMain = resetPwd();
					if (returnMain) {
						pwCircle = false;
					}
				}else{
					int whichWrong = userDao.getWhichWrong();
					if (whichWrong == 1) {
						System.out.println("用户名输入错误");
						//2、假如原来错误在这。成功后到这，这段的pwCircle还是true，pwCircle == false
						ifLoginSuccess = loginQuery();
						if (ifLoginSuccess) {
							//3、让这层的circle不循环
							pwCircle = false;
						}
						return ifLoginSuccess;
					}else if(whichWrong == 2){
						System.out.println("密码输入错误");
					}else if(whichWrong == -1){
						System.out.println("不存在该用户");
						ifLoginSuccess = loginQuery();
						if (ifLoginSuccess) {
							//3、让这层的circle不循环
							pwCircle = false;
						}
						return ifLoginSuccess;
					}else{
						System.out.println("发生错误");
						ifLoginSuccess = loginQuery();
						if (ifLoginSuccess) {
							//3、让这层的circle不循环
							pwCircle = false;
						}
						return ifLoginSuccess;
					}
				}
			}
		}
		return ifLoginSuccess;
	}
	/*
	 * 重新设置密码
	 */
	private boolean resetPwd(){
		boolean returnMain = false;
		System.out.println("-----------------");
		System.out.println("找回密码功能");
		System.out.println("请输入用户名");
		String findName = sc.next();
		System.out.println("请输入邮箱地址");
		String findMail = sc.next();
		boolean ifUserExists = userDao.ifUserExists(findName,findMail);
		if (ifUserExists) {
			System.out.println("请输入新密码");
		    String newPw = sc.next();
		    userDao.resetPwd(findName, newPw);
		    returnMain = true;
		    System.out.println("修改密码成功");
		    return returnMain;
		}else{
			boolean notValid = true;
			while(notValid){
				System.out.println("输入错误");
				System.out.println("是否继续输入【y/n】");
				String ifContinue = sc.next();
				if(ifContinue.equals("y")){
					returnMain = resetPwd();
					notValid = false;
				}else if(ifContinue.equals("n")){
					notValid = false;
					returnMain = true;
				}else{
					System.out.println("输入错误请重新输入");
				}
			}
		}
		return returnMain;
	}
}
