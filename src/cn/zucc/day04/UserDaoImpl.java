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
		
		 System.out.println("�����û���");
		 this.userName=sc.next();
		 
		 System.out.println("�����û�����");
		 this.userPassword=sc.next();
		
		 System.out.println("�����û��Ա�");
			this.gender=sc.next();
		
	};
	public void findUser(User user)
	{  
		System.out.println("��������û���");
		if(this.userName.equals(sc.next()))
			System.out.println("�ҵ����û�");
		else
			System.out.println("δ�ҵ����û�");
		 
		
	}
	public void updateUser(User user){
		
		System.out.println("�����޸��û���");
		if(this.userName.equals(sc.next()))
		{
		 System.out.println("�������û�����");
		 this.userPassword=sc.next();
		}
		else
			System.out.println("δ�ҵ����û�");
		
	}
	public void getUserInfo(){
		 System.out.println("�û�����Ϣ");
		 
		 System.out.println("�û�����"+userName);

		 System.out.println("�û����룺"+userPassword);
		
		 System.out.println("�û��Ա�"+gender);
		
		
	}

}
