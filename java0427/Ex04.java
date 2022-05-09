package kr.human.java0427;

public class Ex04 {
	static class Parent{
		int x = 100;
		void method() {
			System.out.println("부모의 메서드!!");
		}
	}
	static class Child extends Parent{
		int x = 123;
		void method() {
			System.out.println("자식의 메서드!!");
		}
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(parent.x);
		parent.method();
		System.out.println(child.x);
		child.method();
		
		Parent parent2 = new Child(); // 부모에 대입했을경우 무엇이 나올까요?
		System.out.println(parent2.x); // 변수는 변수의타입인 부모클래스의 변수가나온다.
		parent2.method(); // 메서는 현재 가리키는 자식클래스객체의 메서드가 나온다.
	}
}
