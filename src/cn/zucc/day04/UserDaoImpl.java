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
		 System.out.println("用户名信息");
		 
		 System.out.println("用户名："+userName);

		 System.out.println("用户密码："+userPassword);
		
		 System.out.println("用户性别："+gender);
		
		
	}

}
