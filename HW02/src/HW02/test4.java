package HW02;

import java.util.Scanner;

public class test4 {

	 /*3장 실습 8번 문제*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수 몇개?");
			
			int n = scanner.nextInt();
			int array[] = new int[n];
			
			for(int i=0; i<n;i++) {
				int a = (int)(Math.random()*100+1);
				int j = 0;
				if(i==0) {
					array[i]=a;
					System.out.print(array[i]+" ");
				}
				for(; j<i;j++) {
					if(array[j] == a) {
						i--;
						break;
					}
					if(j == i-1) {
						array[i] = a;
						System.out.print(array[i] + " ");
						if((i%10==9))
							System.out.println();
					}
				}
			}
			scanner.close();
		}

	}
