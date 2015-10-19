package cn.zucc.day01;
import java.util.*;
public class Money {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*   double javaMoney = 20 ;
         double androidMoney= 30;
         double taobaoMoney = 10;
         double embedMoney =30;
         
         Scanner num = new Scanner(System.in);
         System.out.print("请输入参加java软件工程师培训的学员人数:\n");
         double javaNum = num.nextInt();
         System.out.print("请输入参加Android手机开发培训的学员人数:\n");
         double androidNum = num.nextInt();
      
         System.out.print("请输入参加淘宝开店营销培训的学员人数:\n");
         double taobaoNum = num.nextInt();
         System.out.print("请输入参加嵌入式工程师培训的学员人数:\n");
         double embedNum = num.nextInt();
         
         System.out.print("!!!您享受的折扣是8折优惠!!!\n");
         double Money ;
         double shouldpay;
         
         double discount=0.8;
         double returnMoney;
         Money =javaMoney*javaNum+androidMoney*androidNum+taobaoMoney*taobaoNum+embedMoney*embedNum;
         shouldpay =Money*discount;
         
         Scanner pa =new Scanner(System.in);
         System.out.println("您打折前支付总学费"+Money);
         System.out.println("折后你应该支付的学费"+shouldpay);
         System.out.print("请支付:\n");
         double pay =pa.nextDouble();
         returnMoney=pay-shouldpay;
         System.out.println("实际支付 :"+pay);
         
         System.out.println("找零 :"+returnMoney);
         
         */
		
         
		  System.out.println("学号各位上数字之和等于20的本期幸运学生 ");
		  
		  System.out.println("请输入学院的四位学号： ");
		  Scanner nu =new Scanner(System.in);
		  int num=nu.nextInt();
		  
        
          int sum;
          int lucky =20;
          
          sum= num/1000+num%1000/100+num%1000%100/10+num%1000%100%10;
          System.out.println("你的学号各位上数字之和是 ："+sum);
          
          System.out.println("你是幸运学生  ："+(lucky==sum))	;
          
          
          
          
          
          
         
        
         
     
         
        	 
         
         
         
	}

}
