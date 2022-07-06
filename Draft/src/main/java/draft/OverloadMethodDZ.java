package draft;

public class OverloadMethodDZ {
    int metOver(int i1) {
        return i1;
    }

    int metOver(int i1, int i2) {
        return i1 + i2;
    }

    int metOver(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    int metOver(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }
}
