package HW01;

import java.util.Scanner;

public class test2 {

	/*2장 실습 4번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정수 3개 입력>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a<=1000&&b<=1000&&c<=1000) {
			
			if(a>b&&a<c||a<b&&a>c) {
				System.out.println("중간값:"+a);}
			else if(b>a&&b<c||b<a&&b>c) {
					System.out.println("중간값:"+b);
			}	else {
					System.out.println("중간값:"+c);
			}
		}
		scanner.close();
	}

}
