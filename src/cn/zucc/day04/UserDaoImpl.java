package cn.zucc.day04;

public  class UserDaoImpl implements UserDao {
	String gender ;
    String userName;
    String userPassword;
    
    
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


	public void getUserInfo(){
		 System.out.println("�û�����Ϣ");
		 
		 System.out.println("�û�����"+userName);

		 System.out.println("�û����룺"+userPassword);
		
		 System.out.println("�û��Ա�"+gender);
		
		
	}

}
