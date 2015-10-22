package cn.zucc.day04;

public class Master {
       public void cure(Pet pet){
    	   if(pet.getHealth()<60)
    		   pet.toHospital();
    	     }
    	
       public void playPet(Pet pet){
    		  
    	   if (pet instanceof Penguin) {
		    	 Penguin pen = (Penguin) pet;
		    	 pen.swimming();
		    	 pen.print(); 
		            }
       	   
    	     if (pet instanceof Dog) {
 	            Dog dog = (Dog) pet;
 	            dog.catchingFlyDisc();
 	            dog.print(); 	        
 	        } 
       
       }
}
