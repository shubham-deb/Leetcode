
public class Reverse_String {

	private String reverse(String s){
		String r="";
		if (s==null | s=="") return s;
		else if(s.length()==1) return s;
		else{
			char[] charray = s.toCharArray();
			for(int i=0,j=charray.length-1;i<j;i++,j--){
				char temp = charray[i];
				charray[i] = charray[j];
				charray[j] = temp;
			}
			r = new String(charray);
		}
		return r;
	}
	
	public static void main(String[] args) {
		String input = "shubham";
		Reverse_String obj = new Reverse_String();
		String reverse = obj.reverse(input);
		System.out.println(" "+reverse);
	}

}
