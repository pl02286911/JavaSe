package cn.zucc.day03;
import java.util.*;
public class Avgheight {
	
	Scanner sc =new Scanner(System.in);
	double sum=0;
	
       public void avgheight(int num){
    	   double list[]=new double[num];
    	   
    	   for(int i=0;i<num;i++){
    		  System.out.print("请输入第"+(i+1)+"名学生的身高(cm):"); 
    		   list[i]=sc.nextDouble();   
    		   sum=sum+list[i];
    	   }
    	   
    	   System.out.print("这"+num+"名学生平均身高为："+sum/num+"cm"); 
    	   
       }
}
