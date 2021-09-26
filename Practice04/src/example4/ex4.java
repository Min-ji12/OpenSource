package example4;

public class ex4 {
	String title;
	String author;
	
	public ex4(String t) { 
		title = t; author = "작자미상";
		}
	public ex4(String t, String a) { 
		title = t; author = a;
		}
	public static void main(String [] args) {
		ex5 littlePrince= new ex5("어린왕자", "생텍쥐페리");
		ex5 loveStory= new ex5("춘향전");
		System.out.println(littlePrince.title+ " " + littlePrince.author);
		System.out.println(loveStory.title+ " " + loveStory.author);
		}
	}
	