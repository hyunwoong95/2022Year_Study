package kr.human.java0428;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class SectionNotFoundException extends Exception{
	// 클래스 버전
	private static final long serialVersionUID = -5029678816499205512L;

	public SectionNotFoundException(String message) {
		super(message);
	}
}

public class ExceptionEx06 {
	public static void main(String[] args) {
		// 외부 자원에 접근할때는 예외 처리가 필수이다.
		Scanner sc = null;
		
			try {
				sc = new Scanner(new URL("https://www.naver.com").openStream());
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				sc.close();
			}
			
		
	
	}
}
