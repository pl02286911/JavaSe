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
		System.out.println("\n====帖子信息====");
		System.out.println("帖子标题:"+title);
		System.out.println("帖子内容:"+content);
		System.out.println("发表时间:"+publishTime);
	}
	public void getInfo(){
		System.out.println("\n====帖子信息====");
		System.out.println("帖子标题:"+super.getTitle());
		System.out.println("帖子内容:"+super.getContent());
		System.out.println("发表时间:"+super.getPublishTime());
		
	}
	

}
