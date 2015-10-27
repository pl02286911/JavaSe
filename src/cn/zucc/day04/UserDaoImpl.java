package cn.zucc.day04;
import java.util.*;
public  class UserDaoImpl implements UserDao {
	String gender ;
    String userName;
    String userPassword;
    
    Scanner sc= new Scanner(System.in);
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void addUser(User user){
		
		 System.out.println("输入用户名");
		 this.userName=sc.next();
		 
		 System.out.println("输入用户密码");
		 this.userPassword=sc.next();
		
		 System.out.println("输入用户性别");
			this.gender=sc.next();
		
	};
	public void findUser(User user)
	{  
		System.out.println("输入查找用户名");
		if(this.userName.equals(sc.next()))
			System.out.println("找到该用户");
		else
			System.out.println("未找到该用户");
		 
		
	}
	public void updateUser(User user){
		
		System.out.println("输入修改用户名");
		if(this.userName.equals(sc.next()))
		{
		 System.out.println("输入新用户密码");
		 this.userPassword=sc.next();
		}
		else
			System.out.println("未找到该用户");
		
	}
	public void getUserInfo(){
		 System.out.println("用户名信息");
		 
		 System.out.println("用户名："+userName);

		 System.out.println("用户密码："+userPassword);
		
		 System.out.println("用户性别："+gender);
		
		
	}

}
