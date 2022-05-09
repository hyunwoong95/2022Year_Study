package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOEx03 {
	public static void main(String[] args) {
		// 최근방식: 자동닫기
		try(FileInputStream fis = new FileInputStream("src/main/resources/chunja2.txt");) {
			int n = 0;
			byte[] data = new byte[2048]; //바이트 배열
			while((n=fis.read())>0) {	//read(바이트 배열) : 배열 크기만큼씩 읽는다. n은 읽은 길이리턴
				// new String(바이트 배열, 시작값, 길이
				System.out.println(new String(data,0,n));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
