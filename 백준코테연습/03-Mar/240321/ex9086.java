package ex240321;

import java.util.Scanner;

// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성


public class ex9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
		
			String st = sc.next();
		
			System.out.print(st.charAt(0)); // chartAt(index) 문자열의 index 위치 리턴 
			// chartAt(index)에서 index는 0부터 시작하기 때문에 마지막 위치는 문자열 길이 -1로 리턴
			System.out.println(st.charAt(st.length() -1 ));  
		
		}
	}
}
