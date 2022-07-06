package draft;

public class BooleanChecker {

    public Boolean method(Boolean a, Boolean b, Boolean c, Boolean d) {
        return (1 & Boolean.hashCode(a) >> 1) + (1 & Boolean.hashCode(b) >> 1) + (1 & Boolean.hashCode(c) >> 1) + (1 & Boolean.hashCode(d) >> 1) == 2;
    }

    public static void main(String[] args) {
        BooleanChecker booleanChecker = new BooleanChecker();
        System.out.println(booleanChecker.method(true, true, false, false));
        System.out.println(booleanChecker.method(true, false, false, false));
        System.out.println(booleanChecker.method(true, true, true, false));
    }
}
