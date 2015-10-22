package cn.zucc.day04;

public class Dog extends Pet {
       private String strain;



	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
    public  Dog(){
   	    super();
     }
    public void toHospital(){
    	
    	System.out.println("´òÕë£¬³ÔÒ© ");
    	this.setHealth(getHealth()+40);
    	System.out.println("¹·¹·»Ö¸´½¡¿µ£¬½¡¿µÖµ:"+super.getHealth());
	
    }
    public void catchingFlyDisc(){
    
    	System.out.println("¹·¹·ÕıÔÚÍæ·ÉÅÌ");
    	this.setHealth(getHealth()-10);
    	this.setLove(getLove()+5);
    	
    	
    }
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	void print(){
		//System.out.println("DOG");
       // System.out.println("name:"+super.getName());
        System.out.println("health:"+super.getHealth());
        System.out.println("love:"+super.getLove());
       // System.out.println("strain:"+strain);
	}
	
	
}
