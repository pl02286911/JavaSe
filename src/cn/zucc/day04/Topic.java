package cn.zucc.day04;

public class Topic extends Tip {
	private int topicId;
	private int boardId;
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public void superTopic(String title,String content,String publishTime) {
		System.out.println("\n====������Ϣ====");
		System.out.println("���ӱ���:"+title);
		System.out.println("��������:"+content);
		System.out.println("����ʱ��:"+publishTime);
	}
	public void getInfo(){
		System.out.println("\n====������Ϣ====");
		System.out.println("���ӱ���:"+super.getTitle());
		System.out.println("��������:"+super.getContent());
		System.out.println("����ʱ��:"+super.getPublishTime());
		
	}
	

}
