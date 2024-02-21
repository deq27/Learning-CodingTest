package ex240221;

import java.util.Scanner;

public class ex2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max=arr[0];
		int tmp=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(max <= arr[i]) {
				max = arr[i];
				tmp=i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(tmp);

	}

}
