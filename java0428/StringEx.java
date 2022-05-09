package kr.human.java0428;

public class StringEx {

	public static void main(String[] args) {
		String[] emails = "kimc@daum.net,leec@gmail.com,parkc@naver.com".split(",");
		// 도메인만 뽑아내고 싶다.
		for (String email : emails) {
			System.out.println(email.substring(email.indexOf("@") + 1));
		}
		// 아이디만 뽑아내고 싶다.
		for (String email : emails) {
			System.out.println(email.substring(0, email.indexOf("@")));
		}

		// indexOf('지정문자')
		System.out.println(emails[0].indexOf('@')); // 문자열에 지정 문자열이있는지 앞에서 부터 검색
		System.out.println(emails[0].lastIndexOf('@')); // 문자열에 지정 문자열이있는지 뒤부터 검색한다.

		System.out.println("하하하하하하하호호하하하".indexOf('호')); // 실행결과: 7
		System.out.println("하하하하하하하호호하하하".lastIndexOf('호')); // 실행결과: 8

		// replace(지정문자,바꿀문자)
		String str = "우리나라좋은나라";
		System.out.println(str.replace("나라", "국가")); // "나라"를 찾아서 "국가"로 바꿔준다.
		System.out.println(str); // replace()를 했을경우 원본이 바뀌지 않는다.
		str = "하\t호\t히";
		System.out.println(str);
		str = str.replace("\t", "         ");
		System.out.println(str);
		str = str.replaceAll(" ", "");
		System.out.println(str);
		str = "하\t호\n히\r\n흐";
		System.out.println(str);

		// 갯수세기
		str = "aabbccaassddff";
		int count = str.split("aa").length; // 찾는 문자열을 기준으로 잘라서 배열을 만든다.
		if (!str.endsWith("aa")) { // 찾는 문자열로 끝나지 않으면 배열 길이 -1이 갯수가 된다.
			count--;
		}
		str = "aabbccaassddffaa";
		count = str.split("aa").length;
		if (!str.endsWith("aa")) {
			count--;
		}
		str = String.join("-->", emails);
		System.out.println(str);
		str = String.join("", "한놈", "두식이", "석삼", "너구리", "오징어");
		System.out.println(str);

	}

}
