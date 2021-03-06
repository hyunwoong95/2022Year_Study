package kr.human.java0429;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode //내가 만든 클래스가 Set에서 사용될가능성이 조금이라도 있다면 반드시 해줘야한다.
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	@Override //같으면0, 내가크면 양수, 내가작으면 음수를 리턴하도록 만든다.
	public int compareTo(Person o) {
		// this가 있기 때문에 인수가 1개이다.
		// return this.name.compareTo(o.name); // 이름 오름차순
		// return this.name.compareTo(o.name) * -1; // 이름 내림차순
		// return this.age - o.age; // 나이 오름차순
		// return o.age - this.age; //나이 내림차순
		return this.name.compareTo(o.name) == 0 ? o.age - this.age : this.name.compareTo(o.name); 
	}
	
	
}
