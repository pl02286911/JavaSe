package cn.zucc.day05;

public class Dogs {
     private String name;
     private String strain;
	
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public Dogs(String name, String strain) {
		super();
		this.name = name;
		this.strain = strain;
	}
	public Dogs() {
		super();
	}
	

     
}
