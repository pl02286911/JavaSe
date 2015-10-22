package cn.zucc.day04;

public class Penguin extends Pet {
       private String sex;

	

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Penguin() {
		super();
	}
	
	public void toHospital(){
	    
	    	System.out.println("吃药，疗养");
	    	this.setHealth(getHealth()+40);
	    	System.out.println("企鹅恢复健康，健康值:"+super.getHealth());
	 
	    }
	  public void swimming(){
		    
	    	System.out.println("企鹅正在游泳");
		
	    	this.setHealth(getHealth()-10);
	    	this.setLove(getLove()+5);
	    	
	    	
	    	
	    }
	void print(){
		//System.out.println("PENGUIN");
       // System.out.println("name:"+super.getName());
        System.out.println("health:"+super.getHealth());   
      System.out.println("love:"+super.getLove());
       // System.out.println("sex:"+sex);
	} 
}
