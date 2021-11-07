package HW07;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\Temp\\phone.txt");
		FileReader fin = null;
		
		System.out.println(f.getPath() + "를 출력합니다");
		try {
			fin = new FileReader(f);
			int c;
			while((c = fin.read()) != -1)
				System.out.print((char)c);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("입출력 오류");
		}
	}

}
