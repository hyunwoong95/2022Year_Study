package kr.human.java0428;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ExceptionEx07 {
	public static void main(String[] args) {
		// 외부 자원에 접근할때는 예외 처리가 필수이다.
		// JDK 1.7부터는 자동으로 닫기 기능이 지원된다.
			try(Scanner sc = new Scanner(new URL("https://www.naver.com").openStream());) {
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	
	}
}
