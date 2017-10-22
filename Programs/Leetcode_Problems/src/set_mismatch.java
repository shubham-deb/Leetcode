import java.util.HashMap;

public class set_mismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] output = new int[2];
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int count=0;
        
        for(int i=0;i<nums.length;i++){
        	// if the number already exists in the hashmap
        	if(hmap.get(nums[i])!=null){
        		output[0] = nums[i];
        	}else{
        		hmap.put(nums[i], 1);
        	}
        	count++;
        }
        for(int start=1;start<=count;start++){
        	if(hmap.get(start)==null){
        		output[1] = start;
        		break;
        	}
        }
        return output;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,2};
		int[] output = findErrorNums(nums);
		System.out.println(output[0]+","+output[1]);
	}
}
