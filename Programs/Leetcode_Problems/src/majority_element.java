import java.util.HashMap;
import java.util.LinkedHashMap;

public class majority_element {

    public static int majorityElement(int[] nums) {
        int max=nums[0];
        HashMap<Integer,Integer> hmap = new LinkedHashMap<Integer,Integer>();
        int threshold = nums.length/2;
        
        for(int num:nums){
        	if(hmap.get(num)!=null){
        		hmap.put(num, hmap.get(num)+1);
        		if(hmap.get(num)>threshold) return num;
        	}else{
        		hmap.put(num, 1);
        	}
        }
        
        return max;
    }
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(majorityElement(nums));
	}

}
