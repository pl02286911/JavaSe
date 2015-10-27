package MiniDVD;
import java.text.*;
import java.util.*;

public class DVDManager extends DVD {
		
	   LinkedList list =new LinkedList();
	 Scanner sc =new Scanner(System.in);
	 
        public void initial(){
        	DVD dvd1 =new DVD("罗马假日","2007-01-01","","已借出");
        	DVD dvd2 =new DVD("风声鹤唳","","","已还");
        	DVD dvd3 =new DVD("浪漫满屋","","","已还");
        	
        	list.add(dvd1);
        	list.add(dvd2);
        	list.add(dvd3);
        }
	   public void addDVD(){

				   DVD dvds =new DVD();
				   System.out.println("请输入增加的DVD名");
				   dvds.setName(sc.next());
				   dvds.setState("已还");
				   dvds.setBorrowDate(" ");
				   dvds.setReturnDate(" ");
				   System.out.println("增加成功");
				   list.add(dvds);			   

	   }
	   
	   public void printDVD(){ 
		   System.out.println("序号\t状态\t名称\t借出日期\t归还日期");
		   for(int i =0;i<list.size();i++){		  
			   DVD dvds =(DVD) list.get(i);
		       System.out.println(i+"\t"+dvds.getState()+"\t"+dvds.getName()+"\t"+dvds.getBorrowDate()+"\t"+dvds.getReturnDate());
		   	}
			
	   }
	   public void deleteDVD(){
		    int flag =0;
		   System.out.println("输入你要删除的DVD名称");
		   String  name=sc.next();
		   for(int i=0;i<list.size();i++){
			   DVD dvds =(DVD) list.get(i);
			   if(name.equals(dvds.getName())&&(!"已借出".equals(dvds.getState()))){
				   	list.remove(i);
				   	flag =1;
			   }
		   }
			   if(flag ==1)
				   	System.out.print("删除成功");
				   	
			   else{
				   System.out.print("输入DVD名称错误或该DVD已借出");
				   flag=0;
			   }
			   
			   
		   }
		public void borrowDVD(){
			int flag =0;
			Date date =new Date();
			 SimpleDateFormat borrowDate =new SimpleDateFormat("yyyy-MM-dd");
			 System.out.println("输入你要借出的DVD名称");
			 String  name=sc.next();
			 for(int i=0;i<list.size();i++){
				   DVD dvds =(DVD) list.get(i);
				   if(name.equals(dvds.getName())&&(!"已借出".equals(dvds.getState()))){
					   dvds.setBorrowDate(borrowDate.format(date));
					   dvds.setReturnDate(" ");
					   flag=1;
					   dvds.setState("已借出");
				   }
			}   
			
			 if(flag==1)
			 System.out.println("借出成功");
			 else {
				  System.out.println("DVD名有误或被借出");
			     flag=0;
			 }
			 
			 
		}   
		public void returnDVD() throws ParseException{
			int flag =0;
			//Date date =new Date();
			 SimpleDateFormat returnDate =new SimpleDateFormat("yyyy-MM-dd");
			 System.out.println("输入你要还的DVD名称");
			 String  name=sc.next();
			 for(int i=0;i<list.size();i++){
				   DVD dvds =(DVD) list.get(i);
				   if(name.equals(dvds.getName())&&(!"已还".equals(dvds.getState()))){
					   System.out.print("请输入归还日期(如2000-09-01):");
					   String enDate=sc.next();					
					   dvds.setReturnDate(enDate);
	   
						Date date1 =returnDate.parse(enDate);
						Date date2=returnDate.parse(dvds.getBorrowDate());
						long day =(date1.getTime()-date2.getTime())/(24*60*60*1000);
						System.out.println("租金为："+(5+day*1)+"元");
				 
					   flag =1;   
				   dvds.setState("已还");
				   }
				
			 }
			 if(flag==1)
			 System.out.println("还DVD成功");
			   else{
				   System.out.print("DVD名称有误或该DVD已还");
				   flag=0;
			   }
		 
	}
}
