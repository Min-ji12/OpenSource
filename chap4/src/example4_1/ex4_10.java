package example4_1;

 class Sample {
/*예제 4_10*/
	public int a;
	private int b;
	int c;
}

public  class ex4_10{
	public static void  main(String[]  args)  { 
		Sample  aClass =  new  Sample();
		aClass.a =  10; 
		//aClass.b =  10; //b는 private으로 선언이 되었기 때문에 AcessEx클래스에서 접근이 불가하다
		aClass.c = 10;
	}
}


