package app;

import java.io.*;

public class TextCopyEx {
	public static void main(String[] args){
		File src = new File("c:\\windows\\system.ini"); // ���� ���� ��θ�
		File dest = new File("c:\\Temp\\system.txt"); // ���� ���� ��θ�
		//���� ����� ������ ����. 
		// �����ϰ� ���� ���������� ��ġ�� ������ ��� �����ؼ� �����Ѵ� 
		int c;
		try {
			FileReader fr = new FileReader(src); 
			FileWriter fw = new FileWriter(dest); 
		//	BufferedReader in = new FileReader(fr);
		//	BufferedWriter out = new FileWriter(fw);
			while((c = fr.read()) != -1) { // ���� �ϳ� �а�
				fw.write((char)c); // ���� �ϳ� ����
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}