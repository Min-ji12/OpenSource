package chap6;

class Point2 {
	int x, y;
	public Point2(int x, int y) {
		this.x= x;
		this.y= y;
		}
	public boolean equals(Object obj) {
		Point2 p2 = (Point2)obj; 
		if(x == p2.x && y == p2.y) 
			return true;
		else return false;
		}
	}

public class ex6_3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 a = new Point2(2,3);
		Point2 b = new Point2(2,3);
		Point2 c = new Point2(3,4);
			
		if(a == b) 
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}

}
