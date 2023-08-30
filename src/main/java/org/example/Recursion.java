package org.example;

public class Recursion {
    public static int iterativeFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("argument must not be negative");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        int result = number;

        for (int i = number - 1; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int recursiveFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("argument must not be negative");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }


    /*
    * Хвостовая рекурсия — частный случай рекурсии, при котором любой рекурсивный вызов является последней операцией
    * перед возвратом из функции. Подобный вид рекурсии может быть оптимизирован компилятором и заменён на итерацию.
    * В Java компилятор не оптимизирует хвостовую рекурсию.
    */
    public static int tailRecursiveFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("argument must not be negative");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return innerTailRecursiveFactorial(number, number);
    }

    private static int innerTailRecursiveFactorial(int number, int result) {
        if (number == 2) {
            return result;
        }

        return innerTailRecursiveFactorial(number - 1, result * (number - 1));
    }
}
