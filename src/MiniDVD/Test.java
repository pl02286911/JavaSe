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
		
		System.out.println("��ӭʹ������DVD������");
		System.out.println("------------------");
		int num;
		dm.initial();
		do{
		System.out.println("\n1.����DVD\n2.�鿴DVD\n3.ɾ��DVD\n4.���DVD\n5.�黹DVD\n6.�˳�");	
		System.out.println("��ѡ��");
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
	     		System.out.print("ллʹ��");
	     		
	     }
		}while(num!=6);
		
			
	}

	private static void Swith(int num) {
		// TODO Auto-generated method stub
		
	}

}
