import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final String URL = "http://pogoda.spb.ru/";

    public static Document getDocument() throws IOException {
        return Jsoup.parse(new URL(URL), 3000);
    }

    private static String[] getDate(String desc) {
        int count = 0;
        String[] allMatches = new String[5];
        Matcher m = Pattern.compile("\\d\\d\\.\\d\\d").matcher(desc);
        while (m.find()) {
            allMatches[count] = m.group();
            count++;
        }
        return allMatches;
    }

    public static void main(String[] args) {
        try {
            Document document = Parser.getDocument();
            Element weatherTable = document.selectXpath("//table[@class='wt']").first();
            Elements names = weatherTable.selectXpath("//tr[@class='wth']/th[@id='dt']");
            String[] dates = getDate(names.toString());
            System.out.println(dates[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
