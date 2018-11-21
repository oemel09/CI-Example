package de.oemel09.ci;

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException();
        return a / b;
    }

    int pow(int base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent > 1) {
            return base * pow(base, exponent - 1);
        }
        return base;
    }
}
