package com.edu.seiryo.dao;

import java.sql.ResultSet;
import com.edu.seiryo.daoImp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;

public class UserDao implements UserDaoImp{
	//��ס��ǰ�����˺�
	private static User iUser = new User();
	
	public static User getiUser() {
		return iUser;
	}

	public static void setiUser(User iUser) {
		UserDao.iUser = iUser;
	}
	private ResultSet rs = null;
	/**
	 * �洢ע��user��Ϣ
	 * @param user 
	 */
	public boolean registUser(User user)  {
		String sql = "INSERT INTO User_Info (User_Name,User_pwd,User_phone,User_Money,User_Date,User_vip) VALUES (?,?,?,?,?,?)";
	    boolean bo = false;
	    if(user.getUser_Money() >= 300 || user.getUser_Money() <= 500){
	    	user.setUser_Money(user.getUser_Money()+20);
	    }
	    if (user.getUser_Money() > 500) {
	    	user.setUser_Money(user.getUser_Money()+50);
		}
	    try {
			bo = DBUtil.executeUpdate(sql, user.getUser_Name(),user.getUser_pwd(),user.getUser_phone(),user.getUser_Money(),user.getUser_Date(),user.getUser_vip());
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return bo;
	}

	/**
	 * ������֤�������Ƿ���û���ע��
	 * @return bo
	 */
	public boolean loginUser(String userName, String userPwd) {
		boolean bo = false;
	    String sql = "SELECT User_Id FROM User_Info WHERE User_Name = ? AND User_pwd = ?";
	    try {
			rs = DBUtil.executeQuery(sql, userName, userPwd);
			bo = rs.next();
			if(bo){
				iUser.setUser_Name(userName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DBUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return bo;
	}
	/*
	 * �Ƿ��������û�
	 * @param String userName
	 * @return boolean
	 */
	public boolean hadSavedUserName(String userName) {
		String sql = "select User_Id from User_Info where User_Name = ?";
       ResultSet rs = null;
       boolean bo = false;
       try {
           rs = DBUtil.executeQuery(sql,userName);
           bo = rs.next();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }finally {
           try {
               DBUtil.close();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
       return bo;
	}
	/*
	 * �Ƿ��ظ��ֻ���
	 * @param String userName
	 * @return boolean
	 */
	public boolean ifSameNumber(String phoneNumber) {
		String sql = "select User_Id from User_Info where User_phone = ?";
       ResultSet rs = null;
       boolean bo = false;
       try {
           rs = DBUtil.executeQuery(sql,phoneNumber);
           bo = rs.next();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }finally {
           try {
               DBUtil.close();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
       return bo;
	}
	/*
	 * �������ڵ�¼���û�����Ϣ
	 * @return Users
	 */
	public User iUser(){
		String sql = "select User_Id,User_Name,User_pwd,User_phone,User_Money,User_vip from User_Info where User_Name = ?";
        ResultSet rs = null;
		try {
            rs = DBUtil.executeQuery(sql,iUser.getUser_Name());
            if(rs.next()){
            	iUser = new User();
            	iUser.setUser_Id(rs.getInt(1));
            	iUser.setUser_Name(rs.getString(2));
            	iUser.setUser_pwd(rs.getString(3));
            	iUser.setUser_phone(rs.getString(4));
            	iUser.setUser_Money(rs.getDouble(5));
            	iUser.setUser_vip(rs.getInt(6));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DBUtil.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return iUser;
	}
	/*
	 * ���˺��û�ʣ����仯;
	 */
	public boolean changeBalance(int id,double balance){
		boolean bo = false;
		String sql = "update User_Info set User_Money = ? where User_Id = ?";
		try {
			bo = DBUtil.executeUpdate(sql, balance, iUser.getUser_Id());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * ���˺��û����ݿ��Ա��Ϣ�仯
	 */
	public boolean changeVip(int id,int vip){
		boolean bo = false;
		String sql = "update User_Info set User_vip = ? where User_Id = ?";
		try {
			bo = DBUtil.executeUpdate(sql,vip, iUser.getUser_Id());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	/*
	 * ����ɹ���ı䵱ǰϵͳ�����iUser��vip��money״̬
	 */
	public boolean changIuserVip(double balance,int vip){
		iUser.setUser_Money(balance);
		iUser.setUser_vip(vip);
		return true;
	}
}
