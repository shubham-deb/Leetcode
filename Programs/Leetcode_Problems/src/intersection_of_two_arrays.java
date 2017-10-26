import java.util.HashMap;
import java.util.HashSet;

public class intersection_of_two_arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
    	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
    	HashSet<Integer> hset = new HashSet<Integer>();
    	for(int num:nums1)
    		hmap.put(num, 1);
    	for(int num:nums2){
    		if(hmap.get(num)!=null){
    			hset.add(num);
    		}
    	}
    	int[] result = new int[hset.size()];
    	int index=0;
    	for(int num:hset){
    		result[index]=num;
    		index++;
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {1,1};
		int[] result = intersection(nums1,nums2);
		for(int n:result)
			System.out.println(n);
	}

}
