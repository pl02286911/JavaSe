package cn.zucc.day02;
import java.util.*;
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 /*
		  *  int a[]={8,4,2,1,23,344,12};
		 
		  int sum=0;
		  for(int i=0;i<a.length;i++){
			  sum=sum+a[i];
		  System.out.println(""+a[i]);
		  }
		  System.out.println("和为"+sum);
		
		
		double money[]=new double[5];
		Scanner mo =new Scanner(System.in);
		
		System.out.println("请输入会员本月的消费记录");
		System.out.print("请输入第1笔购物金额:");
		money[0]=mo.nextDouble();
		System.out.print("请输入第2笔购物金额:");
		money[1]=mo.nextDouble();
		System.out.print("请输入第3笔购物金额:");
		money[2]=mo.nextDouble();
		System.out.print("请输入第4笔购物金额:");
		money[3]=mo.nextDouble();
		System.out.print("请输入第5笔购物金额:");
		money[4]=mo.nextDouble();
		
		System.out.println("序号\t\t\t金额（元）");
		double sum=0;
	   for(int i=0;i<money.length;i++){
		   sum=sum+money[i];
		System.out.println((i+1)+"\t\t\t"+money[i]);
	   }
	   System.out.println("总金额为\t\t\t"+sum);
		
		 System.out.println("请输入5位学员的成绩:");
		 Scanner sc =new Scanner(System.in);
		 int score[]=new int[5];
		
		 for(int i =0;i<score.length;i++)
			 score[i]=sc.nextInt();
		 Arrays.sort(score);
		 System.out.print("学员的成绩按升序排列");
		 for(int i =0;i<score.length;i++)
			
			 System.out.print(""+score[i]+" ");
		
		String word[]={"a","c","u","b","e","p","f","z"};
		 System.out.print("原字符序列：");
		for(int i=0;i<word.length;i++)
		 System.out.print(" "+word[i]);
		Arrays.sort(word);
		System.out.print("\n升序后排列:");
		for(int i=0;i<word.length;i++)
		 System.out.print(" "+word[i]);
		
		Scanner ne =new Scanner(System.in);
		Scanner nu =new Scanner(System.in);
		System.out.print("\n待插入的字符是： ");
		String waitword=ne.next();
		System.out.print("\n插入字符的下标是： ");
		int  waitnum=nu.nextInt();
	
		for(int i =word.length-1;i>waitnum;i--)
			word[i]=word[i-1];
		
		word[waitnum]=waitword;
		
		Arrays.sort(word);
		System.out.print("\n升序后排列:");
		
		for(int i=0;i<word.length;i++)
			System.out.print(" "+word[i]);
		
		
         int score[]=new int[6];
     	Scanner nu =new Scanner(System.in);
    	System.out.print("初始数组 ");
     	for(int i=0;i<5;i++)
     		score[i]=nu.nextInt();
     		
  
		System.out.print("新加入的成绩 ");
		Scanner ne =new Scanner(System.in);
		int newScore=ne.nextInt();
		
		System.out.print("新加入成绩的下标 ");
		Scanner newnu =new Scanner(System.in);
		int newnum=newnu.nextInt();
		
		for(int j =5;j>newnum;j--)
			score[j]=score[j-1];
		
		score[newnum]=newScore;
		Arrays.sort(score);
		
		System.out.print("插入后的成绩信息降序： ");
		for(int i =5;i>=0;i--)			
			System.out.print(" "+score[i]);
		
		*/
		
	
		
		
		
	}

}
