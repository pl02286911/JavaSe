package cn.zucc.day04;
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
      
		  // Bus bus = new Bus(20);
		   // bus.print();

		/* Dog dog =new Dog();
		 Penguin pen=new Penguin();
	
		 dog.setName("��");
		 dog.setHealth(100);
		 dog.setLove(20);
		 dog.setStrain("����Ȯ ");
		
		 pen.setName("��");
		 pen.setHealth(100);
		 pen.setLove(20);
		 pen.setSex("Q�� ");
	
		

		dog.print();
		pen.print();
		
		 Scanner sc= new Scanner(System.in);	
		 Dog dog =new Dog();
		 Penguin pen=new Penguin();
	
		System.out.println("��ӭ��������� ");
		System.out.print("������Ҫ�����ĳ������� :");
		String name =sc.next();
		
		dog.setHealth(100);
		dog.setLove(20);
		pen.setHealth(100);
		pen.setLove(20);
		
		System.out.print("������Ҫ�����ĳ�������(1.����2.��� ): ");
		 int num1=sc.nextInt();
		 switch(num1){	 
		 	case 1:
			 dog.setName(name);
			 System.out.print("������Ҫ�����ĳ�������");
			 String dogStrain=sc.next();	 			 
			 dog.setStrain(dogStrain);	
			 dog.print();	 
			 break;
			 
		 	case 2:
			 pen.setName(name);
			 System.out.print("������Ҫ�����ĳ�������(1.Q��2.Q��)");
			 int num3 =sc.nextInt();	 
			 switch(num3){		 
			 	case 1:
				 pen.setSex("Q��");
				 break;
			 	case 2:
				 pen.setSex("Q��");
				 break;
		 
			 }
			 	pen.print();
			 		break;
		 
		 }
		 
		UsbImplement usb=new UsbImplement();
		  usb.service();
		System.out.print(Usb.i); 
	
		Scanner sc=new Scanner(System.in);
		String flag="n";
		Pet pet=new Penguin();
		pet.setHealth(100);
		pet.setLove(20);
	
		
		Master master =new Master();
		do{
		      master.playPet(pet);
		     	while(pet.getHealth()<60){
		            	System.out.println("������");              
		                 master.cure(pet);
		                 }
		                 System.out.print("\n�Ƿ����(y/n)"); 
		                 flag=sc.next();
	           
			}while(flag.equals("y"));
		
			
			if(password.length()<6)
			 System.out.print("���볤�Ȳ�С��6λ");
		 else 
			 System.out.print("ע��ɹ�");
	      	
	      		if(account.equals("TOM") && password.equals("1234567"))
				 System.out.print("��½�ɹ�");
			 		else 
				 System.out.print("�˺Ż����벻ƥ��");
	
	      	
	   
	      	 	
		 
		 System.out.print("�������û���:");
		 String account = sc.next();
		 
		 System.out.print("����������:");
		 String password = sc.next();

   		if(account.equalsIgnoreCase("TOM") && password.equalsIgnoreCase("1234567"))
			 System.out.print("��½�ɹ�");
		 		else 
			 System.out.print("�˺Ż����벻ƥ��");
   		
		
		  String  a ="ѧ��\t�ɼ� \n";
		  String b ="SQL\t 80\n"; 
		  String c ="JAVA\t 90\n";
		  String d ="HTML\t 86.7\n";
		  
		 System.out.print(a+b+c+d);
		 
		 System.out.println("��ӭ������ҵ�ύϵͳ ");
		 System.out.print("������JAVA���� ");
		  String java =sc.next();
		 System.out.print("�������������� ");
		 String mailbox=sc.next();
		 
		 if(java.lastIndexOf(".java")!=-1)
			 System.out.println("java������ȷ");
		 else
			 System.out.println("java���ִ���");
		 if (mailbox.indexOf('@') !=- 1 && mailbox.indexOf('.')  >  mailbox.indexOf('@')){
			 System.out.println("������Ч");
			}else{
				System.out.println("������Ч");
			}
		
		
		String poem="��ͤ�� �ŵ��� ���ݱ�����";
		String poems []=new String[100];
		poems =poem.split(" ");
		for(int i=0;i<poems.length;i++)
		System.out.println(poems[i]);
		
		
		int num=0;
		
		String str =("�Ұ����й����Ұ������");
        
		 for(int i=0;i<str.length();i++){
			 if(str.charAt(i)=='��')
				 num++;
		 }
		 System.out.print("������"+num+"��");
		  
		
		System.out.print("������һ�����֣� ");
    	String nums = sc.next();
    	StringBuffer str=new StringBuffer(nums);
    		for(int i=str.length()-3;i>0;i=i-3){
        		str.insert(i,',');
    		}
    		System.out.print(str);
		 
		
		Goods goods =new Goods(); 
		
		 System.out.print("�������û���:");
		 String account = sc.next();
		 
		 System.out.print("����������:");
		 String password = sc.next();

  		if(account.equalsIgnoreCase("TOM") && password.equalsIgnoreCase("123"))
  		{ 
  			System.out.print("��½�ɹ�");
  		        goods.show();
  		        }
		 		else 
			 System.out.print("�˺Ż����벻ƥ��");
  		
  		System.out.print("����������������Ʒ���");
  		int num =sc.nextInt();
  		System.out.print("����������������Ʒ����");
  		int number =sc.nextInt();
  		System.out.print("����Ҫ����");
  		goods.change(num, number);
  		
  		Topic topic =new Topic();	
		topic.setTitle("�һ��ü̳���");
		topic.setContent("����");
		topic.setPublishTime("2010-10-1 12:01:10");
		topic.getInfo();
		
		Reply reply =new Reply() ;
		reply.setTitle("Re:�һ��ü̳���");
		reply.setContent("��Ҳ��");
		reply.setPublishTime("2010-10-1 12:03:10");
		reply.getInfo();
		
		topic.superTopic("�һ��ü̳���2", "����","2010-10-1 12:01:10");
		 
		
		UserDaoImpl usd=new UserDaoImpl();
		usd.setUserName("spiderman");
		usd.setUserPassword("spiderman");	
		usd.setGender("��");
		usd.getUserInfo();
		
		UserDao usd=new UserDaoImpl();
		User user =new User();
		
		  usd.addUser(user);
		  usd.findUser(user);
		  usd.updateUser(user);
		  usd.getUserInfo();
		*/
	
		   
		       
		
	}

}
