import java.util.HashMap;

public class valid_anagram {

    public static boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()){
    		return false;
    	}
    	else{
        	HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        	for(char ch1:s.toCharArray()){
        		if(hmap.get(ch1)!=null){
        			hmap.put(ch1, hmap.get(ch1)+1);
        		}else{
        			hmap.put(ch1, 1);
        		}
        	}
        	for(char ch2:t.toCharArray()){
        		if(!hmap.containsKey(ch2)) return false;
        		hmap.put(ch2,hmap.get(ch2)-1);
        	}
        	for(char ch1:s.toCharArray()){
        		if(hmap.get(ch1)!=0)return false;
        	}
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		String s1 = "aacc";
		String s2 = "ccac";
		System.out.println(isAnagram(s1, s2));
	}

}
