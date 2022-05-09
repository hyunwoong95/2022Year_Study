package kr.human.java0428;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("한사람");
		StringBuffer sb2 = new StringBuffer("한사람");
		
		System.out.println(sb1 == sb2 ? "같다":"다르다");
		System.out.println(sb1.equals(sb2) ? "같다":"다르다");
		// 같은지 판단을 못한다.
		
		//String으로 바꿔서 비교해야 한다.
		System.out.println(sb1.toString().equals(sb2.toString()) ? "같다":"다르다");
		
		System.out.println("용량: " + sb1.capacity());	//기본값 19였지만
		sb1.append("하하하하하하하하");
		sb1.append("하하하하하하하하");
		sb1.append("하하하하하하하하");
		sb1.append("하하하하하하하하");
		sb1.append("하하하하하하하하");
		sb1.append("하하하하하하하하");	//계속 추가하면 용량이 자동으로 늘어난다.
		System.out.println("용량: " + sb1.capacity());
		
		//계속 용량이 증가되면 메모리 이동이 내부적으로 일어나서 속도의 저하를 가져올수있다.
		//그래서 어느정도의 크기가 들어갈것을 예측가능하면 처음에 용량을 지정가능하다.
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer(10000);
		System.out.println("용량: " + sb3.capacity());
		System.out.println("용량: " + sb4.capacity());
		
		int i = 100;	//기본 자료형
		Integer ii = 200;	// 객체형(참조형 변수)
		
		int j = Integer.valueOf(ii); // 객체형을 기본자료형으로 바꿔준다. ==> UnBoxing
		Integer jj = new Integer(i); // 기본자료형을 객체형으로 바꿔준다. ==> Boxing
		
		//JDK 1.5부터 AutoBoxing, AutoUnBoxing 이 지원된다.
		int k = ii;	//AutoUnBoxing
		Integer kk = i; //AutoBoxing
		
		i = Integer.valueOf("123"); // 리턴값이 Integer형이다. 즉, 객체형이다.
		ii = Integer.parseInt("123"); // 리턴값이 int형이다. 즉, 기본자료형이다.
		
		System.out.println(i);
		System.out.println(ii);
		
		
	}

}
