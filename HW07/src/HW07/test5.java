package HW07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Phone{
	private String fileName = "c:\\Temp\\phone.txt";
	private HashMap<String, String> phone = new HashMap<String, String>();
	
	private void readPhone() {
		try {
			Scanner fsc = new Scanner(new FileReader(new File(fileName)));
			
			while (fsc.hasNext()) {
				String name = fsc.next();
				String tel = fsc.next();
				phone.put(name, tel);
			}fsc.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("총" + phone.size() + "개의 전화번호를 읽었습니다");
	}
	private void process() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("이름>> ");
			String name = sc.next();
			
			if(name.equals("그만"))
				break;
			String tel = phone.get(name);
			if(tel ==null) {
				System.out.println("찾는 이름이 없습니다");
			}
			else {
				System.out.println(tel);
			}
		}
		sc.close();
	}
	public void run() {
		readPhone();
		process();
	}
}

public class test5 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.run();
	}

}
