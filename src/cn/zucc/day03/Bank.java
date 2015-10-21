package cn.zucc.day03;
import java.util.*;
public class Bank {
	Scanner sc =new Scanner(System.in);
	int sum=0;
	
	  public void login(){
		  System.out.println("1.存款  2.取款 0.退出");
		  System.out.print("选择办理业务：");
		  int num =sc.nextInt();
		  switch(num){
		  case 1:
		
			  deposit();
			
			  break;
		  case 2:
			
			  draw();
	
			  break;
		  
		  case 0:
			  System.out.print("谢谢使用");
			  break;
		  
		  }
	  
	  }
	
      public void deposit(){
    	  System.out.print("请输入存款金额：");
		  int depositMoney =sc.nextInt();		 
		  System.out.println("存款成功");
		   sum=sum+depositMoney;
		  System.out.println("当前余额："+sum);
    	      
    	  login();
    	  
    	  
    	  
      }
      
      
      public void draw(){
    	  System.out.print("请输入取款金额：");
		  int drawMoney =sc.nextInt();
		   System.out.println("取款成功");	   
		   sum=sum-drawMoney;
		   System.out.println("当前余额："+sum);
 	      
		   login();
    	  
      }
}
 