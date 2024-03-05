package ex240305;

import java.util.Scanner;

public class ex5597 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[30]; // 30명의 학생 출석부
		
		for (int i = 0; i < 28; i++) { // 28명의 과제 제출 학생 입력받음
			int a = sc.nextInt();
			
			arr[a-1] = 1; // 제출한 학생은 1로 표시
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==0)  // 제출하지 않은 학생확인
				System.out.println(i+1);
		}
		
		sc.close();
	}

}
