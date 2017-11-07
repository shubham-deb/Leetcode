import java.util.Collections;
import java.util.TreeMap;

public class Relative_Ranks {

    public static String[] findRelativeRanks(int[] nums) {
    	if(nums.length==0 || nums==null) return new String[0]; 
    	else if(nums.length == 1){
    		String[] output = new String[1];
    		output[0]="Gold Medal";
    		return output;
    	}
    	else if(nums.length==2){
	        TreeMap<Integer, Integer> tmap = new TreeMap<Integer,Integer>(Collections.reverseOrder());
	        for(int i=0;i<nums.length;i++){
	        	tmap.put(nums[i], i);
	        }
	        String[] sortOrder = new String[tmap.size()];
	       
	        sortOrder[tmap.get(tmap.firstKey())] = "Gold Medal";
	        tmap.remove(tmap.firstKey());
	        sortOrder[tmap.get(tmap.firstKey())] = "Silver Medal";
	        tmap.remove(tmap.firstKey());
	        
	        return sortOrder;
    	}
    	else{
	        TreeMap<Integer, Integer> tmap = new TreeMap<Integer,Integer>(Collections.reverseOrder());
	        for(int i=0;i<nums.length;i++){
	        	tmap.put(nums[i], i);
	        }
	        String[] sortOrder = new String[tmap.size()];
	       
	        sortOrder[tmap.get(tmap.firstKey())] = "Gold Medal";
	        tmap.remove(tmap.firstKey());
	        sortOrder[tmap.get(tmap.firstKey())] = "Silver Medal";
	        tmap.remove(tmap.firstKey());
	        sortOrder[tmap.get(tmap.firstKey())] = "Bronze Medal";
	        tmap.remove(tmap.firstKey());
	        
	        int nextrank = 4;
	        for(int num:tmap.keySet()){
	        	int pos = tmap.get(num);
	        	if(sortOrder[pos]==null)
	        		sortOrder[pos] = ""+nextrank;
	        		nextrank++;
	        }

	        return sortOrder;
    	}
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2};
		String[] output = findRelativeRanks(nums);
		for(String num:output)
			System.out.print(num+",");
	}

}
