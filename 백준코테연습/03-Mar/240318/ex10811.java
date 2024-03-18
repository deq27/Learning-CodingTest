package ex240318;

import java.util.Scanner;

public class ex10811 {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(); // n개의 바구니
			int count = sc.nextInt(); // 시행 횟수

			int temp=0;
			
			int basket[] = new int[n]; 
			for(int i=0;i<basket.length;i++) {
				basket[i] = i+1;	
			}
			
			for(int i=0;i<count;i++) { 
				int a = sc.nextInt()-1; //1 > 0번째 배열
				int b = sc.nextInt()-1; //5 > 4번째 배열
				
				while(a<b) { 
					temp = basket[a]; 
					basket[a] = basket[b]; 
					basket[b] = temp; 
					a++;	
					b--;	
				}
			}
			sc.close();
			
			for(int i=0;i<basket.length;i++) {
				System.out.print(basket[i]+" ");
			}
			
	}
}
