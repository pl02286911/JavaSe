package MiniDVD;
import java.text.ParseException;
import java.util.*;
public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		DVDManager dm= new DVDManager();
		
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("------------------");
		int num;
		dm.initial();
		do{
		System.out.println("\n1.新增DVD\n2.查看DVD\n3.删除DVD\n4.借出DVD\n5.归还DVD\n6.退出");	
		System.out.println("请选择：");
		 num=sc.nextInt();
	     switch(num){
	     	case 1:
	     		dm.addDVD();          
	     		 break;
	     	case 2:
	     		dm.printDVD();
	     		break;
	     	case 3:
	     		dm.deleteDVD();
	     		break;
	     	case 4:
	     		dm.borrowDVD();
	     		break;
	     	case 5:
	     		dm.returnDVD();
	     		break;
	     	case 6:
	     		System.out.print("谢谢使用");
	     		
	     }
		}while(num!=6);
		
			
	}

	private static void Swith(int num) {
		// TODO Auto-generated method stub
		
	}

}
