package cn.zucc.day05;

import java.util.*;

import cn.zucc.day04.Dog;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   Dogs dog1 =new Dogs("ŷŷ","ѩ����");
		   Dogs dog2 =new Dogs("����","��������");
		   Dogs dog3 =new Dogs("����","ѩ����");
		   List dogs =new ArrayList();
	
		   dogs.add(dog1);
		   dogs.add(dog2);
		   dogs.add(dog3);
		     dogs.remove(0);
		   System.out.println("���� "+dogs.size()+"������");
		 
		   for (int i =0;i<dogs.size();i++){	 
			   Dogs dog=(Dogs) dogs.get(i);
			   System.out.println(dog.getName()+"\t"+dog.getStrain());  
			   
		   }
		   if(dogs.contains(dog3))
			   System.out.println("�б��а�����������Ϣ");
		  
		Scanner sc =new Scanner(System.in);
		String flag;
		 LinkedList list =new LinkedList();
		   do{
			   Penguins penguins =new Penguins();
			   System.out.println("���������ӵ��������");
			   penguins.setName(sc.next());
			   System.out.println("���������ӵ�����Ա�");
			   penguins.setSex(sc.next());
			   list.add(penguins);
			   System.out.println("�Ƿ��������(y/n)");
			    flag=sc.next();
		   }while("y".equals(flag));
		   
		   System.out.println("�������������һֻ������Ϣ");	
		   Penguins last =new Penguins(); 
		   System.out.println("�������");
		   last.setName(sc.next());
		   System.out.println("����Ա�");
		   last.setSex(sc.next());
		   list.addLast(last);
		 
		   list.removeFirst();
		   System.out.println("ɾ����һ�������Ϣ");
		   System.out.println("���� "+list.size()+"ֻ���");
		  
		   System.out.println("����\t�Ա�"); 
		  for (int i =0;i<list.size();i++){	
			   Penguins penguins=(Penguins) list.get(i);	  
			   System.out.println(penguins.getName()+"\t"+penguins.getSex());  
	   
		   } 
		   
		   */
		 
		  Set<Integer> set= new HashSet<Integer>();
		  set.add(3);
		  set.add(1);
		  set.add(1);
		  set.add(2);
		
		  for(Integer i : set){
			  System.out.println(i);
			  
		  }
	
		 // for(int i =0;i<set.size();i++){
 
		//	   System.out.println();
			 
			  
		//  }
		  
		  
		
		
	
	}
		   
}
