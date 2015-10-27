package cn.zucc.day04;

public class Reply extends Tip {

	private int replyId;
	private int topicId;
	
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
		System.out.println("\n====帖子信息====");
		System.out.println("帖子标题:"+super.getTitle());
		System.out.println("帖子内容:"+super.getContent());
		System.out.println("发表时间:"+super.getPublishTime());
		
	}
}
