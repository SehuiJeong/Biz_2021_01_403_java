package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.model.ScoreVO;
import com.callor.shop.values.Values;

public class FileReader_02 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/score.txt";
		/*
		 * 파일을 읽을 때 사용하는 클래스
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {

			fileReader = new FileReader(fileName);
			/*
			 * fileReader를 사용한 저수준 코드
			while (true) { 
				int ascii = fileReader.read();
				if (ascii == 1) {
					break;
				}
				System.out.printf("%c\n", ascii);
			}
			*/
			buffer = new BufferedReader(fileReader); // 이 한줄이면 저 while문 포함 그 내용 전부 대신함
			while(true) {
				String str = buffer.readLine(); // nextLine()
				if(str == null) {
					break;
				}
				
				// System.out.println(str);
				strLines.add(str);
			}
			buffer.close();
			fileReader.close(); // 여기까지가 파일을 읽는 부분, while문과 while문 위에 있는 buffer문장까지 제일 중요
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일읽기 끝
		for(String str : strLines) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setMusic(Integer.valueOf(scores[3]));
			scoreVO.setHistory(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}
		
		for (ScoreVO vo : scoreList) {

			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float)sum / 5;
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
			System.out.println(Values.dLine);
			System.out.println("국어\t영어\t수학\t" + "음악\t역사\t총점\t평균");
			System.out.println(Values.sLine);

			for(ScoreVO vo : scoreList) {
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng() + "\t");
			System.out.println(vo.getMath() + "\t");
			System.out.println(vo.getMusic() + "\t");
			System.out.println(vo.getHistory() + "\t");
			System.out.println(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\t");
		}
			System.out.println(Values.dLine);
		

	}

}
