
public class excelSheet_column_number {

    public static int titleToNumber(String s) {
        int stringToNumber = 0;
        
        if(s==null || s.length()==0) return stringToNumber;

        for(int i=0;i<s.length();i++){
        	stringToNumber = stringToNumber * 26 + (s.charAt(i) - 'A' + 1);
        }
        return stringToNumber;
    }
	
	public static void main(String[] args) {
		String s = "AAA";
		System.out.println(titleToNumber(s));
	}

}
