package kr.human.java0504;

import java.util.stream.IntStream;

public class ProgramersEx01 {

	public static void main(String[] args) {
		// 1 ~ 10000까지의 숫자중 8이 총 몇번들어가는지 카운트하는 함수를 작성
		
		long count = IntStream.rangeClosed(1,10000)
		.mapToObj(n->n+"")
		.filter(str->str.contains("8"))
		.map(str->str.chars())
		.flatMap(intStream->intStream.mapToObj(n->(char)n))
		.filter(n->n=='8')
		.count();
		System.out.println("8의 개수: " + count + "개");
		

	}

}
