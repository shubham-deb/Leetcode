
public class max_consec_ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0,count=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==1)count++;
        	else {
        		if(count>max_ones){
        			max_ones = count;
        		}
        		count=0;
        	}
        }
		if(count>max_ones){
			max_ones = count;
		}
        return max_ones;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1};
		System.out.println(new max_consec_ones().findMaxConsecutiveOnes(arr));
	}

}
