package kr.human.java0427;

public class Ex3 {

	public static void main(String[] args) {
		Human human = new Human();
		human.think();
		
		Student student = new Student("220303", "한사람");
		student.think(); //오버라이딩
		student.study();

	}

}
