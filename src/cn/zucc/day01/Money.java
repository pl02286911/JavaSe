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
         System.out.print("������μ�java�������ʦ��ѵ��ѧԱ����:\n");
         double javaNum = num.nextInt();
         System.out.print("������μ�Android�ֻ�������ѵ��ѧԱ����:\n");
         double androidNum = num.nextInt();
      
         System.out.print("������μ��Ա�����Ӫ����ѵ��ѧԱ����:\n");
         double taobaoNum = num.nextInt();
         System.out.print("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ����:\n");
         double embedNum = num.nextInt();
         
         System.out.print("!!!�����ܵ��ۿ���8���Ż�!!!\n");
         double Money ;
         double shouldpay;
         
         double discount=0.8;
         double returnMoney;
         Money =javaMoney*javaNum+androidMoney*androidNum+taobaoMoney*taobaoNum+embedMoney*embedNum;
         shouldpay =Money*discount;
         
         Scanner pa =new Scanner(System.in);
         System.out.println("������ǰ֧����ѧ��"+Money);
         System.out.println("�ۺ���Ӧ��֧����ѧ��"+shouldpay);
         System.out.print("��֧��:\n");
         double pay =pa.nextDouble();
         returnMoney=pay-shouldpay;
         System.out.println("ʵ��֧�� :"+pay);
         
         System.out.println("���� :"+returnMoney);
         
         */
		
         
		  System.out.println("ѧ�Ÿ�λ������֮�͵���20�ı�������ѧ�� ");
		  
		  System.out.println("������ѧԺ����λѧ�ţ� ");
		  Scanner nu =new Scanner(System.in);
		  int num=nu.nextInt();
		  
        
          int sum;
          int lucky =20;
          
          sum= num/1000+num%1000/100+num%1000%100/10+num%1000%100%10;
          System.out.println("���ѧ�Ÿ�λ������֮���� ��"+sum);
          
          System.out.println("��������ѧ��  ��"+(lucky==sum))	;
          
          
          
          
          
          
         
        
         
     
         
        	 
         
         
         
	}

}
