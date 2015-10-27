package cn.zucc.day07;
import java.util.*;
public class ClassNum {
	Scanner sc=new Scanner(System.in);
			public void show() throws Exception{
				System.out.print("ÇëÊäÈë´úÂë1-3:");
				int num=sc.nextInt();
				switch(num){
				case 1:
					System.out.print("C#");
					break;
				case 2:
					System.out.print("java");
					break;
				case 3:
					System.out.print("sql");
					break;
					default: 
						throw new Exception("ÊäÈë´íÎó");
						
				}
				
				
			}
}
