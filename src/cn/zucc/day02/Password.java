package cn.zucc.day02;

public class Password {
         String account;
         String passwd;
         String newPs1;
         String newPs2;
         String flag;
         public void show(){
        	 
        	 if(newPs1.equals(newPs2)){
        		 System.out.print("�޸�����ɹ�������������Ϊ��"+newPs1);
        	      flag="success";	 
        	 }
        	 else   {    		 
        		 System.out.print("��������������벻һ�£�����������\n");
        		 flag="false";	  
        	 }
        	 
        	 
         }
}
