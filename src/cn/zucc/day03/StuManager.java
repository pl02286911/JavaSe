package cn.zucc.day03;

public class StuManager {

    Stu []stus=new Stu[30];
        	
	public void addStu(Stu stu){
		   for(int i =0;i<stus.length;i++){
			   if(stus[i]==null){
				   stus[i]=stu;
				   break;
			     }
		   
		   }
	}
		
	 public void stushow(){
    	 System.out.println("\n本班学生列表");
    	 for(int i=0;i<stus.length;i++){  
    		 Stu stu =stus[i];
    		    if(stu==null)
    		    	break;		 
    		 System.out.print(stu.name+"\t"); 
    	 }	 
     }
	public void  findStu(int start,int end,String name){		
		String flag ="false";
			for(int i=start-1;i<end;i++){
				   Stu stu =stus[i];			   
				if(name.equals(stu.name)){
						System.out.print("查到该学生");
						flag ="true";   
					   	break;
				}	     
			}   	
				if(flag.equals("false"))
					   System.out.print("未查到该学生");
				      
	}
		



}
