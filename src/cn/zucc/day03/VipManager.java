package cn.zucc.day03;
import java.util.*;
public class VipManager {
	
	Vip vips[] =new Vip[30];

		
     public void  vipadd(Vip vip){
        for(int i=0;i<vips.length;i++){
        	if(vips[i]==null){
        		vips[i]=vip;     	
        		break;
        	}       		
        }	    	 
     }      
	 
     public void vipshow(){
    	 System.out.print("\n��Ա�б�\n���\t����\n");
    	 for(int i=0;i<vips.length;i++){  
    		 Vip vip =vips[i];
    		    if(vip==null)
    		    	break;		 
    		 System.out.println(vip.num+"\t"+vip.score); 		
    	 }	 
     }
  
     public void vipfind(String findNum){
        	 for(int i=0;i<vips.length;i++){  
        		 Vip vip =vips[i];
        		 	if(findNum.equals(vip.num)){
        		 		System.out.println("�û�Ա����Ϊ��"+vip.score);
        		 		break;
        		 	}  			 
        	 }
	 
     }
	
}
