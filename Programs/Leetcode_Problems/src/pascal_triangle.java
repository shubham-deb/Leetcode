import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {

public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> row = new ArrayList<List<Integer>>();
    	List<Integer> column = new ArrayList<Integer>();
    	
        if(numRows == 0)
            return new ArrayList<List<Integer>>();
        
		column.add(1);
		row.add(column); 
        
    	if(numRows == 1){
    		return row;
    	}
    	
    	List<Integer> column2 = new ArrayList<Integer>();
		column2.add(1);
		column2.add(1);
		row.add(column2);
		
		if(numRows == 2){
    		return row;
    	}
		
    	for(int i=2;i<numRows;i++){
    		List<Integer> new_column = new ArrayList<Integer>();
    		new_column.add(1);
			List<Integer> prev_row = row.get(i-1);
    		for(int r=0;r<prev_row.size()-1;r++){
    			int prev = prev_row.get(r);
    			int next = prev_row.get(r+1);
				int val = prev + next;
				new_column.add(val);
    		}
    		new_column.add(1);
    		row.add(new_column);
    	}
    	
    	return row;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		pascal_triangle obj=  new pascal_triangle();
		System.out.println(obj.generate(numRows));
	}

}
