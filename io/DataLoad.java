package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataLoad {
	public static void main(String[] args) {
		DataVO vo =null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data3.dat"))){
			System.out.println(ois.readObject());
			System.out.println("저장완료!");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
}
