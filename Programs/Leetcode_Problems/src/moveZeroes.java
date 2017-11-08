
public class moveZeroes {

    public static void moveZero(int[] nums) {
        if(nums.length==0) return;
        int lastZeroLocation=0;
        
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0)
        		nums[lastZeroLocation++] = nums[i];
        }
        
        while(lastZeroLocation<nums.length)
        	nums[lastZeroLocation++]=0;
        
        for(int n:nums)
        	System.out.print(n+",");
    }
	
	public static void main(String[] args) {
		int[] nums  = {0, 1,1};
		moveZero(nums);
	}

}
