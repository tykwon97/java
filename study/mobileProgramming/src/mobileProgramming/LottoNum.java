package mobileProgramming;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 

public class LottoNum {	
	private String source_id;
	
	public LottoNum(){
		try {
			GetNumber();
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}
	
	public void GetNumber() throws Exception{
		for(int i=0;i<1;i++)
		{
			File input = new File("C:/2021/OpensourceSW/html/¶±.html"); 
			Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
			//System.out.println(doc);
			
			Elements contents;
			String text;
			
			System.out.println("<doc id = \""+ i +"\">");
			
			contents = doc.select("title");
			System.out.println(contents);
			
			System.out.print("<body>");
			contents = doc.select("p");
			text = contents.text();
			System.out.print(text);
			System.out.println("</body>");
			
			System.out.println("</doc>");
		}
		
		
	}
}