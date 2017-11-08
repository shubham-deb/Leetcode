import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<String>();
        if(n==0) return lst;
        for(int i=1;i<=n;i++){
        	if(i%3==0 && i%5==0)
        		lst.add("FizzBuzz");
        	else if(i%3==0)
        		lst.add("Fizz");
        	else if(i%5==0) 
        		lst.add("Buzz");
        	else lst.add(Integer.toString(i));
        }
        
        return lst;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		System.out.println(fizzBuzz(n));
	}

}
