package youuuuuuu;

public class Puzyr {
	public static void sortPuzyr(){
		int[] arr = {3,5,3,4,1,3,7,99,88,77,98,45,62,5645,565};
		for(int i=arr.length-1; i>=0; i--){
			for(int a=0; a<i; a++){
				if(arr[a]< arr[a+1]){ // хочеш змінити порядок? міняй значок!
					int sw= arr[a];
					arr[a] = arr[a+1];
					arr[a+1] = sw;
				}
				
			}
			System.out.println(arr[i]);
		}
	}
}
