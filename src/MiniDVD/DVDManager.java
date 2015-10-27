package MiniDVD;
import java.text.*;
import java.util.*;

public class DVDManager extends DVD {
		
	   LinkedList list =new LinkedList();
	 Scanner sc =new Scanner(System.in);
	 
        public void initial(){
        	DVD dvd1 =new DVD("�������","2007-01-01","","�ѽ��");
        	DVD dvd2 =new DVD("�������","","","�ѻ�");
        	DVD dvd3 =new DVD("��������","","","�ѻ�");
        	
        	list.add(dvd1);
        	list.add(dvd2);
        	list.add(dvd3);
        }
	   public void addDVD(){

				   DVD dvds =new DVD();
				   System.out.println("���������ӵ�DVD��");
				   dvds.setName(sc.next());
				   dvds.setState("�ѻ�");
				   dvds.setBorrowDate(" ");
				   dvds.setReturnDate(" ");
				   System.out.println("���ӳɹ�");
				   list.add(dvds);			   

	   }
	   
	   public void printDVD(){ 
		   System.out.println("���\t״̬\t����\t�������\t�黹����");
		   for(int i =0;i<list.size();i++){		  
			   DVD dvds =(DVD) list.get(i);
		       System.out.println(i+"\t"+dvds.getState()+"\t"+dvds.getName()+"\t"+dvds.getBorrowDate()+"\t"+dvds.getReturnDate());
		   	}
			
	   }
	   public void deleteDVD(){
		    int flag =0;
		   System.out.println("������Ҫɾ����DVD����");
		   String  name=sc.next();
		   for(int i=0;i<list.size();i++){
			   DVD dvds =(DVD) list.get(i);
			   if(name.equals(dvds.getName())&&(!"�ѽ��".equals(dvds.getState()))){
				   	list.remove(i);
				   	flag =1;
			   }
		   }
			   if(flag ==1)
				   	System.out.print("ɾ���ɹ�");
				   	
			   else{
				   System.out.print("����DVD���ƴ�����DVD�ѽ��");
				   flag=0;
			   }
			   
			   
		   }
		public void borrowDVD(){
			int flag =0;
			Date date =new Date();
			 SimpleDateFormat borrowDate =new SimpleDateFormat("yyyy-MM-dd");
			 System.out.println("������Ҫ�����DVD����");
			 String  name=sc.next();
			 for(int i=0;i<list.size();i++){
				   DVD dvds =(DVD) list.get(i);
				   if(name.equals(dvds.getName())&&(!"�ѽ��".equals(dvds.getState()))){
					   dvds.setBorrowDate(borrowDate.format(date));
					   dvds.setReturnDate(" ");
					   flag=1;
					   dvds.setState("�ѽ��");
				   }
			}   
			
			 if(flag==1)
			 System.out.println("����ɹ�");
			 else {
				  System.out.println("DVD������򱻽��");
			     flag=0;
			 }
			 
			 
		}   
		public void returnDVD() throws ParseException{
			int flag =0;
			//Date date =new Date();
			 SimpleDateFormat returnDate =new SimpleDateFormat("yyyy-MM-dd");
			 System.out.println("������Ҫ����DVD����");
			 String  name=sc.next();
			 for(int i=0;i<list.size();i++){
				   DVD dvds =(DVD) list.get(i);
				   if(name.equals(dvds.getName())&&(!"�ѻ�".equals(dvds.getState()))){
					   System.out.print("������黹����(��2000-09-01):");
					   String enDate=sc.next();					
					   dvds.setReturnDate(enDate);
	   
						Date date1 =returnDate.parse(enDate);
						Date date2=returnDate.parse(dvds.getBorrowDate());
						long day =(date1.getTime()-date2.getTime())/(24*60*60*1000);
						System.out.println("���Ϊ��"+(5+day*1)+"Ԫ");
				 
					   flag =1;   
				   dvds.setState("�ѻ�");
				   }
				
			 }
			 if(flag==1)
			 System.out.println("��DVD�ɹ�");
			   else{
				   System.out.print("DVD����������DVD�ѻ�");
				   flag=0;
			   }
		 
	}
}
