package comparation.lesson_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zorro");
        list.add("Spider-man");
        list.add("Batman");
        list.add("Captain America");

        System.out.println("Before:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After:");
        System.out.println(list);
    }
}
