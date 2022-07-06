package draft;

public class OverloadMethodDZTest {
    private static final OverloadMethodDZ OVERLOAD_METHOD_DZ = new OverloadMethodDZ();

    public static void main(String[] args) {
        int otvet1 = OVERLOAD_METHOD_DZ.metOver(0);
        int otvet2 = OVERLOAD_METHOD_DZ.metOver(0, 1);
        int otvet3 = OVERLOAD_METHOD_DZ.metOver(0, 1, 2);
        int otvet4 = OVERLOAD_METHOD_DZ.metOver(0, 1, 2, 3);

        System.out.println(otvet1);
        System.out.println(otvet2);
        System.out.println(otvet3);
        System.out.println(otvet4);
    }
}
