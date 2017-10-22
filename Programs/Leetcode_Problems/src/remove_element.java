
public class remove_element {

    public static int removeElement(int[] nums, int val) {
        int length = 0;
        int arrlen = nums.length;
        if(arrlen==0) return 0;
        int start=0,end=arrlen-1;
        while(start<end){
        	while(start<end && nums[end]==val)end--;
        	if(end<0) return 0;
        	if(nums[start]==val){
        		int temp = nums[end];
        		nums[end] = nums[start];
        		nums[start] = temp;
            	end--;
        	}
        	start++;
        }
        int i=0;
        while(i<arrlen && nums[i]!=val){
        	length++;
        	i++;
        }
    	return length;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,4,4,4,0};
		int val = 4;
		System.out.println(removeElement(nums, val));
	}

}
