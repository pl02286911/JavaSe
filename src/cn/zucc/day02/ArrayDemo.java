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
		  System.out.println("��Ϊ"+sum);
		
		
		double money[]=new double[5];
		Scanner mo =new Scanner(System.in);
		
		System.out.println("�������Ա���µ����Ѽ�¼");
		System.out.print("�������1�ʹ�����:");
		money[0]=mo.nextDouble();
		System.out.print("�������2�ʹ�����:");
		money[1]=mo.nextDouble();
		System.out.print("�������3�ʹ�����:");
		money[2]=mo.nextDouble();
		System.out.print("�������4�ʹ�����:");
		money[3]=mo.nextDouble();
		System.out.print("�������5�ʹ�����:");
		money[4]=mo.nextDouble();
		
		System.out.println("���\t\t\t��Ԫ��");
		double sum=0;
	   for(int i=0;i<money.length;i++){
		   sum=sum+money[i];
		System.out.println((i+1)+"\t\t\t"+money[i]);
	   }
	   System.out.println("�ܽ��Ϊ\t\t\t"+sum);
		
		 System.out.println("������5λѧԱ�ĳɼ�:");
		 Scanner sc =new Scanner(System.in);
		 int score[]=new int[5];
		
		 for(int i =0;i<score.length;i++)
			 score[i]=sc.nextInt();
		 Arrays.sort(score);
		 System.out.print("ѧԱ�ĳɼ�����������");
		 for(int i =0;i<score.length;i++)
			
			 System.out.print(""+score[i]+" ");
		
		String word[]={"a","c","u","b","e","p","f","z"};
		 System.out.print("ԭ�ַ����У�");
		for(int i=0;i<word.length;i++)
		 System.out.print(" "+word[i]);
		Arrays.sort(word);
		System.out.print("\n���������:");
		for(int i=0;i<word.length;i++)
		 System.out.print(" "+word[i]);
		
		Scanner ne =new Scanner(System.in);
		Scanner nu =new Scanner(System.in);
		System.out.print("\n��������ַ��ǣ� ");
		String waitword=ne.next();
		System.out.print("\n�����ַ����±��ǣ� ");
		int  waitnum=nu.nextInt();
	
		for(int i =word.length-1;i>waitnum;i--)
			word[i]=word[i-1];
		
		word[waitnum]=waitword;
		
		Arrays.sort(word);
		System.out.print("\n���������:");
		
		for(int i=0;i<word.length;i++)
			System.out.print(" "+word[i]);
		
		
         int score[]=new int[6];
     	Scanner nu =new Scanner(System.in);
    	System.out.print("��ʼ���� ");
     	for(int i=0;i<5;i++)
     		score[i]=nu.nextInt();
     		
  
		System.out.print("�¼���ĳɼ� ");
		Scanner ne =new Scanner(System.in);
		int newScore=ne.nextInt();
		
		System.out.print("�¼���ɼ����±� ");
		Scanner newnu =new Scanner(System.in);
		int newnum=newnu.nextInt();
		
		for(int j =5;j>newnum;j--)
			score[j]=score[j-1];
		
		score[newnum]=newScore;
		Arrays.sort(score);
		
		System.out.print("�����ĳɼ���Ϣ���� ");
		for(int i =5;i>=0;i--)			
			System.out.print(" "+score[i]);
		
		*/
		
	
		
		
		
	}

}
