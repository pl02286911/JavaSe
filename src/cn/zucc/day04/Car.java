package cn.zucc.day04;

public class Car {
	private int site = 4;

	public int getSite() {
		return site;
	}
	Car(){
        System.out.println ("�ؿ�����"+site+"��");
    }  
	public void setSite(int site) {
		this.site = site;
	} 
	void print(){
	        System.out.print("�ؿ�����"+site+"��");
	}
}
 