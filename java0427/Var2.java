package kr.human.java0427;

public class Var2 {
	public void view() {
		Var var = new Var(); //내가 만든 클래스라도 다른 패키지에 있으면 임포트 해야한다.
		
		// 에러다!! private 멤버는 그클래스 내부에서만 사용가능하다.
		// System.out.println("private 변수: " + var.priValue);
		System.out.println("default 변수: " + var.defValue);
		System.out.println("protected 변수: " + var.proValue);
		System.out.println("public 변수: " + var.pubValue);
	}
}
