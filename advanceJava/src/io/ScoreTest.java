package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ScoreTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		int sum = 0;
		int count = 0;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
					
				}
				String[] data = line.split(",");
				sum = sum + Integer.parseInt(data[1]);
				System.out.println(data[0]+"의 점수는 "+data[1]+"점 입니다.");
				count++;
			}
			System.out.println("모두의 총점은 "+sum+"점 입니다.");
			System.out.println("모두의 평균은 "+sum/count+"점 입니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
