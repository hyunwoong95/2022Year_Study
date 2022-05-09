package kr.human.java0428;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// clone메서드는 깊은 복사를 지원해준다.
// clone메서드는 깊은복사가 가능하게 하려면 반드시 Cloneable 인터페이스를 구현하고 clone메서드를 오버라이딩 해야한다.
// 왜? Cloneable 인터페이스는 표시 인터페이스이다. 깊은 복사를 수행하는 클래스이다라고 표시만 합니다.
// clone()메서는 protected멤버이므로 접근이 불가능하다. 그래서 접근 가능하도록 오버라이딩해야 한다.
@AllArgsConstructor
@NoArgsConstructor
@Data
class CloneClass{
	String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
}

public class CloneEx {
	public static void main(String[] args) {
		CloneClass c1 = new CloneClass("한사람");
		CloneClass c2 = c1;	// 얕은 복사 : 주소가 복사된다.
		System.out.println(c1 + " : " + c2);
		c2.setName("바뀐놈");
		System.out.println(c1 + " : " + c2);	// 둘다 바뀜
		System.out.println();
		
		// 깊은 복사: 내용이 복사
		CloneClass c3 = new CloneClass();
		c3.setName(c1.getName());
		System.out.println(c1 + " : " + c3);
		c3.setName("다른놈");
		System.out.println(c1 + " : " + c3);	//1개만 바뀜. 다른 객체다!!!
		System.out.println();
		// 깊은 복사시 멤버가 많다면 노가다다!!! 쉬운 방법이 없을까? clone()메서드를 이용하면 된다.
		
		
		try {
			CloneClass c4 = (CloneClass) c1.clone();
			System.out.println(c1 + " : " + c4);
			c4.setName("또다른놈");
			System.out.println(c1 + " : " + c4);	// 1개만 바뀜. 다른 객체이다.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
