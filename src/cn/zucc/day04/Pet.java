package cn.zucc.day04;

public class Pet {
     private String name;
     private int health;
     private int love;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}

    public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	public Pet(){
    	
    }
	 public void toHospital(){
		 
	 }
 void print(){
	 System.out.println("name:"+name);
     System.out.println("health:"+health);
     System.out.println("love:"+love);
 }
 
}
