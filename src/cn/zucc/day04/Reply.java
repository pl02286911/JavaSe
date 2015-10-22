package cn.zucc.day04;

public class Reply extends Tip {
	private String title;
	private String content;
	private String publishTime;
	private int replyId;
	private int topicId;
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
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public void getInfo(){
		System.out.println("帖子信息");
		System.out.println("帖子标题:"+title);
		System.out.println("帖子内容:"+content);
		System.out.println("发表时间:"+publishTime);
		
	}
}
