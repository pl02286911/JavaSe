package cn.zucc.day06;
import java.util.*;
import java.text.*;
public class Test {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

	 Scanner sc =new Scanner(System.in);
	
	/* Map<String,String> mapentry =new HashMap<String,String>();
	 mapentry.put("CN", "�л����񹲺͹�");
	 mapentry.put("RU", "����˹����");
	 mapentry.put("FR", "���������͹�");
	 mapentry.put("US", "��������ڹ�");

	 System.out.print("����Ӣ�ļ��:");
	 String enName=sc.next();
	 
	 if(mapentry.keySet().contains(enName))
		 System.out.println(mapentry.get(enName));
	 else 
		 System.out.println("δ�ҵ���Ӧ����");
	 
	 System.out.println(mapentry);
	 	for(Map.Entry<String,String> entry : mapentry.entrySet()){
	 		System.out.print(entry.getKey()+"->"+entry.getValue()+" ");
	 		//	System.out.print(entry);

	 
	 }

	 	*/
	 String ab ="2000-10-20";
	 String bc ="2000-11-12";
	
	 SimpleDateFormat a =new SimpleDateFormat("yyyy-MM-dd");
	 Date date1 =a.parse(ab);
	 Date date2 =a.parse(bc);
	 long day =(date2.getTime()-date1.getTime())/(24*60*60*1000);
	 System.out.println(day);
	// Calendar c=Calendar.getInstance();
	// c.setTime(date1);
	 
	// int year =c.get(Calendar.YEAR);
	// int month =c.get(Calendar.MONTH)+1;
	// int day=c.get(Calendar.DAY_OF_MONTH);
	// String ab ="2000-10-20";
	//  System.out.println(month);
	//  System.out.println(day);
	  
	}
	
	
}
