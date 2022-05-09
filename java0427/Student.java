package kr.human.java0427;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Human {
	private String stuNo;
	
	public Student(String stuNo, String name) {
		super(name); //이름은 부모클래스에 전달해서 초기화!
		this.stuNo = stuNo;
	}
	// 오버라이딩: 기능 변경
	public void think() {
		System.out.println("이번 중간고사를 잘봐야할텐데!!");
	}
	// 기능 추가
	public void study() {
		System.out.println("하늘천 땅지 검을현...");
	}
}
