package example4;

public class ex4 {
	String title;
	String author;
	
	public ex4(String t) { 
		title = t; author = "���ڹ̻�";
		}
	public ex4(String t, String a) { 
		title = t; author = a;
		}
	public static void main(String [] args) {
		ex5 littlePrince= new ex5("�����", "�������丮");
		ex5 loveStory= new ex5("������");
		System.out.println(littlePrince.title+ " " + littlePrince.author);
		System.out.println(loveStory.title+ " " + loveStory.author);
		}
	}
	