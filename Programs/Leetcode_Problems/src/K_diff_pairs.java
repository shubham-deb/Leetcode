import java.util.*;

public class K_diff_pairs {

    public static int findPairs(int[] nums, int k) {
        int numPairs = 0;
        if(k<0)return numPairs;
        TreeMap<Integer,Integer> hmap = new TreeMap<Integer,Integer>();
        
        for(int n:nums){
        	if(hmap.get(n)!=null)
        		hmap.put(n, hmap.get(n)+1);
        	else 
        		hmap.put(n, 1);
        }
        
        // if difference is not zero
        if(k!=0){
	        for(int num:hmap.keySet()){
	        	Object val = hmap.get(num+k);
	        	if(val != null)numPairs+=1;
	        }
	    // if the difference is 0
    	}else{
	        for(int num:hmap.keySet()){
	        	if(hmap.get(num)>=2)numPairs+=1;
	        }
    	}
        return numPairs;
    }
    
	public static void main(String[] args) {
		int[] nums = {1,3,2,4,5};
		int k = -1;
		System.out.println(findPairs(nums, k));
	}

}
