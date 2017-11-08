
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int dup=nums[0];
        for(int i=1;i<nums.length;i++)
        	dup^=nums[i];
        return dup;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,3,4,4,1};
		System.out.println(singleNumber(nums));
	}
}
