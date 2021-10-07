package xml;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//�ǰ�����ɻ��򰡿�_�౹������ �Ľ��ϱ�
//xml������ ---X
//url�� ���ؼ� �����ϰ� xml������ ������ �� parser�� ���ϴ� ������ ����
public class OpenAPIPhamacyTest02 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//�Ľ��� InputStream����
			//1. ������ �����ϴ� url�� �����ؼ� �����͸� ��������
			//1) ������ url�� ������ ����
			StringBuffer pharm_url = new StringBuffer();
			pharm_url.append("http://apis.data.go.kr/B551182/pharmacyInfoService/getParmacyBasisList");
			pharm_url.append("?ServiceKey=j5BLnIkTVGByDXUD4eCsG0TTK3BytEhFn1bQPADzQQ654MElDkkXyMFY4dAh9SVoyqR6LcOkDg6EC7cy8s4wSQ%3D%3D");

			//2) �������� �����ϱ�
			URL url = new URL(pharm_url.toString());
			
			//3) �����ؼ� response�Ǵ� �����͸� �о����
			//	 �о�� �����͸� ���� - BufferedInputStream�� InputStream�� ����
			BufferedInputStream xmldata = new BufferedInputStream(url.openStream());
		
			Document document = builder.parse(xmldata);//InputStream��ü�� ���·� �Ľ��� ������ �Ѱ��ش�.
			Element root = document.getDocumentElement();
			System.out.println(root.getTagName());
			NodeList list = root.getElementsByTagName("item");
			System.out.println(list.getLength());
			for (int i = 0; i < list.getLength() ; i++) {
				Node node = list.item(i);
				NodeList item_childlist = node.getChildNodes();
				for (int j = 0; j < item_childlist.getLength() ; j++) {
					Node item_child = item_childlist.item(j);
					System.out.println(item_child.getNodeName()+":"+item_child.getTextContent());
				}
				System.out.println();
			}
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		}catch (SAXException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}