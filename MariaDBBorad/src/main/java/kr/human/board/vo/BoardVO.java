package kr.human.board.vo;

import java.util.Date;

import lombok.Data;

// 테이블과 1:1 대응 되게 만든다.
@Data
public class BoardVO {
	private int idx;
	private String name;
	private String password;
	private String subject;
	private String content;
	private Date regDate;
	private int clickCount;
	private String ip;
	
	// 수정/삭제 구분
	private String mode;
}
