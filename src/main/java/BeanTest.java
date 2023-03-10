import com.sun.management.GarbageCollectionNotificationInfo;
import javabeans.Album;
import javabeans.Author;
import javabeans.Quote;

import java.util.ArrayList;
import java.util.Queue;

public class BeanTest {

    public static void main(String[] args) {
        Album AbbeyRoad = new Album(1, "Beetles", "AbbeyRoad", 1969, 5.0, "Rock");
        System.out.println(AbbeyRoad);

        Author Gaimain = new Author(1, "Neil", "Gaiman");

        ArrayList<Quote> GaimanQuotes = new ArrayList<>();

        Quote fairyTales = new Quote(1, "Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten", Gaimain);

        Quote love = new Quote(2, "Have you ever been in love? Horrible isn't it? It makes you so vulnerable", Gaimain);

        GaimanQuotes.add(fairyTales);
        GaimanQuotes.add(love);
//        System.out.println(GaimanQuotes);
        for (Quote gaimanQuote : GaimanQuotes) {
            System.out.println(gaimanQuote);
        }

    }
}
