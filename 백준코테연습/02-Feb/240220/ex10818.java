package ex240220;

import java.util.Scanner;

public class ex10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int tmp = sc.nextInt();
		int arr[] = new int[tmp];
		int max,min;
		
		for(int i=0; i<tmp; i++) {
			arr[i] = sc.nextInt();
		}
		
		max=arr[0];
		min=arr[0];
		
		for(int i=0; i<tmp; i++) {
			
			if(max <= arr[i]) {
				max=arr[i];
			}
			else;
				
		}
		for(int i=0; i<tmp; i++) {
			
			if(min > arr[i]) {
				min=arr[i];
			}
			else;
				
		}
		sc.close();
		
		System.out.println(min + " " + max);
	}

}
