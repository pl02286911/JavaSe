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
	
		 dog.setName("啊");
		 dog.setHealth(100);
		 dog.setLove(20);
		 dog.setStrain("牧羊犬 ");
		
		 pen.setName("额");
		 pen.setHealth(100);
		 pen.setLove(20);
		 pen.setSex("Q仔 ");
	
		

		dog.print();
		pen.print();
		
		 Scanner sc= new Scanner(System.in);	
		 Dog dog =new Dog();
		 Penguin pen=new Penguin();
	
		System.out.println("欢迎来到宠物店 ");
		System.out.print("请输入要领养的宠物名字 :");
		String name =sc.next();
		
		dog.setHealth(100);
		dog.setLove(20);
		pen.setHealth(100);
		pen.setLove(20);
		
		System.out.print("请输入要领养的宠物类型(1.狗狗2.企鹅 ): ");
		 int num1=sc.nextInt();
		 switch(num1){	 
		 	case 1:
			 dog.setName(name);
			 System.out.print("请输入要领养的宠物种类");
			 String dogStrain=sc.next();	 			 
			 dog.setStrain(dogStrain);	
			 dog.print();	 
			 break;
			 
		 	case 2:
			 pen.setName(name);
			 System.out.print("请输入要领养的宠物类型(1.Q仔2.Q妹)");
			 int num3 =sc.nextInt();	 
			 switch(num3){		 
			 	case 1:
				 pen.setSex("Q仔");
				 break;
			 	case 2:
				 pen.setSex("Q妹");
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
		            	System.out.println("需治疗");              
		                 master.cure(pet);
		                 }
		                 System.out.print("\n是否继续(y/n)"); 
		                 flag=sc.next();
	           
			}while(flag.equals("y"));
		
			
			if(password.length()<6)
			 System.out.print("密码长度不小于6位");
		 else 
			 System.out.print("注册成功");
	      	
	      		if(account.equals("TOM") && password.equals("1234567"))
				 System.out.print("登陆成功");
			 		else 
				 System.out.print("账号或密码不匹配");
	
	      	
	   
	      	 	
		 
		 System.out.print("请输入用户名:");
		 String account = sc.next();
		 
		 System.out.print("请输入密码:");
		 String password = sc.next();

   		if(account.equalsIgnoreCase("TOM") && password.equalsIgnoreCase("1234567"))
			 System.out.print("登陆成功");
		 		else 
			 System.out.print("账号或密码不匹配");
   		
		
		  String  a ="学科\t成绩 \n";
		  String b ="SQL\t 80\n"; 
		  String c ="JAVA\t 90\n";
		  String d ="HTML\t 86.7\n";
		  
		 System.out.print(a+b+c+d);
		 
		 System.out.println("欢迎进入作业提交系统 ");
		 System.out.print("请输入JAVA名字 ");
		  String java =sc.next();
		 System.out.print("请输入邮箱名字 ");
		 String mailbox=sc.next();
		 
		 if(java.lastIndexOf(".java")!=-1)
			 System.out.println("java名字正确");
		 else
			 System.out.println("java名字错误");
		 if (mailbox.indexOf('@') !=- 1 && mailbox.indexOf('.')  >  mailbox.indexOf('@')){
			 System.out.println("邮箱有效");
			}else{
				System.out.println("邮箱无效");
			}
		
		
		String poem="长亭外 古道边 芳草碧连天";
		String poems []=new String[100];
		poems =poem.split(" ");
		for(int i=0;i<poems.length;i++)
		System.out.println(poems[i]);
		
		
		int num=0;
		
		String str =("我爱你中国，我爱你故乡");
        
		 for(int i=0;i<str.length();i++){
			 if(str.charAt(i)=='爱')
				 num++;
		 }
		 System.out.print("包含爱"+num+"次");
		  
		
		System.out.print("请输入一串数字： ");
    	String nums = sc.next();
    	StringBuffer str=new StringBuffer(nums);
    		for(int i=str.length()-3;i>0;i=i-3){
        		str.insert(i,',');
    		}
    		System.out.print(str);
		 
		
		Goods goods =new Goods(); 
		
		 System.out.print("请输入用户名:");
		 String account = sc.next();
		 
		 System.out.print("请输入密码:");
		 String password = sc.next();

  		if(account.equalsIgnoreCase("TOM") && password.equalsIgnoreCase("123"))
  		{ 
  			System.out.print("登陆成功");
  		        goods.show();
  		        }
		 		else 
			 System.out.print("账号或密码不匹配");
  		
  		System.out.print("请输入您批发的商品编号");
  		int num =sc.nextInt();
  		System.out.print("请输入您批发的商品数量");
  		int number =sc.nextInt();
  		System.out.print("您需要付款");
  		goods.change(num, number);
  		
  		Topic topic =new Topic();	
		topic.setTitle("我会用继承了");
		topic.setContent("如题");
		topic.setPublishTime("2010-10-1 12:01:10");
		topic.getInfo();
		
		Reply reply =new Reply() ;
		reply.setTitle("Re:我会用继承了");
		reply.setContent("我也会");
		reply.setPublishTime("2010-10-1 12:03:10");
		reply.getInfo();
		
		topic.superTopic("我会用继承了2", "如题","2010-10-1 12:01:10");
		 
		
		UserDaoImpl usd=new UserDaoImpl();
		usd.setUserName("spiderman");
		usd.setUserPassword("spiderman");	
		usd.setGender("男");
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
