package app;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringBuffer s = new StringBuffer(scan.nextLine());  
		//���� �����ؼ� ����(�� ���� ���� ������ 
		StringBuffer t = new StringBuffer();
		
		//���� �� Ư�����ڴ� for������ ����
		
		t.append(s);
		System.out.println(s);
		t.reverse();
		System.out.println(t);
		
		if(s.charAt(0) == t.charAt(0))
		{
			System.out.println("ȸ���Դϴ�");
		}
		else
		{
			System.out.println("ȸ���� �ƴմϴ�.");
		}
		
	}

}
