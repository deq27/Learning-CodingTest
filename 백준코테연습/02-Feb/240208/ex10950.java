package ex240208;

import java.util.Scanner;

public class ex10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력받을 개수
		int a = sc.nextInt(); 
		//배열선언초기화
		int[] sum = new int[a];
		
		for(int i = 0; i < a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			sum[i] = x + y;
		}
		// 더한값 출력
		for(int i = 0; i < a; i++) {
			System.out.println(sum[i]);
		}
		sc.close();
	}

}
