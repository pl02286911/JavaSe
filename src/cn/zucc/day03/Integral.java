package cn.zucc.day03;
import java.util.*;
public class Integral {
	Scanner sc=new Scanner(System.in);
     public void integral(int num){
    	 int listNum[]=new int[num];
    	 int listPoint[]=new int[num];
    	 for(int i=0;i<num;i++){
    		 	 System.out.println("�����Ա���:");
    		 	 listNum[i]=sc.nextInt();
    		 	 System.out.println("�����Ա���� :");
    		 	 listPoint[i]=sc.nextInt();
    	 }
    	 System.out.println("***��Ա �б�***");
    	 System.out.println("���\t����");
    	 for(int i=0;i<num;i++){
    		 
    		 System.out.print(listNum[i]);
    		 System.out.println("\t"+listPoint[i]);
    		 
    		 
    	 }
    	 
    	 System.out.println("������Ҫ���ҵĻ�Ա��ţ�");
    	 
    	 int findNum=sc.nextInt();  	 
    	 String flag ="false";
    	    
    	 		 for(int i=0;i<num;i++){
    	 			 if(findNum==listNum[i]){   	
    	 				 System.out.println("�û�Ա����Ϊ��"+listPoint[i]);
    	 				 flag ="true";
    	 			 }		
    	    	 }
    	 		 if(flag.equals("false"))
    	    			 System.out.println("δ�ҵ�");
	 
    	 
    	 
     }
}
