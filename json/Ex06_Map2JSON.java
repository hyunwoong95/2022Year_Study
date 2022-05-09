package kr.human.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import kr.human.json.vo.BibleNameVO;

public class Ex06_Map2JSON {
		public static void main(String[] args) {
		      Gson gson = new Gson();
		      
		      
		      // JSON파일을 자바 map 객체로 읽기
		      try(FileReader fr = new FileReader("src/main/resources/bible_name.json")){
		         @SuppressWarnings("unchecked")
		         Map<String, Object> [] mapArray = gson.fromJson(fr, Map[].class);
		         
		         for(Map<String,Object> map : mapArray) {
		            System.out.println(map);
		         }
		      } catch (FileNotFoundException e) {
		         e.printStackTrace();
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		      
		      // JSON파일을 자바 vo 객체로 읽기
		            try(FileReader fr = new FileReader("src/main/resources/bible_name.json")){
		               @SuppressWarnings("unchecked")
		               BibleNameVO [] voArray = gson.fromJson(fr, BibleNameVO[].class);
		               
		               for(BibleNameVO vo : voArray) {
		                  System.out.println(vo.getK()+ "(" + vo.getE() + ")");
		               }
		            } catch (FileNotFoundException e) {
		               e.printStackTrace();
		            } catch (IOException e) {
		               e.printStackTrace();
		            }
		      
		      
		      // JSON파일을 자바 JsonArray 객체로 읽기
		         try(FileReader fr = new FileReader("src/main/resources/bible_name.json")){
		            @SuppressWarnings("unchecked")
		            JsonArray jsonArray = gson.fromJson(fr, JsonArray.class);
		               
		            
		         } catch (FileNotFoundException e) {
		            e.printStackTrace();
		         } catch (IOException e) {
		            e.printStackTrace();
		         }

		
	}

}
