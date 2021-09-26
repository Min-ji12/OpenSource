package HW01;

import java.util.Scanner;

public class test6 {
/*2장 실습 12번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		
		double op1 = scanner.nextDouble();
		String operator = scanner.next();
		double op2 = scanner.nextDouble();
		System.out.print(op1+operator+op2+"의 계산결과는 ");
		
		if (operator.equals("+")) {
			System.out.println(op1+op2);
		}
		else if (operator.equals("-")){
			System.out.println(op1-op2);
		}
		else if (operator.equals("*")) {
			System.out.println(op1*op2);
		}
		else if (operator.equals("/")) {
			if(op2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
				System.out.println(op1/op2);
		}
		scanner.close();
	}

}

