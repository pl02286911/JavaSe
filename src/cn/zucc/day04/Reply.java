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
		System.out.println("\n====������Ϣ====");
		System.out.println("���ӱ���:"+super.getTitle());
		System.out.println("��������:"+super.getContent());
		System.out.println("����ʱ��:"+super.getPublishTime());
		
	}
}
