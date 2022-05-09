package kr.human.java0427;

/*
 1. 동일한 부모를 가진다.
 2. 부모의 메서드를 오버라이딩한다.
 3. 부모의 변수에 자식 객체를 대입해서 자식을 컨트롤한다. 
 */
// 추상 클래스: 추상메서드를 1개 이상 가지는 클래스. 미완성 클래스이고, 객체를 생성할 수 없다.
//           상속받는 자식 클래스에게 의무를 부여한다. 반드시 오버라이딩 하라고 정해준다.
abstract class Shape {
	public static final double PI = 3.141592;

	// public void draw() { System.out.println("도형을 그립니다.");
	abstract public void draw(); // 내용이 없는 메서드(추상 메서드) ==> 추상 메서드. 규칙을 정하기위해 만든다.
}

// 추상클래스보다 추상도가 더높은 클래스를 자바에서는 interface라고 한다.
// 일반변수나 메서드를 가질 수 없다. 상수와 추상 메서드만으로 구성된다.
// interface는 상속이 아니라 구현한다고 한다. implements를 사용한다.
interface Graphic {
	double PI = 3.1415; // 앞에 public static final이 자동으로 붙는다.

	void move(); // public이 자동으로 붙는다.

	void remove();
}

interface Graphic2 {
	void rotate();
}

//인터페이스의 상속
interface Graphics extends Graphic, Graphic2 {
	void resize();
}

class Point extends Shape implements Graphics { // interface의 다중구현
	public void draw() {
		System.out.println("점을 그립니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub

	}

}

class Line extends Shape implements Graphics {
	public void draw() {
		System.out.println("선을 그립니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub

	}

}

class Circle extends Shape implements Graphics {
	public void draw() {
		System.out.println("원을 그립니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub

	}

}

class Rectangle extends Shape implements Graphics {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub

	}

}

public class GraphicEx {
	public static void main(String[] args) {
		Shape[] shapes = { new Point(), new Line(), new Circle(), new Rectangle() };

		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
