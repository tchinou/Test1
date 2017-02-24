package JsoupHtmlParsing;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HtmlParserSecondExample {
	 // JSoup Example 2 - Reading HTML page from URL  

	public static void main(String args[]) { 

	String title = null;
	try {

		Document doc;
		doc = Jsoup.connect("http://google.com/").get(); 
		
		title = doc.title(); } 
	
	
	catch (IOException e) {
		
		e.printStackTrace(); } 
	
	System.out.println("Jsoup Can read HTML page from URL, title : " + title);
	
	}
}

	// JSoup Example 3 - Parsing an HTML file in Java //Document htmlFile = Jsoup.parse("login.html", "ISO-8859-1"); // wrong Document htmlFile = null; try { htmlFile = Jsoup.parse(new File("login.html"), "ISO-8859-1"); } catch (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } // right title = htmlFile.title(); Element div = htmlFile.getElementById("login"); String cssClass = div.className(); // getting class form HTML element System.out.println("Jsoup can also parse HTML file directly"); System.out.println("title : " + title); System.out.println("class of div tag : " + cssClass); } }

