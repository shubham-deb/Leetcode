
public class max_avg_subarray {

    public static double findMaxAverage(int[] nums, int k) {
        if(k == nums.length){
        	double sum=0;
        	for(double num:nums){
        		sum+=num;
        	}
        	return sum/k;
        }
        else if(k == 1){
        	int max = Integer.MIN_VALUE;
        	for(int num:nums)
        		max = Math.max(max, num);
        	return max;
        }
        else{
            double sum = 0;
            for(int i=0;i<k;i++) sum+=nums[i];
            double max = sum;
        	for(int i=k;i<nums.length;i++){
        		sum = sum + nums[i] - nums[i-k];
                max = Math.max(max,sum);
        	}
            return max/k;
        }
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1,1,3,3};
		System.out.println(findMaxAverage(nums,4));
	}

}
