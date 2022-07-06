package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sid {

    public static String howMuchILoveYou(int nb_petals) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "I love you",
                "a little",
                "a lot",
                "passionately",
                "madly",
                "not at all"
        ));

        int counter = 0;
        String result = "";

        for (int i = 0; i < nb_petals; i++) {
            result = list.get(counter);
            counter++;
            if (counter == 6) {
                counter = 0;
            }
        }
        return result;
    }
}
