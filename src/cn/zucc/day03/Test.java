package cn.zucc.day03;
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
     /*
      Image cre =new Image();
      System.out.print("����������:");
      int num =sc.nextInt();
      System.out.print("���������:");
      String flag =sc.next();
        cre.create(num, flag);
		
		
      Bank ba =new Bank();
      ba.login();
	
		
      
       Integral inte =new Integral();
       System.out.print("���������ӻ�Ա����:");
       int num =sc.nextInt();
       
       inte.integral(num);
     
    
      System.out.print("������ѧ������:");
      int num =sc.nextInt();
      Avgheight avgh=new Avgheight();
      avgh.avgheight(num);
        
      Student stu =new Student();
     
      stu.addName();
    

    	  
    System.out.print("\n��������Ҫ�޸ĵ�ѧ������:");
       String oldName=sc.next();
    System.out.print("\n�������޸ĵ�ѧ��������:");
          String newName=sc.next();
          stu.modifyName(oldName, newName); 
          
          
       
   	    VipManager vm=new VipManager();  
   	    String flag="n";  
        do{  
        	Vip vips =new Vip();
        	System.out.println("�������Ա���:");
            vips.num=sc.next();
            System.out.print("�������Ա����:");
            vips.score=sc.next();
      
            	  vm.vipadd(vips);
            	  System.out.print("�Ƿ���Ҫ��������(y/n):");
            	  flag = sc.next();
              }while(flag.equals("y"));
              
             vm.vipshow();
             
             System.out.print("��������Ҫ���ҵĻ�Ա���:");
             String findNum=sc.next();
            
             vm.vipfind(findNum);
             
              
             
      
          String [] line={"a","d","c","f"};    
          ArraysSort array =new ArraysSort();
          
          String [] newLine=array.stringArrays(line);
          for(int i=0;i<line.length;i++)
               System.out.print(newLine[i]+"\t"); 
            */
      StuManager sm =new StuManager();
       String flag="n";
       do{
    	   Stu stus=new Stu();
    	   System.out.println("������ѧ������:");
    	   stus.name=sc.next();
    	   
    	   sm.addStu(stus);
    	   System.out.print("�Ƿ���Ҫ��������(y/n):");
     	   flag = sc.next();
    	   
    	    	   
       }while(flag.equals("y")); 
       
       sm.stushow();
       System.out.println("\n�����뿪ʼ����λ��:");
         int start =sc.nextInt();
       System.out.println("�������������λ��:");
       	 int end =sc.nextInt();
       System.out.println("������ѧ������:");
       	 String findName=sc.next();
      
       	
      
       	 sm.findStu(start, end, findName);
       
      
      
      
	}

}
