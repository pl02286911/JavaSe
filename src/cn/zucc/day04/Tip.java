package cn.zucc.day04;

public class Tip {
	private String title;
	private String content;
	private String publishTime;
	private int  uid;
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getPublishTime() {
		return publishTime;
	}



	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}



	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}






	public void getInfo(){
		System.out.println("\n====帖子信息====");
		System.out.println("帖子标题:"+title);
		System.out.println("帖子内容:"+content);
		System.out.println("发表时间:"+publishTime);
		
	}
}
