package HW01;

import java.util.Scanner;

public class test1 {
	/*2장 실습 2번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		
		int a = scanner.nextInt();
		
		if(a%11==0) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다 ");
			}
	else {
		System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
	}
		scanner.close();	
	}

}

