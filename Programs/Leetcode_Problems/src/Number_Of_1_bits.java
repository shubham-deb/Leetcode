
public class Number_Of_1_bits {

    public int hammingWeight(int n) {
        int setBits=0;
        	while(n!=0){
	        	int bit = n&1;
	        	if(bit==1)++setBits;
	        	n>>>=1;
	        }
        	return setBits;
    }
	
	public static void main(String[] args) {
		Number_Of_1_bits obj = new Number_Of_1_bits();
		int n = -1;
		System.out.println(obj.hammingWeight(n));

	}

}