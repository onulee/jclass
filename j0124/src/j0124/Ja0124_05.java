package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ja0124_05 {

	public static void main(String[] args) {
		// FileWriter
		try {
			FileWriter fw = new FileWriter("c:/save2/abc.txt");
			BufferedWriter bw = new BufferedWriter(fw); //한번에 저장
			for(int i=0;i<10;i++) {
				String str = "안녕하세요. "+ i+"\r\n";
				bw.write(str);
			}
			bw.close();
		} catch (Exception e) {	e.printStackTrace();}
		
		
		
		// FileReader 문서를 읽어오기
//		try {
//			FileReader fr = new FileReader("c:/save/aaa.txt");
//			BufferedReader br = new BufferedReader(fr); //1줄씩 가져오기
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break;
//				System.out.println(line);
//			}
//			
//		} catch (Exception e) { e.printStackTrace();}
		
		System.out.println("프로그램 종료");

	}

}
