package kr.human.lambda;

import java.util.function.Predicate;

public class Ex02_Lambda02 {

	//문자열의 길이가 0인지를 판단하는 함수를 만들어서 사용하고싶다
	// ==> 인수가 1개이고 리턴값이 boolean이다 ==> Predicate를 사용하면 된다 .
	public static void main(String[] args) {
		//지금 까지의 방식
		System.out.println(isEmpty(null) ? "있다" : "없다");
		System.out.println(isEmpty("") ? "있다" : "없다");
		System.out.println(isEmpty("하하하 기존방식") ? "있다" : "없다 (기존방식)");
		System.out.println("-".repeat(50));
		
		
		//함수형 인터페이스를 구현해서 사용
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t != null && t.length() ==0;
			}
			
		};
		System.out.println(predicate.test(null) ? "있다" : "없다");
		System.out.println(predicate.test("") ? "있다" : "없다");
		System.out.println(predicate.test("하하하 인터페이스 구현") ? "있다" : "없다(인터페이스 구현)");
		System.out.println("-".repeat(50));
		
		
		////함수형 인터페이스를 람다로 구현해서 사용
		Predicate<String> predicate2 = (t)-> t != null && t.length() ==0;
		System.out.println(predicate.test(null) ? "있다" : "없다");
		System.out.println(predicate.test("") ? "있다" : "없다");
		System.out.println(predicate.test("하하하") ? "있다" : "없다 (인터페이스를 람다로 구현)");
		System.out.println("-".repeat(50));
	}
	
	//지금까지의 방식
	public static boolean isEmpty(String str) {
		return str != null && str.length() ==0;
	}
	
	
	
}
