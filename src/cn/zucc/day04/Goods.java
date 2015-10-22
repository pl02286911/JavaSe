package cn.zucc.day04;

public class Goods {
        int goodsNum;
        String goodsName;
        double goodsPrice;
        
        
        public void show(){
        	System.out.println("欢迎进入商品批发系统");
        	
        	System.out.println("编号\t商品\t价格");
        	 	System.out.println("1\t电风扇\t124.23");
        	 	System.out.println("2\t洗衣机\t4500.0");
        	 	System.out.println("3\t电视机\t8800.9");
        	 	System.out.println("4\t冰箱\t5000.88");
        	 	System.out.println("5\t空调\t4456.0");
	
        	
        }
        public void change(int num,int number){
        	   switch(num){
        	   case 1 :
        		   System.out.println(number*124.23);
        		   break;
        	   case 2 :
        		   System.out.println(number*4500.0);
        		   break;
        	   case 3 :
        		   System.out.println(number*8800.9);
        		   break;
        	   case 4 :
        		   System.out.println(number*5000.88);
        		   break;
        	   case 5 :
        		   System.out.println(number*4456.0);
        		   break;
  	   
        	   
        	   }
        	
       
        }
}
