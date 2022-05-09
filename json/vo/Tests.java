package kr.human.json.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlRootElement(name="Tests")   //루트태그의 이름을 지정한다. name으로 변경가능하다.
@XmlAccessorType(XmlAccessType.FIELD)//세부사항을 변수명에다가 지정하겠다.
public class Tests {

		@XmlElement(name ="Test") //태그로 사용하겠다.
		List<Test> test;
		
		@Data
		@XmlRootElement
		@XmlType(propOrder = {"name","commandLine","input","output"}) //태그 순서를 지정
		@XmlAccessorType(XmlAccessType.FIELD)//세부사항을 변수명에다가 지정하겠다.
		public static class Test{
				@XmlAttribute(name ="TestId")
				private String testId;
				
				@XmlAttribute(name ="TestType")
				private String testType;
				
				@XmlAttribute(name ="Name")
				private String name;
				
				@XmlAttribute(name ="CommandLine")
				private String commandLine;
				
				@XmlAttribute(name ="Input")
				private String input;
				
				@XmlAttribute(name ="Output")
				private String output;
				
			
			
		}
}
