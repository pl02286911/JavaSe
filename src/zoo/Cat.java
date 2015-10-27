package zoo;

public class Cat extends Animal implements Terrestrial  {
	
	 private int legNum;


	public int getLegNum() {
		return legNum;
	}
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	public Cat(String name, int legNum) {
		super();
		super.setName(name);
	
		this.legNum = legNum;
	}
	public Cat() {
		super();
	}
	 

	 public void shout(){
		 
		 System.out.println("ίχίχίχ.....");
		 
	 }
}
