package ex240129;

import java.util.Scanner;

public class ex27866 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int cnt = sc.nextInt();
		
		//charAt 함수란 string 타입의 데이터에서 특정 문자를 char 타입으로 변환
		System.out.println(str.charAt(cnt-1));
		
		sc.close();
	}

}
