package HW01;

import java.util.Scanner;

public class test3 {
	/*2장 실습 6번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 중의 정수 하나를 입력하시오>>");
		
		int num;
        num = scanner.nextInt();

        if(num == 3 || num == 6 || num == 9){
            System.out.println("박수짝");
        }
        else if(num >= 10){
            if((num %10) == 3||(num %10) == 6||(num %10) == 9){
                if(num/10 == 3||num/10 == 6||num/10 == 9)
                    System.out.println("박수짝짝");
                else
                    System.out.println("박수짝");
            }
            else if(num/10 == 3||num/10 == 6||num/10 == 9)
                System.out.println("박수짝");
        }
		
		scanner.close();
	}

}
