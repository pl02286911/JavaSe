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
      System.out.print("请输入行数:");
      int num =sc.nextInt();
      System.out.print("请输入符号:");
      String flag =sc.next();
        cre.create(num, flag);
		
		
      Bank ba =new Bank();
      ba.login();
	
		
      
       Integral inte =new Integral();
       System.out.print("请输入增加会员个数:");
       int num =sc.nextInt();
       
       inte.integral(num);
     
    
      System.out.print("请输入学生个数:");
      int num =sc.nextInt();
      Avgheight avgh=new Avgheight();
      avgh.avgheight(num);
        
      Student stu =new Student();
     
      stu.addName();
    

    	  
    System.out.print("\n请输入需要修改的学生姓名:");
       String oldName=sc.next();
    System.out.print("\n请输入修改的学生新姓名:");
          String newName=sc.next();
          stu.modifyName(oldName, newName); 
          
          
       
   	    VipManager vm=new VipManager();  
   	    String flag="n";  
        do{  
        	Vip vips =new Vip();
        	System.out.println("请输入会员编号:");
            vips.num=sc.next();
            System.out.print("请输入会员积分:");
            vips.score=sc.next();
      
            	  vm.vipadd(vips);
            	  System.out.print("是否需要继续输入(y/n):");
            	  flag = sc.next();
              }while(flag.equals("y"));
              
             vm.vipshow();
             
             System.out.print("请输入需要查找的会员编号:");
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
    	   System.out.println("请输入学生姓名:");
    	   stus.name=sc.next();
    	   
    	   sm.addStu(stus);
    	   System.out.print("是否需要继续输入(y/n):");
     	   flag = sc.next();
    	   
    	    	   
       }while(flag.equals("y")); 
       
       sm.stushow();
       System.out.println("\n请输入开始查找位置:");
         int start =sc.nextInt();
       System.out.println("请输入结束查找位置:");
       	 int end =sc.nextInt();
       System.out.println("请输入学生姓名:");
       	 String findName=sc.next();
      
       	
      
       	 sm.findStu(start, end, findName);
       
      
      
      
	}

}
