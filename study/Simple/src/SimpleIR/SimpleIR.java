package SimpleIR;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SimpleIR {

	public static void main(String[] args) throws ParserConfigurationException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		Document docu = docBuilder.newDocument();

		//docs element
		Element docs = docu.createElement("docs");
		docu.appendChild(docs);

		//doc element
		Element doc = docu.createElement("doc");
		docs.appendChild(doc);
		
		//속성 값 id = 0 ~ n
		int n=0;
		String numStr = String.valueOf(n);
		doc.setAttribute("id",numStr);
		n++;
		
		//title element
		Element title = docu.createElement("title");
		title.appendChild(docu.createTextNode("테넷"));
		doc.appendChild(title);
		
		//body element
		Element body = docu.createElement("body");
		body.appendChild(docu.createTextNode("테넷"));
		doc.appendChild(body);
		
	}

}
