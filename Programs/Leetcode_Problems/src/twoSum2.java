
public class twoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,3,4};
		int target = 6;
        int start = 0;
        int end = numbers.length-1;
        int[] indexes = new int[2];
        while(start<end){
        	System.out.println(start+","+end);
            if((numbers[start]+numbers[end])==target){
            	  indexes[0]=start;
                  indexes[1]=end;	
                  return;
            }
            else if((numbers[start]+numbers[end])<target)
                start++;
            else{
            	end--;
            }
//        return indexes; 
        }
    }
        
}