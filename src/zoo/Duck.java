package zoo;

public class Duck extends Animal implements Terrestrial  {

	 private int legNum;

	public int getLegNum() {
		return legNum;
	}
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	public Duck(String name, int legNum) {
		super();
	    super.setName(name);
		this.legNum = legNum;
	}
	public Duck() {
		super();
	}
	 
	 public void shout(){
		 System.out.println("¸Â¸Â¸Â.....");
	 }
	 
	 
}
