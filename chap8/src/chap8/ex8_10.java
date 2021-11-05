package chap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex8_10 {
	public static  void  main(String[] args) {
		File src =  new  File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest =  new  File("c:\\Temp\\copyimg.jpg ");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를" + dest.getPath() + "로 복사하였습니다.");
			
		}catch (IOException e) {
			System.out.print("파일복사 오류");
		}
	}
}