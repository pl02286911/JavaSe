package cn.zucc.day03;

public class Tip {
	private String title;
	private String content;
	private String publishTime;
	private int uid;
	

	public String setTitle(String title){
		return this.title=title;
	}
	public String getTitle(){
		return title;
		
		 
	}
	public String setContent(String content){
		return this.content=content;
	}
	public String getContent(){
		return content;
	}
	public String setPublishTime(String publishTime){
		return this.publishTime=publishTime;
	}
	public String getPublishTime(){
		return publishTime;
	}
	public int setUid(int uid){
		return this.uid=uid;
	}
	public int getUid(){
		return uid;
	}
	public void getInfo(){
		System.out.println(title);
		System.out.println(content);
		System.out.println(publishTime);
		
	}
	
}
