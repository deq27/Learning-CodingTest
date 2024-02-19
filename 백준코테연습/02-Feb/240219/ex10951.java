package ex240219;

import java.util.Scanner;

public class ex10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		  while(sc.hasNextInt()) { //Boolean 값을 통해 다음 줄이 없으면 false를 반환하고 EOF의 끝을 알려 줌
			  
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            
	            System.out.println(a+b);
	        }
	    }// 반복문을 종료시키려면 ctrl + z를 입력

}
