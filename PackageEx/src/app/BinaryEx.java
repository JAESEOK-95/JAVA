package app;

import java.io.*;

public class BinaryEx {
	public static void main(String[] args) {
		File src = new File("C:\\Temp\\mei.jpg");
		File dest = new File("c:\\Temp\\copyimg.jpg");
		int c;
		
		try {
			String as;

			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			BufferedInputStream IN = new BufferedInputStream(fi);
			BufferedOutputStream out = new BufferedOutputStream(fo);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			IN.close();
			out.close();
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "�� " + 
					dest.getPath()+ "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
