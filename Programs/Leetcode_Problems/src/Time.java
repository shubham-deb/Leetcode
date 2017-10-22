public class Time {
	
	public static int findHourMin(int[] arr){
		int min = Integer.MAX_VALUE,index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=2){
				if(arr[i]<min){
					min =arr[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	public static int findMinuteMin(int[] arr){
		int min = Integer.MAX_VALUE,index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=5){
				if(arr[i]<min){
					min =arr[i];
					index = i;
				}
			}
		}
		return index;
	}
	
	public String Solution(String s){
		StringBuilder time = new StringBuilder();
		String[] charray = s.split(":");
		int hour = Integer.parseInt(charray[0]);
		int minutes = Integer.parseInt(charray[1]);
		
		String h="";
		String m="";
		
		if(hour<=23 && hour>=0 && minutes<=58 && minutes>=0){
			minutes+=1;
			if(hour<10){
				h = "0"+hour;
			}
			else h = ""+hour;
			if(minutes<10){
				m = "0"+minutes;
			}
			else m = ""+minutes;
			time.append(h+":"+m);
		}
		else{
			if(hour == 23)hour = 22;
			
			int[] arr = new int[4];
			
			arr[0] = hour/10;
			arr[1] = hour%10;
			arr[2] = minutes/10;
			arr[3] = minutes%10;
			
			String[] fin = new String[4];
			
			if(arr[0]!=0){
				int index = findHourMin(arr);
				int temp = arr[index];
				arr[index] = arr[0];
				arr[0] = temp;
				fin[0]=""+arr[0];
			}
			else fin[0]="0";

			int index = findHourMin(arr); 
			int temp = arr[index];
			arr[index] = arr[1];
			arr[1] = temp;
			
			fin[1]=""+arr[1]+":";
			
//			for(int i:arr)
//				System.out.print(i+" ");
//			
//			System.out.println();
			
			int index1 = findMinuteMin(arr); 
			int temp1 = arr[index1];
			arr[index1] = arr[2];
			arr[2] = temp1;
			
			fin[2]=""+arr[2];
			
			int index2 = findMinuteMin(arr); 
			int temp2 = arr[index2];
			arr[index2] = arr[3];
			arr[3] = temp2;
			
			fin[3]=""+arr[3];
			
			for(String str:fin)
				time.append(str);
		}
		return time.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time = "02:59";
		Time obj = new Time();
		System.out.println(obj.Solution(time));
	}

}
