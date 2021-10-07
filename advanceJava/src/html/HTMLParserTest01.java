package html;
//Jsoup���̺귯���� �̿�

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
			//1. ���ϴ� ������ �ִ� HTML�������� �����ϱ�
			//	 => Connection�� java.sql�� Connection�� �ƴ϶� ũ�Ѹ��ϰ� ���� �������� ������ ������ ��� �ִ� Jsoup�� ��ü 
			Connection con = Jsoup.connect("https://finance.naver.com/sise/sise_rise.naver");
			//2. ������ �������� ��� response�ϴ� �����͸� Document��ü�� ��ȯ
			//	 => Document��ü�� DOM API�� Document�� �ƴ϶� Jsoup���� �����ϴ� Document
			Document document = con.get();
			if(document!=null) {
				//3. ���ϴ� ������Ʈ(html�±� ���)�� �޾ƿ���
				//	 Elements�� ���� ���� Element�� �޾ƿ��� - NodeList�� ����
				//	 Element�� �� ���� Element - Node�� ����
				//	 ---> table�±� �߿��� class�Ӽ��� type_2�� ������Ʈ�� tbody�±� ������ ��� tr�� ��������
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
