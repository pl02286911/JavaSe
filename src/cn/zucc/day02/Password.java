package cn.zucc.day02;

public class Password {
         String account;
         String passwd;
         String newPs1;
         String newPs2;
         String flag;
         public void show(){
        	 
        	 if(newPs1.equals(newPs2)){
        		 System.out.print("修改密码成功，您的新密码为："+newPs1);
        	      flag="success";	 
        	 }
        	 else   {    		 
        		 System.out.print("您两次输入的密码不一致，请重新输入\n");
        		 flag="false";	  
        	 }
        	 
        	 
         }
}
