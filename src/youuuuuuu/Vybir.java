package youuuuuuu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vybir {
	
	public void jgh(){
		int hhh;
	}

	public static void vybirka() {
		int[] arr = { -3, 13, 12, 11, 10, 4, 8, 7, 6, 5, 4, 4 };
		

		int min;

		for (int i = 0; i <= arr.length - 1; i++) {
			min = i;
			for (int a = i + 1; a <= arr.length - 1; a++) {
				if (arr[a] < arr[min]) {
					min = a;
				}
			}
			int sw = arr[i];
			arr[i] = arr[min];
			arr[min] = sw;
			System.out.println(arr[i]);
		}

		int sum = 0;
		for (int d = 0; d <= (arr.length - 1) / 2; d++) {
			sum += arr[d];
			System.out.println(arr[d] + " " + sum);
		}
	}

	public static void fibo() {

		int one = 1;
		int two = 1;
		int[] arr = new int[23];
		arr[0] = one;
		arr[1] = two;
		
		for (int i = 2; i <= 22; i++) {
			int sw = one + two;
			one = two;
			two = sw;
			arr[i] = sw;
			//System.out.println(two);
		}
		for(int a=0; a<arr.length; a++){
			System.out.print(arr[a] + ", ");
		}
		
		int[] arrt = new int [arr.length];
		
		System.out.println("fvvvvvvvvvvvvvvv");
		
		
		for(int a=0; a<arr.length; a++){
			if(a<arr.length/2){
				arrt[a] = arr[a+ arr.length/2+1];
			} 
			 if(a>=arr.length/2)
			 {
				arrt[a] = arr[a-arr.length/2];
			}
			System.out.print(arrt[a] + ", ");
		}
		
	}

	// for(int i=0; i<=arr.length-1; i++){
	// System.out.println(i + "ttt " + arr[i]);
	// }
	// for(Integer i:fibo){
	// System.out.println(i);
	// }

	// for(int f=0; f<=fibo.size()/2; f++){
	// int s = fibo.get(f);
	// int y = fibo.get(fibo.size()/2+fibo.get(f));
	// fibo.add(
	// System.out.println(fibo.get(f));
	// }

	public void fff() {

	}

}
