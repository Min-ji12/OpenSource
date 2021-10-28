package HW06;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
			ArrayList<Character> stack = new ArrayList<Character>();
			Scanner sc = new Scanner(System.in);
			
			System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
			for(int i=0; i<6; i++) {
				char c = sc.next().charAt(0);
				stack.add(c);
			}
			
			double sum=0;
			for(int i=0; i<6; i++) {
				switch(stack.get(i)) {
				case 'A':
					sum+=4.0;
					break;
				case 'B':
					sum+=3.0;
					break;
				case 'C':
					sum+=2.0;
					break;
				case 'D':
					sum+=1.0;
					break;
				case 'F':
					sum+=0;
					break;
				}
			}
		
			System.out.println(sum/6);
			sc.close();
		}
}	
