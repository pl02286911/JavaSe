package cn.zucc.day07;

public class People {
       private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
	
			if(age>1&&age<=150)	
			this.age = age;
			else
				System.out.println("����������1-150֮��");
				throw new Exception();
			
	}
       
}
