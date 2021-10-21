package chap6;

class  Point1  {
	int x,  y;
	public  Point1(int  x,  int  y)  {
		this.x =  x;
		this.y = y; 
		} 
	public  String  toString()  { 
		return  "Point("  +  x  +  ","  +  y  +  ")";
		}
	}

public class ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1  p1  =  new  Point1(2,3); 
		System.out.println(p1.toString());
		System.out.println(p1); 
		System.out.println(p1 + "입니다.");
	}

}
