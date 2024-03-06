package ex240306;

import java.util.Scanner;

public class ex3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt() % 42; // 입력 받은 수를 바로 42로 나눈 나머지값으로 저장

			boolean check = false;
			
			for (int j = 0; j < i; j++) { // 자신과 비교하여 앞의 숫자와 같으면 멈춤, 다르면 cnt값 증가
				
				if (arr[i] == arr[j]) {
					check = true;
					break;
				} else {
					check = false;
				}
			}

			if (check == false) {
				cnt++;
			}

		}

		System.out.println(cnt);
	}
}
