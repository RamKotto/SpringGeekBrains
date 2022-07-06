package codewars;

public class Clock {

    static final int HOUR_IN_MILLS = 3600000;
    static final int MINUTE_IN_MILLS = 60000;
    static final int SECOND_IN_MILLS = 1000;

    int myDigit;

//
//    public static int Past(int h, int m, int s) {
//        return h * HOUR_IN_MILLS + m * MINUTE_IN_MILLS + s *  SECOND_IN_MILLS;
//    }


    public static void main(String[] args) {
        // static
        System.out.println(Clock.HOUR_IN_MILLS);

        // non-static
        Clock inst = new Clock();
        inst.myDigit = 1000;
        System.out.println(inst.myDigit);
    }
}
