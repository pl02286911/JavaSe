package cn.zucc.day02;
import java.util.*;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner mon =new Scanner(System.in);
	    System.out.print("������������д��:");
	    int money =mon.nextInt();
	    if(money>5000000)
	        System.out.print("����Թ��� ��������");
	    else if(money >1000000)
	    	 System.out.print("����Թ���������");
	    else if(money >500000)
	    	 System.out.print("����Թ���������");
	    else if(money >100000)
	    	 System.out.print("����Թ������");
	    else 
	    	 System.out.print("����Թ���ݰ���");
		
		Scanner sc =new Scanner(System.in);
		System.out.print("�������Ա����");
		int x =sc.nextInt();
		if(x<2000)
			System.out.print("�û�Ա���ܵ��ۿ��ǣ�0.9");
		else if(x>=2000 && x<4000)
			System.out.print("�û�Ա���ܵ��ۿ��ǣ�0.8");
		else if(x>=4000&& x<8000)
			System.out.print("�û�Ա���ܵ��ۿ��ǣ�0.7");
		else 
			System.out.print("�û�Ա���ܵ��ۿ��ǣ�0.6");
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("�������ܳɼ���");
		int score =sc.nextInt();
		if(score<10){
			System.out.println("�����Ա�:");
			String sex=sc.next();
			if(sex.equals("��"))
				System.out.print("�������������");
			else
				System.out.print("����Ů�������");
			
		}
		else
			System.out.print("û�������");
		
		Scanner sc =new Scanner(System.in);
		System.out.print("����java�ɼ���");
		int javascore =sc.nextInt();
		System.out.print("�������ֳɼ���");
		int musicscore =sc.nextInt();
		
		if((javascore>98 && musicscore>80)||(javascore==100&&musicscore>70))
			System.out.print("��ý���");
		else 
			System.out.print("û����");
			
			
		Scanner ra =new Scanner(System.in);
		System.out.print("�������Σ�");
		int rank=ra.nextInt();
		switch(rank){
		    case 1:
		    	System.out.print("�μ���ʡ����ѧ��֯��1��������Ӫ");
		    	break;
		    case 2:
		    	System.out.print("�������ձʼǱ�����һ��");
		    	break;
		    case 3:
		    	System.out.print("�����ƶ�Ӳ��һ��");
		    	break;
		    default:
		    	System.out.print("���κν���");
		    	break;
		
		}
		
		
		System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t\t\t1.��½ϵͳ");
		System.out.println("\t\t\t\t2.�˳�");
		System.out.println("****************");
		System.out.print("��ѡ���������֣�");
		
		Scanner nu =new Scanner(System.in);
		int num =nu.nextInt();
		switch(num){
			case 1 :
				System.out.print("��ӭ����ϵͳ");
				break;
			case 2:
				System.out.print("лл����ʹ��");
				break;
			default:
				System.out.print("����������");
				break;
		}
		
		
		Scanner mo =new Scanner(System.in);
		System.out.print("���������ѽ�");
		int money =mo.nextInt();
		System.out.println("�Ƿ�μ��Żݻ����");
		System.out.println("1����50����2Ԫ�������¿���1ƿ");
		System.out.println("2����100����3Ԫ����500ml����һƿ");
		System.out.println("3����100����10Ԫ����5�������");
		System.out.println("4����200����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����200����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
		System.out.println("0:������");
		System.out.println("��ѡ��");
		
		int x = mo.nextInt();
		
		if(money>=50&&money<100){
			switch(x){
			case 1 : 
				System.out.println("���������ܽ�"+(money+2));
				System.out.println("�ɹ��������¿���һƿ");
				break;
			case 0: 
				System.out.print("������1");
				break;
			default:
				System.out.print("����������1");
				break;			
			}
	
		}
		if(money>=100&&money<200){
		
			switch(x){
			case 1 : 
				System.out.println("���������ܽ�"+(money+2));
				System.out.println("�ɹ��������¿���һƿ");
				break;
			case 2 : 
				System.out.println("���������ܽ�"+(money+3));
				System.out.println("�ɹ�����500ml����һƿ");
				break;
			case 3 : 
				System.out.println("���������ܽ�"+(money+10));
				System.out.println("�ɹ�����5�������");
				break;
			case 0: 
				System.out.print("������2");
				break;
			default:
				System.out.print("����������2");
				break;			
			}
	
		}
		if(money>=200){
			
			switch(x){
			case 1 : 
				System.out.println("���������ܽ�"+(money+2));
				System.out.println("�ɹ��������¿���һƿ");
				break;
			case 2 : 
				System.out.println("���������ܽ�"+(money+3));
				System.out.println("�ɹ�����500ml����һƿ");
				break;
			case 3 : 
				System.out.println("���������ܽ�"+(money+10));
				System.out.println("�ɹ�����5�������");
			case 4 : 
				System.out.println("���������ܽ�"+(money+10));
				System.out.println("�ɹ�����1���ղ������˹�");
				break;
			case 5 : 
				System.out.println("���������ܽ�"+(money+20));
				System.out.println("�ɹ�����ŷ����ˬ��ˮһƿ");
				break;
			case 0: 
				System.out.print("������3");
				break;
			default:
				System.out.print("����������");
				break;			
			}
	
		}
		  if(money<50)
			   
				System.out.print("���޷��μӻ");
							
			
			*/
		  for(int i=0;i<10;i++)
			  System.out.println("��ϰ ����"+i);
			
		
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
