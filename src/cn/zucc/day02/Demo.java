package cn.zucc.day02;
import java.util.*;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner mon =new Scanner(System.in);
	    System.out.print("请输入你的银行存款:");
	    int money =mon.nextInt();
	    if(money>5000000)
	        System.out.print("你可以购买 凯迪拉克");
	    else if(money >1000000)
	    	 System.out.print("你可以购买帕萨特");
	    else if(money >500000)
	    	 System.out.print("你可以购买依兰特");
	    else if(money >100000)
	    	 System.out.print("你可以购买奥托");
	    else 
	    	 System.out.print("你可以购买捷安特");
		
		Scanner sc =new Scanner(System.in);
		System.out.print("请输入会员积分");
		int x =sc.nextInt();
		if(x<2000)
			System.out.print("该会员享受的折扣是：0.9");
		else if(x>=2000 && x<4000)
			System.out.print("该会员享受的折扣是：0.8");
		else if(x>=4000&& x<8000)
			System.out.print("该会员享受的折扣是：0.7");
		else 
			System.out.print("该会员享受的折扣是：0.6");
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("输入赛跑成绩：");
		int score =sc.nextInt();
		if(score<10){
			System.out.println("输入性别:");
			String sex=sc.next();
			if(sex.equals("男"))
				System.out.print("进入男子组决赛");
			else
				System.out.print("进入女子组决赛");
			
		}
		else
			System.out.print("没进入决赛");
		
		Scanner sc =new Scanner(System.in);
		System.out.print("输入java成绩：");
		int javascore =sc.nextInt();
		System.out.print("输入音乐成绩：");
		int musicscore =sc.nextInt();
		
		if((javascore>98 && musicscore>80)||(javascore==100&&musicscore>70))
			System.out.print("获得奖励");
		else 
			System.out.print("没奖励");
			
			
		Scanner ra =new Scanner(System.in);
		System.out.print("输入名次：");
		int rank=ra.nextInt();
		switch(rank){
		    case 1:
		    	System.out.print("参加麻省理工大学组织的1个月夏令营");
		    	break;
		    case 2:
		    	System.out.print("奖励惠普笔记本电脑一部");
		    	break;
		    case 3:
		    	System.out.print("奖励移动硬盘一个");
		    	break;
		    default:
		    	System.out.print("无任何奖励");
		    	break;
		
		}
		
		
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t\t\t1.登陆系统");
		System.out.println("\t\t\t\t2.退出");
		System.out.println("****************");
		System.out.print("请选择，输入数字：");
		
		Scanner nu =new Scanner(System.in);
		int num =nu.nextInt();
		switch(num){
			case 1 :
				System.out.print("欢迎进入系统");
				break;
			case 2:
				System.out.print("谢谢您的使用");
				break;
			default:
				System.out.print("您输入有误");
				break;
		}
		
		
		Scanner mo =new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int money =mo.nextInt();
		System.out.println("是否参加优惠换购活动");
		System.out.println("1：满50，加2元换购百事可乐1瓶");
		System.out.println("2：满100，加3元换购500ml可乐一瓶");
		System.out.println("3：满100，加10元换购5公斤面粉");
		System.out.println("4：满200，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0:不换购");
		System.out.println("请选择");
		
		int x = mo.nextInt();
		
		if(money>=50&&money<100){
			switch(x){
			case 1 : 
				System.out.println("本次消费总金额："+(money+2));
				System.out.println("成功换购百事可乐一瓶");
				break;
			case 0: 
				System.out.print("不换购1");
				break;
			default:
				System.out.print("您输入有误1");
				break;			
			}
	
		}
		if(money>=100&&money<200){
		
			switch(x){
			case 1 : 
				System.out.println("本次消费总金额："+(money+2));
				System.out.println("成功换购百事可乐一瓶");
				break;
			case 2 : 
				System.out.println("本次消费总金额："+(money+3));
				System.out.println("成功换购500ml可乐一瓶");
				break;
			case 3 : 
				System.out.println("本次消费总金额："+(money+10));
				System.out.println("成功换购5公斤面粉");
				break;
			case 0: 
				System.out.print("不换购2");
				break;
			default:
				System.out.print("您输入有误2");
				break;			
			}
	
		}
		if(money>=200){
			
			switch(x){
			case 1 : 
				System.out.println("本次消费总金额："+(money+2));
				System.out.println("成功换购百事可乐一瓶");
				break;
			case 2 : 
				System.out.println("本次消费总金额："+(money+3));
				System.out.println("成功换购500ml可乐一瓶");
				break;
			case 3 : 
				System.out.println("本次消费总金额："+(money+10));
				System.out.println("成功换购5公斤面粉");
			case 4 : 
				System.out.println("本次消费总金额："+(money+10));
				System.out.println("成功换购1个苏泊尔炒菜锅");
				break;
			case 5 : 
				System.out.println("本次消费总金额："+(money+20));
				System.out.println("成功换购欧莱雅爽肤水一瓶");
				break;
			case 0: 
				System.out.print("不换购3");
				break;
			default:
				System.out.print("您输入有误");
				break;			
			}
	
		}
		  if(money<50)
			   
				System.out.print("您无法参加活动");
							
			
			*/
		  for(int i=0;i<10;i++)
			  System.out.println("复习 考试"+i);
			
		
		int a;
		int b;
		int c;	
		for(a=1;a<10;a++){
			for(b=1;b<=a;b++){
				c=a*b;
				System.out.print(b+"*"+a+"="+c+" ");
			}
			System.out.println(" ");
			
			
		}
			
			
		
	
		
		
		
	}

}
