package example4;

public class ex5 {
	String title;
	String author;
	void show() {
		System.out.println(title + "" + author);
	}
	
	public ex5() { 
		this("","");
		System.out.println("������ ȣ���");
		
	}
	
	public ex5(String title) { 
		this(title,"���ڹ̻�");
	}
	public ex5(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args) {
		ex5 littlePrince= new ex5("�����", "�������丮");
		ex5 loveStory= new ex5("bible"); 
		ex5 emptyBook = new ex5();
		loveStory.show();
	
		
	}
	
	}
	