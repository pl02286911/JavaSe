package cn.zucc.day02;
import java.util.*;
public class Shopping {
	Scanner sc =new Scanner(System.in);
	String adminAccount = "JadeBird";
	String adminPassword = "0000";
	String flag;
      public void login(){
    	  
    	  System.out.println("\t��ӭʹ���������ع������ϵͳ");
    	  System.out.println("\t\t1.��½ϵͳ");
    	  System.out.println("\t\t2.�˳�");
    	  System.out.println("*********************");
    	  
    	  System.out.print("��ѡ���������֣�");
    	  int num =sc.nextInt();
    	  switch(num){
    	   case 1:
    		   lg();
    		   if(flag.equals("success")){
    		   
    		   System.out.println("����½�ɹ�"+adminAccount);
    		   mainMenu();
    		   }
    		   else{
    			   System.out.print("��ûȨ�ޣ������µ�½��\n");
    		       login();
    		       }
    		   break;
    	   case 2:
    		   System.out.print("ллʹ��");
    		   break;
    	  
    	  }
    	  
    	  
      }
      
      public void mainMenu(){
    	  System.out.println("\t�������ع������ϵͳ���˵�");
    	  System.out.println("\t\t1.�ͻ���Ϣ����");
    	  System.out.println("\t\t2.�������");
    	  System.out.println("*********************");
    	  System.out.print("��ѡ���������ֻ��߰�0������һ����");
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
    	 System.out.println("\t\t �ͻ���Ϣ����");
    	  System.out.print("��0������һ����");
    	  int num =sc.nextInt();
		    	  switch(num){
		    	  	
		   	   			case 0:
		   	   			mainMenu();
		   	   				break;
		   	   				}
      }
      public void feedback(){
    	  System.out.println("\t�������ع������ϵͳ�������");
    	  System.out.println("\t\t1.���˴����");
    	  System.out.println("\t\t2.���˳齱");
    	  System.out.println("*********************");
    	  System.out.print("��ѡ���������ֻ��߰�0������һ����");
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
    		  System.out.println("\t\t���˴����");
    	  System.out.print("��0������һ����");
    	  int num =sc.nextInt();
    	  switch(num){
    	  	
   	   			case 0:
   	   			feedback();
   	   				break;
   	   				}
      }
      
      public void luckyDraw(){
    		System.out.println("\t\t���˳齱");
    	  System.out.print("��0������һ����");
    	  int num =sc.nextInt();
		    	  switch(num){
		   	   			case 0:
		   	   			feedback();
		   	   				break;
		   	   				}
      }
      public void lg(){
    	  
    	  System.out.println("�������û�����");
    	  String account =sc.next();
    	  
    	  System.out.println("���������룺");
    	  String password =sc.next();
    	  if(account.equals(adminAccount)&&password.equals(adminPassword))
    		  flag = "success";
    	  else
    		  flag ="false";
    	   
    	  
    		  
    	  
    	  
      }
	
	
}
