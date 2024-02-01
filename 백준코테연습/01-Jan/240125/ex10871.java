package ex240125;

import java.util.Scanner;

public class ex10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 받을 배열크기 a  비교 숫자 b
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		
		// 배열 arr에 숫자 입력
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.nextInt(); 
		}
		
		// 배열 arr과 b 숫자 비교 후 출력
		for(int i = 0; i < arr.length; i++ ) {
			
			if(arr[i] < b) 
			System.out.print(arr[i] + " "); 
		}
		sc.close();
	}

}
