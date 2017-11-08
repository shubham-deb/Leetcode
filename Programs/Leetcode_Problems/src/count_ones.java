
public class count_ones {

	public static int count_one(int num){
		int count= 0;
		
		while(num!=0){
			num = num&(num-1);
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		System.out.println(count_one(num));
	}

}
