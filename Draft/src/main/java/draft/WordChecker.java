package draft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {
    private final static String CORRECT = "correct";
    private final static String PRESENT = "present";
    private final static String ABSENT = "absent";
    private final static String MOCK = "-";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        checkWord(br.readLine(), br.readLine());
    }

    public static void checkWord(String sWord, String qWord) {
        List<String> sWordArray = new ArrayList<>(Arrays.asList(sWord.split("")));
        List<String> qWordArray = new ArrayList<>(Arrays.asList(qWord.split("")));

        for (int i = 0; i < sWordArray.size(); i++) {
            if (sWordArray.get(i).equals(qWordArray.get(i))) {
                sWordArray.set(i, MOCK);
                qWordArray.set(i, CORRECT);
            }
        }

        for (int i = 0; i < sWordArray.size(); i++) {
            if (sWordArray.contains(qWordArray.get(i))) {
                sWordArray.set(sWordArray.indexOf(qWordArray.get(i)), MOCK);
                qWordArray.set(i, PRESENT);
            }
        }

        for (String str : qWordArray) {
            if (!str.equals(CORRECT) && !str.equals(PRESENT)) {
                qWordArray.set(qWordArray.indexOf(str), ABSENT);
            }
        }

        qWordArray.forEach(System.out::println);
    }
}
