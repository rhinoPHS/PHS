package JavaStudy.tryhelloworld.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {

	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//키보드로 입력받은 문자열을 저장하기 위해 Line변수를 선언
//		String line = null;
//		
//		try {
//			line = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(line);
		String line = null;
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		){
			line = br.readLine();	
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(line);
	}

}
