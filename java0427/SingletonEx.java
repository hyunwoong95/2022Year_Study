package kr.human.java0427;


class NonSingleton{
	
}
//싱글톤 패턴: 프로그램 실행중에 객체를 유일하게 1개만 만들어 재사용 할수있도록 하는 디자인 패턴
class Singleton{
	//1. 자기 자신의 객체를 정적멤버로 만든다.
	private static Singleton instance = new Singleton();
	//2. 밖에서 객체를 생성하지 못하도록 생성자를 private을 만든다.
	private Singleton() {
		;
	}
	//3. 만들어진 객첼르 리턴하는 정적메서드를 만든다.
	public static Singleton getInstance() {
		return instance;
	}
	
}
public class SingletonEx {
	public static void main(String[] args) {
		// Singleton singleton = new Singleton(); 이렇게 객체생성 불가!
		Singleton singleton1 = Singleton.getInstance(); //이렇게 객체를 얻어서 사용한다.
		Singleton singleton2 = Singleton.getInstance(); //이렇게 객체를 얻어서 사용한다.
		Singleton singleton3 = Singleton.getInstance(); //이렇게 객체를 얻어서 사용한다.
		//자바 가상머신(JVM)이 객체를 구분하기위해 붙이는 일련번호를 해쉬코드라고 한다.
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		System.out.println(singleton3.hashCode()); //해시코드가 같다는것은 같은 객체를 뜻한다.
		
		NonSingleton ns1 = new NonSingleton();
		NonSingleton ns2 = new NonSingleton();
		System.out.println(ns1.hashCode());
		System.out.println(ns2.hashCode()); // 해시코드가 다르다. 객체가 여러개이다.
	}
}
