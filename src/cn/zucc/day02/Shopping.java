package cn.zucc.day02;
import java.util.*;
public class Shopping {
	Scanner sc =new Scanner(System.in);
	String adminAccount = "JadeBird";
	String adminPassword = "0000";
	String flag;
      public void login(){
    	  
    	  System.out.println("\t欢迎使用我行我素购物管理系统");
    	  System.out.println("\t\t1.登陆系统");
    	  System.out.println("\t\t2.退出");
    	  System.out.println("*********************");
    	  
    	  System.out.print("请选择，输入数字：");
    	  int num =sc.nextInt();
    	  switch(num){
    	   case 1:
    		   lg();
    		   if(flag.equals("success")){
    		   
    		   System.out.println("您登陆成功"+adminAccount);
    		   mainMenu();
    		   }
    		   else{
    			   System.out.print("您没权限，请重新登陆：\n");
    		       login();
    		       }
    		   break;
    	   case 2:
    		   System.out.print("谢谢使用");
    		   break;
    	  
    	  }
    	  
    	  
      }
      
      public void mainMenu(){
    	  System.out.println("\t我行我素购物管理系统主菜单");
    	  System.out.println("\t\t1.客户信息管理");
    	  System.out.println("\t\t2.真情回馈");
    	  System.out.println("*********************");
    	  System.out.print("请选择，输入数字或者按0返回上一级：");
    	  int num =sc.nextInt();
		    	  switch(num){
		    	  		case 1:
		    	  			customeManager();
		    	  			break;
		   	   			case 2:
		   	   				feedback();
		   	   				break;
		   	   			case 0:
		   	   				login();
		   	   				break;
   	  }
    	  
    	  
      }
      
      public void customeManager(){
    	 System.out.println("\t\t 客户信息管理");
    	  System.out.print("按0返回上一级：");
    	  int num =sc.nextInt();
		    	  switch(num){
		    	  	
		   	   			case 0:
		   	   			mainMenu();
		   	   				break;
		   	   				}
      }
      public void feedback(){
    	  System.out.println("\t我行我素购物管理系统真情回馈");
    	  System.out.println("\t\t1.幸运大放送");
    	  System.out.println("\t\t2.幸运抽奖");
    	  System.out.println("*********************");
    	  System.out.print("请选择，输入数字或者按0返回上一级：");
    	  int num =sc.nextInt();
    	
    	  switch(num){
    	  		case 1:
    	  			lucky();
    	  			break;
   	   			case 2:
   	   			 luckyDraw();
   	   				break;
   	   			case 0:
   	   			  mainMenu();
   	   				break;
   	   				}
       }
      public void lucky(){
    		  System.out.println("\t\t幸运大放送");
    	  System.out.print("按0返回上一级：");
    	  int num =sc.nextInt();
    	  switch(num){
    	  	
   	   			case 0:
   	   			feedback();
   	   				break;
   	   				}
      }
      
      public void luckyDraw(){
    		System.out.println("\t\t幸运抽奖");
    	  System.out.print("按0返回上一级：");
    	  int num =sc.nextInt();
		    	  switch(num){
		   	   			case 0:
		   	   			feedback();
		   	   				break;
		   	   				}
      }
      public void lg(){
    	  
    	  System.out.println("请输入用户名：");
    	  String account =sc.next();
    	  
    	  System.out.println("请输入密码：");
    	  String password =sc.next();
    	  if(account.equals(adminAccount)&&password.equals(adminPassword))
    		  flag = "success";
    	  else
    		  flag ="false";
    	   
    	  
    		  
    	  
    	  
      }
	
	
}
