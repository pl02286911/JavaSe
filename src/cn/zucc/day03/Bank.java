package cn.zucc.day03;
import java.util.*;
public class Bank {
	Scanner sc =new Scanner(System.in);
	int sum=0;
	
	  public void login(){
		  System.out.println("1.���  2.ȡ�� 0.�˳�");
		  System.out.print("ѡ�����ҵ��");
		  int num =sc.nextInt();
		  switch(num){
		  case 1:
		
			  deposit();
			
			  break;
		  case 2:
			
			  draw();
	
			  break;
		  
		  case 0:
			  System.out.print("ллʹ��");
			  break;
		  
		  }
	  
	  }
	
      public void deposit(){
    	  System.out.print("���������");
		  int depositMoney =sc.nextInt();		 
		  System.out.println("���ɹ�");
		   sum=sum+depositMoney;
		  System.out.println("��ǰ��"+sum);
    	      
    	  login();
    	  
    	  
    	  
      }
      
      
      public void draw(){
    	  System.out.print("������ȡ���");
		  int drawMoney =sc.nextInt();
		   System.out.println("ȡ��ɹ�");	   
		   sum=sum-drawMoney;
		   System.out.println("��ǰ��"+sum);
 	      
		   login();
    	  
      }
}
 