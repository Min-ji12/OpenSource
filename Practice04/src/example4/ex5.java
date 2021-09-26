package example4;

public class ex5 {
	String title;
	String author;
	void show() {
		System.out.println(title + "" + author);
	}
	
	public ex5() { 
		this("","");
		System.out.println("생성자 호출됨");
		
	}
	
	public ex5(String title) { 
		this(title,"작자미상");
	}
	public ex5(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args) {
		ex5 littlePrince= new ex5("어린왕자", "생텍쥐페리");
		ex5 loveStory= new ex5("bible"); 
		ex5 emptyBook = new ex5();
		loveStory.show();
	
		
	}
	
	}
	