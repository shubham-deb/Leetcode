import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class thirdMax {

    public static int ThirdMax(int[] nums) {
        Set<Integer> numbers = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1>o2) return -1;
				else if(o1<o2) return 1;
				else return 0;
			}
        	
		});
        for(int n:nums)
        	numbers.add(n);
        int count = 0;
        int max = 0;
        for(Iterator<Integer> itr=numbers.iterator();itr.hasNext();){
        	if(count==2)
        		return (Integer)itr.next();
        	if(count==0){
                max = (Integer)itr.next();
                count++;
                continue;
            }
            itr.next();
        	count++;
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.println(ThirdMax(nums));
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.set(1, 4);
		System.out.println(list);
	}

}
