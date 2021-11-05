package chap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src= new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest= new File("c:\\Temp\\desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo= new FileOutputStream(dest);
			byte [] buf= new byte [1024*10];
			while(true) {int n = fi.read(buf);
			fo.write(buf, 0, n);
			if(n <buf.length)
				break;
			}
			fi.close();
			fo.close();
			System.out.println( src.getPath() + "를" + dest.getPath() + "로복사하였습니다.");
			}
		catch (IOException e) { 
			System.out.println("파일복사오류");
			}
		}
}