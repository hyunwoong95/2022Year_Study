package kr.human.java0428;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Data
@Getter
@ToString
public class Account {	//은행 계좌 정보
	private String accountNo;	// 계좌번호
	private String ownwerName;	// 예금주
	private int balance;	// 잔액
	
	//입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금
	public int withdraw(int amount) throws Exception { // 이 메서드는 에외를 발생시키는 메서드이다.
		if(balance < amount) {						   // 이 메서드를 사용하는 쪽에서 반드시 예외처리 하도록 강제한다.
			//throw new Exception("잔액이 부족합니다."); //예외 던지기
			throw new RuntimeException("잔액부족!!!"); //예외처리 선택
		}
		balance -= amount;
		return amount;
	}
}
