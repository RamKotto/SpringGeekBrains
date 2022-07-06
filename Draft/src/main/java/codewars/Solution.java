package codewars;

public class Solution {

    public static String doubleChar(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i);
            res += s.charAt(i);
        }
        return res;
    }
}
