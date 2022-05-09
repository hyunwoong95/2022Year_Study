package kr.human.java0429;

import java.util.Random;
import java.util.Vector;

public class ListEx02 {
	public static void main(String[] args) {	
		//커다란 용량일 경우에는 초기값으로 용량을 지정하면 조금이라도 속도의 향상을 가져온다.
		//Vector클래스는 옛부터 지원되는 클래스로 멀티스레드에 안전하게 설계되었다.
		// 싱글스레드에 적합하게 개량된 리스트는 ArrayList, LinkedList... 등이있다.
		// 성능 개선된 클래스 들에는 Element가 들어간 메서드들은 삭제되었다. capacity()도 삭제됨
		Vector<Integer> v = new Vector<>(20,5); //초기 용량값, 용량 증가값
		
		Random rnd = new Random();
		for(int i=0;i<v.capacity();i++) v.add(rnd.nextInt(101));
		
		System.out.println("용량: " + v.capacity() + ", 개수: " + v.size() );
		System.out.println(v);
		
		//데이터 중 50이상인 값을 제거하겠다.
		//앞에서 부터 지우게되면 인데스값이 변경이 되어 앞당겨지므로 뒤에서부터 삭제를 한다.
		for(int i=v.size()-1;i>=0;i--) {
			if(v.get(i) >= 50) v.remove(i);
		}
		System.out.println("용량: " + v.capacity() + ", 개수: " + v.size() );
		System.out.println(v);
		
		
		
		
	}
}
