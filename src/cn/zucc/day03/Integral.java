package cn.zucc.day03;
import java.util.*;
public class Integral {
	Scanner sc=new Scanner(System.in);
     public void integral(int num){
    	 int listNum[]=new int[num];
    	 int listPoint[]=new int[num];
    	 for(int i=0;i<num;i++){
    		 	 System.out.println("输入会员编号:");
    		 	 listNum[i]=sc.nextInt();
    		 	 System.out.println("输入会员积分 :");
    		 	 listPoint[i]=sc.nextInt();
    	 }
    	 System.out.println("***会员 列表***");
    	 System.out.println("编号\t积分");
    	 for(int i=0;i<num;i++){
    		 
    		 System.out.print(listNum[i]);
    		 System.out.println("\t"+listPoint[i]);
    		 
    		 
    	 }
    	 
    	 System.out.println("请输入要查找的会员编号：");
    	 
    	 int findNum=sc.nextInt();  	 
    	 String flag ="false";
    	    
    	 		 for(int i=0;i<num;i++){
    	 			 if(findNum==listNum[i]){   	
    	 				 System.out.println("该会员积分为："+listPoint[i]);
    	 				 flag ="true";
    	 			 }		
    	    	 }
    	 		 if(flag.equals("false"))
    	    			 System.out.println("未找到");
	 
    	 
    	 
     }
}
