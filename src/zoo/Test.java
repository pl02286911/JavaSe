package zoo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		   Cat cat =new Cat("加菲猫",4);
		   Duck duck =new Duck("唐老鸭",2);
		   Dolphin dolphin =new Dolphin("海豚奇奇");
		   System.out.println("动物名字\t\t腿的条数\t\t动物叫");
		
		  
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
