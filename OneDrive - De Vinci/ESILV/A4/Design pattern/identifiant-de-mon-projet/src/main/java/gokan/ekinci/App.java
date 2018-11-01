package gokan.ekinci;
import org.jsoup.Jsoup;

public class App {
    public static void main( String[] args ) {
        String htmlText = "<h1>Hello World!</h1>";
        System.out.println( Jsoup.parse(html).text() );
    }
}