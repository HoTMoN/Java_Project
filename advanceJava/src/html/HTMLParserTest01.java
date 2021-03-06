package html;
//Jsoup라이브러리를 이용

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParserTest01 {
	public static void main(String[] args) {
		
		try {
			/*
			 * Document document =
			 * Jsoup.connect("https://finance.naver.com/site/size_rise.naver").get();
			 */			
			//1. 원하는 정보가 있는 HTML페이지에 접속하기
			//	 => Connection은 java.sql의 Connection이 아니라 크롤링하고 싶은 페이지에 연결한 정보를 담고 있는 Jsoup의 객체 
			Connection con = Jsoup.connect("https://finance.naver.com/sise/sise_rise.naver");
			//2. 접속한 페이지의 모든 response하는 데이터를 Document객체로 변환
			//	 => Document객체는 DOM API의 Document가 아니라 Jsoup에서 제공하는 Document
			Document document = con.get();
			if(document!=null) {
				//3. 원하는 엘리먼트(html태그 노드)를 받아오기
				//	 Elements는 여러 개의 Element를 받아오기 - NodeList와 동일
				//	 Element는 한 개의 Element - Node와 동일
				//	 ---> table태그 중에서 class속성이 type_2인 엘리먼트의 tbody태그 하위의 모든 tr을 가져오기
				Elements elements = document.select("table[class='type_2']>tbody>tr");
				System.out.println(elements.size());
				int size = elements.size();
				for (int i = 0; i < size ; i++) {
					Element tag = elements.get(i);
					System.out.println(tag.text());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
