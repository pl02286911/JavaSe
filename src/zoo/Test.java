package zoo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		   Cat cat =new Cat("�ӷ�è",4);
		   Duck duck =new Duck("����Ѽ",2);
		   Dolphin dolphin =new Dolphin("��������");
		   System.out.println("��������\t\t�ȵ�����\t\t�����");
		
		  
	 	 if(cat instanceof Terrestrial){
		   System.out.print(cat.getName()+"\t\t"+cat.getLegNum()+"\t\t");
		   cat.shout();
		   }
	 	 
		   if(duck instanceof Terrestrial){
			   System.out.print(duck.getName()+"\t\t"+duck.getLegNum()+"\t\t");
			   duck.shout();
			   }
			   
		   if(!(dolphin instanceof Terrestrial)){
			   System.out.print(dolphin.getName()+"\t\t"+0+"\t\t");
			   dolphin.shout();
			   }
	
		   
	}

}
