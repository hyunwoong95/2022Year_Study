package kr.human.net1;

import java.io.IOException;

public class RuntimeEx {

	public static void main(String[] args) {
		try {
			// JDK 1.4 이전
			Runtime.getRuntime().exec("notepad.exe");//메모장
			Runtime.getRuntime().exec("mspaint.exe");//그림판
			
			// JDK 1.5 이상
			ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
			processBuilder.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
