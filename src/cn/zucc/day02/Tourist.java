package cn.zucc.day02;

public class Tourist {
      String name;
      int age;
      int price;
      
      public void show(){
    	  if(age>18)
    		  price=20;
    	  
    	  else if(age>9)
    		  price =10;
    	  
    	  else
    		  price=5;
    	  System.out.print(name+"的年龄为："+age+",门票价格为:"+price);
    	  
    	  
    	  
      }
}
