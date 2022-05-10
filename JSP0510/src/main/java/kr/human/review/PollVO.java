package kr.human.review;

import lombok.Data;

/* json형식
 
"title" : "제일 자신있는 과목은?",
"item" : ["HTML", "CSS", "Javascript","java", "JSP"],
"itemCount" : [10,5,23,67,33]
 
*/

@Data
public class PollVO {
	
	private String title;
	private String[] item;
	private int[] itemCount;
	
	
}
