package unittest;

import java.util.Arrays;

public class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int... b) {
        return a + Arrays.stream(b).sum();
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
