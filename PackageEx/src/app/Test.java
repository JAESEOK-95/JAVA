package app;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringBuffer s = new StringBuffer(scan.nextLine());  
		//공백 포함해서 진행(한 라인 전부 가져옴 
		StringBuffer t = new StringBuffer();
		
		//공백 및 특수문자는 for문으로 삭제
		
		t.append(s);
		System.out.println(s);
		t.reverse();
		System.out.println(t);
		
		if(s.charAt(0) == t.charAt(0))
		{
			System.out.println("회문입니다");
		}
		else
		{
			System.out.println("회문이 아닙니다.");
		}
		
	}

}
