package com.edu.service;

import java.util.Scanner;

import com.edu.seiryo.DBUtil;
import com.seiryo.dao.UserDao;
import com.seiryo.entity.User;

public class UserService {
	Scanner sc = new Scanner(System.in);
	UserDao userDao = new UserDao();
	/*
	 * ע��
	 */
	public void register(){
		//�ж��û����Ƿ��ظ�
		boolean ifNameRepeat = false;
		//�ж��û����Ƿ��������
		boolean ifNameStandard = false;
		System.out.println("������ע���û��������ȴ���6λֻ����ʹ��СдӢ��������");
		String userName = sc.next();
		char []nameChar = userName.toCharArray();
		//�ֿ��жϳ��Ⱥ;����ַ���
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
					System.out.println("������ע������");
					String userPwd = sc.next();
					System.out.println("������ע������");
					String email = sc.next();
					User user = new User(userName,userPwd,email);
					userDao.saveRegister(user);
					System.out.println("ע��ɹ�");
				}
			}else{
				System.out.println("�û�����ʽ����");
				register();
				return;
			}
		}else{
			System.out.println("�û��������6λ");
			register();
			return;
		}
	}
	/*
	 * ��¼��֤
	 */
		/*
		 * n��¼��¼ʧ�ܴ���
		 */
		private	int n = 0;
	public boolean loginQuery(){
		boolean bo = false;
		boolean returnMain = false;
		boolean ifLoginSuccess = false;
		boolean pwCircle = true;
		System.out.println("�������û���");
		String userName = sc.next();
		while(pwCircle){
			System.out.println("����������");
			String userPwd = sc.next();
			boolean ifhadAccount = userDao.loginQuery(userName, userPwd);
			if (ifhadAccount) {
				System.out.println("��¼�ɹ�");
				ifLoginSuccess = true;
				pwCircle = false;
				//1��ǰ���δ������һ����ȷ�����ﷵ�����Ƿ�ɹ�����û��ʹ��
				return ifLoginSuccess;
			}else{
				n++;
				if (n == 3) {
					n = 0;
					//������������
					returnMain = resetPwd();
					if (returnMain) {
						pwCircle = false;
					}
				}else{
					int whichWrong = userDao.getWhichWrong();
					if (whichWrong == 1) {
						System.out.println("�û����������");
						//2������ԭ���������⡣�ɹ����⣬��ε�pwCircle����true��pwCircle == false
						ifLoginSuccess = loginQuery();
						if (ifLoginSuccess) {
							//3��������circle��ѭ��
							pwCircle = false;
						}
						return ifLoginSuccess;
					}else if(whichWrong == 2){
						System.out.println("�����������");
					}else if(whichWrong == -1){
						System.out.println("�����ڸ��û�");
						ifLoginSuccess = loginQuery();
						if (ifLoginSuccess) {
							//3��������circle��ѭ��
							pwCircle = false;
						}
						return ifLoginSuccess;
					}else{
						System.out.println("��������");
						ifLoginSuccess = loginQuery();
						if (ifLoginSuccess) {
							//3��������circle��ѭ��
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
	 * ������������
	 */
	private boolean resetPwd(){
		boolean returnMain = false;
		System.out.println("-----------------");
		System.out.println("�һ����빦��");
		System.out.println("�������û���");
		String findName = sc.next();
		System.out.println("�����������ַ");
		String findMail = sc.next();
		boolean ifUserExists = userDao.ifUserExists(findName,findMail);
		if (ifUserExists) {
			System.out.println("������������");
		    String newPw = sc.next();
		    userDao.resetPwd(findName, newPw);
		    returnMain = true;
		    System.out.println("�޸�����ɹ�");
		    return returnMain;
		}else{
			boolean notValid = true;
			while(notValid){
				System.out.println("�������");
				System.out.println("�Ƿ�������롾y/n��");
				String ifContinue = sc.next();
				if(ifContinue.equals("y")){
					returnMain = resetPwd();
					notValid = false;
				}else if(ifContinue.equals("n")){
					notValid = false;
					returnMain = true;
				}else{
					System.out.println("�����������������");
				}
			}
		}
		return returnMain;
	}
}
