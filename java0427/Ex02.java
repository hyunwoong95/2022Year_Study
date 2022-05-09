package kr.human.java0427;

import kr.human.vo.PersonVO;
import java.util.*;
import static java.lang.System.out; //JDK 1.5이상

public class Ex02 {

	public static void main(String[] args) {
		// 패키지가 다른 동일한 이름의 클래스를 여러개 사용하려면
		// 많이 사용하는 패키지를 import하고 적게 사용하는 클래스는 
		// (풀패키지 이름)전체이름을 써서 사용하면 된다.
		PersonVO vo1 = new PersonVO();
		
		kr.human.vo2.PersonVO vo2 = new kr.human.vo2.PersonVO(); 
		out.println(vo1);
	
		
		
	}

}
