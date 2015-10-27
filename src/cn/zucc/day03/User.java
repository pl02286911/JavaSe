package cn.zucc.day03;

public class User {
	private int uId;
	private String uName;
	private String uPass;
	private String uSex;
	

	public String setuName(String uName){
		return this.uName=uName;
	}
	public String getuName(){
		return uName;
		
		 
	}
	public String setuPass(String uPass){
		return this.uPass=uPass;
	}
	public String getuPass(){
		return uPass;
	}
	public int setuId(int uId){
		return this.uId=uId;
	}
	public int getuId(){
		return uId;
	}
	public void setuSex(String uSex){
		 if(uSex.equals("男")||uSex.equals("女"))
			 this.uSex=uSex;
		 else 
				System.out.println("输入性别有误");
	
	}
	public String getuSex(){
		return uSex;
	}
	public void getUserInfo(){
		System.out.println(uName);
		System.out.println(uPass);
		System.out.println(uSex);
		
	}
}
