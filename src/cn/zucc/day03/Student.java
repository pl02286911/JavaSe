package cn.zucc.day03;
import java.util.*;
public class Student {
     Scanner sc=new Scanner(System.in);
     String list[]=new String[30];
	public void addName(){
		 System.out.print("������ѧ������:");
	      int num =sc.nextInt();

	     
	      for(int i=0;i<num;i++){ 
	    	 System.out.print("������ѧ������:");
	    	 String name=sc.next();
	    	 list[i]=name;
	   
	    	 }
	      
	      System.out.println("����ѧ���б�");
	    	 for(int i=0;i<num;i++)
		
	    		 System.out.print(list[i]+"\t");
	    	 
	

	}
	   
	
	
	public void modifyName(String oldName,String newName){
		   String flag="false";
		   Student add =new Student();
		   for(int i=0;i<list.length;i++){
			  if(oldName.equals(list[i])){
				  list[i]=newName;
				  flag="true";
				  System.out.println("�޸ĳɹ�");
				  System.out.println("����ѧ���б�");			  
			    		for(int j=0;j<list.length;j++)	{	
			    			if(list[j]==null)
					          break;    			
			    		 System.out.print(list[j]+"\t");
			    		   
				          }
                      
			    				  
			  }
			  
			  
			  
		  }
			   
			if (flag.equals("false"))
				  System.out.print("δ�ҵ�");
			   
		
		    	
		    	
		    	
		
		
		
		
		
	}
	
	
	
	
	
}
