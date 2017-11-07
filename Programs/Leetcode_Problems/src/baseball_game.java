import java.util.Stack;

public class baseball_game {

	public static int calPoints(String[] ops) {
		int sum = 0;
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0;i<ops.length;i++){
			String curOp = ops[i];
			if(curOp.equals("C")){
				sum+=st.pop()*-1;
			}else if(curOp.equals("D")){
				sum+=st.peek()*2;
				st.push(st.peek()*2);
			}else if(curOp.equals("+")){
				int num1 = st.get(st.size()-1);
				int num2 = st.get(st.size()-2);
				int opSum = num1+num2;
				sum+=opSum;
				st.push(opSum);
			}else{
				st.push(Integer.valueOf(curOp));
				sum+=Integer.valueOf(curOp);
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		String[] ops = {"5","2","C","D","+"};
		System.out.println(calPoints(ops));
	}

}
