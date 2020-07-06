package app;

import java.io.*;

public class TextCopyEx {
	public static void main(String[] args){
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("c:\\Temp\\system.txt"); // 복사 파일 경로명
		//복사 대상은 없으면 오류. 
		// 복사하고 나서 저장파일의 위치는 파일이 없어도 생성해서 저장한다 
		int c;
		try {
			FileReader fr = new FileReader(src); 
			FileWriter fw = new FileWriter(dest); 
		//	BufferedReader in = new FileReader(fr);
		//	BufferedWriter out = new FileWriter(fw);
			while((c = fr.read()) != -1) { // 문자 하나 읽고
				fw.write((char)c); // 문자 하나 쓰고
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
