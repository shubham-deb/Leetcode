
public class valid_perfect_square {

	public static boolean BinarySearch(int num,int start,int end){
		while(start<=end){
			int mid = (start+end)/2;
			if(mid*mid == num)return true;
			else if(mid*mid<num) start = mid+1;
			else end = mid-1;
		}
		
		return false;
	}
	
	public String getNull(){
		String s = null;
		return s;
	}
	
    public static boolean isPerfectSquare(int num) {
        return BinarySearch(num, 0, num);
    }
	
	public static void main(String[] args) {
		int num = 14;
		System.out.println(isPerfectSquare(num));
	}

}
