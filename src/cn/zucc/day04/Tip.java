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
		System.out.println("\n====������Ϣ====");
		System.out.println("���ӱ���:"+title);
		System.out.println("��������:"+content);
		System.out.println("����ʱ��:"+publishTime);
		
	}
}
