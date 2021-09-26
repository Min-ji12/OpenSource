package HW02;

import java.util.Scanner;

public class test3 {

/*3장 실습 6번문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >>");

		int [] unit = {50000,10000,1000,500,100,50,10,1};		
		int money = scanner.nextInt();
		
		for(int i=0; i<unit.length;i++) {
			int n = money / unit[i];
			if(n!=0) {
				System.out.println(unit[i] + "원짜리:" + n + "개");	
			}
			money -= unit[i]*n;
				
		}
		scanner.close();
	}

}
