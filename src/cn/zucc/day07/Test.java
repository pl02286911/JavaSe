package cn.zucc.day07;
import java.util.*;
public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*try{
		
		System.out.print("�����뱻����:");
		int num1 =sc.nextInt();
		System.out.print("���������:");
		int num2 =sc.nextInt();
       System.out.print(num1/num2);
		}catch(Exception e)
		{
			System.out.println("������Ϊ0");
			e.printStackTrace();
		}
		*/
		//ClassNum cn=new ClassNum();
		//cn.show();
       
		
		People people =new People();
		System.out.print("���������䣺");
		people.setAge(sc.nextInt());
		System.out.print(people.getAge());
	
		}


}
