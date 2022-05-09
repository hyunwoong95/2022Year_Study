package kr.human.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataSave {
	public static void main(String[] args) {
		DataVO vo = new DataVO("문자열", 1234);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data3.dat"))){
			oos.writeObject(vo);
			oos.flush();
			System.out.println("저장완료!");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
