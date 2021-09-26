package example4;

import java.util.Scanner;

 class ex7 {
	String title, author;
	public ex7(String title, String author) {
		this.title= title;
		this.author= author;
		}
	
 public static class ex7Array{
	public static void main(String[] args) {
		ex7 [] book = new ex7[2]; 
		Scanner scanner= new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new ex7(title, author); 
			
		}
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		
		scanner.close();
		}
		
	}
 }
