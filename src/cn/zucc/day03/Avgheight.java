package cn.zucc.day03;
import java.util.*;
public class Avgheight {
	
	Scanner sc =new Scanner(System.in);
	double sum=0;
	
       public void avgheight(int num){
    	   double list[]=new double[num];
    	   
    	   for(int i=0;i<num;i++){
    		  System.out.print("�������"+(i+1)+"��ѧ�������(cm):"); 
    		   list[i]=sc.nextDouble();   
    		   sum=sum+list[i];
    	   }
    	   
    	   System.out.print("��"+num+"��ѧ��ƽ�����Ϊ��"+sum/num+"cm"); 
    	   
       }
}
