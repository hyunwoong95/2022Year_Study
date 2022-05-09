package kr.human.net1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLEx01 {

	public static void main(String[] args) {
		String urlAddress = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=JSP&oquery=jsp&tqi=hE9G2lp0J1ZssLLLqmhssssssH0-275430";
		
		try {
			URL url = new URL(urlAddress);
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
			System.out.println("네이버 소스보기!!!");
			Scanner sc = new Scanner(url.openStream());
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
