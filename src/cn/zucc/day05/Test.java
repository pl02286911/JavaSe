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
		   Dogs dog1 =new Dogs("欧欧","雪娜瑞");
		   Dogs dog2 =new Dogs("亚亚","拉布拉多");
		   Dogs dog3 =new Dogs("美美","雪娜瑞");
		   List dogs =new ArrayList();
	
		   dogs.add(dog1);
		   dogs.add(dog2);
		   dogs.add(dog3);
		     dogs.remove(0);
		   System.out.println("共有 "+dogs.size()+"条狗狗");
		 
		   for (int i =0;i<dogs.size();i++){	 
			   Dogs dog=(Dogs) dogs.get(i);
			   System.out.println(dog.getName()+"\t"+dog.getStrain());  
			   
		   }
		   if(dogs.contains(dog3))
			   System.out.println("列表中包含美美的信息");
		  
		Scanner sc =new Scanner(System.in);
		String flag;
		 LinkedList list =new LinkedList();
		   do{
			   Penguins penguins =new Penguins();
			   System.out.println("请输入增加的企鹅姓名");
			   penguins.setName(sc.next());
			   System.out.println("请输入增加的企鹅性别");
			   penguins.setSex(sc.next());
			   list.add(penguins);
			   System.out.println("是否继续增加(y/n)");
			    flag=sc.next();
		   }while("y".equals(flag));
		   
		   System.out.println("请输入增加最后一只企鹅的信息");	
		   Penguins last =new Penguins(); 
		   System.out.println("企鹅姓名");
		   last.setName(sc.next());
		   System.out.println("企鹅性别");
		   last.setSex(sc.next());
		   list.addLast(last);
		 
		   list.removeFirst();
		   System.out.println("删除第一条企鹅信息");
		   System.out.println("共有 "+list.size()+"只企鹅");
		  
		   System.out.println("姓名\t性别"); 
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
