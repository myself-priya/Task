package collection1;

import java.util.ArrayList;

public class SampleMethods {
	public static void main(String[]args) {
		ArrayList<Integer> nums=new ArrayList<> ();
		nums.add(10);
		nums.add(20);
		nums.add(15);
		nums.add(45);
		nums.add(24);
//		System.out.println(nums);
//		nums.add(3,20);//memory shifting will occur
//		System.out.println(nums);
//		nums.set(2,70);//no memory shifting occurs and assigned properly
//		System.out.println(nums);
//	    System.out.println(nums.get(2));
//	    nums.remove(3);//memory shifting will occur
//	    System.out.println(nums);
//	    System.out.println(nums.size());//size of the array
//	    
//	    
//	    for(int i=0;i<nums.size();i++) {      //
//	    	System.out.println(nums.get(i));
//	        System.out.println(nums.get(i)*nums.get(i));
//	    }
//	
//	    for(Integer l: nums) {
//	    	System.out.println(l);
//	    	System.out.println(l*l);
//	    	
//	   }
//	    
//       nums.forEach((x)->System.out.println(x));
//	
        int total=0;
       for(int i=0;i<nums.size();i++) {
    	   total=total+nums.get(i);
    	   
       }
       System.out.println(total);
       int max=nums.get(0);
       
       for(Integer l:nums) {
    	  
    	  if(max<l) {
    		max=l;  
    	  }
    	 
       }
       System.out.println(max);
     int min=nums.get(0);
       for(int i=0;i<nums.size();i++) {
        if(min>nums.get(i)) {
        	min=nums.get(i);
        	
        }	   
    	  
    	   
       }
       System.out.println(min);
	}

}
