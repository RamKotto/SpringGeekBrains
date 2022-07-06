package codewars;

public class StaticTest {

    static int digit = 100;

    public void setDigit(int number) {
        digit = number;
    }

    public int getDigit() {
        return digit;
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        st1.setDigit(500);
        System.out.println(st1.getDigit());

        StaticTest st2 = new StaticTest();
        st2.setDigit(666);
        System.out.println(st2.getDigit());
        System.out.println(st1.getDigit());

    }
}
