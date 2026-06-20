package com.laboratory.unittesting;

public class CustomMath {

    /**
     * Calculează suma a două numere întregi
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Împarte primul număr la al doilea
     * Aruncă excepție dacă împărțitorul este 0
     */
    public static int division(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Devider is 0");
        }

        return (x / y);
    }

    /**
     * Verifică dacă numărul este pozitiv
     */
    public static boolean isPositive(int x) {
        return x > 0;
    }

    /**
     * Verifică dacă numărul este negativ
     */
    public static boolean isNegative(int x) {
        return x < 0;
    }

    /**
     * Verifică dacă numărul este par
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * Verifică dacă numărul este impar
     */
    public static boolean isOdd(int x) {
        return x % 2 != 0;
    }

    /**
     * Verifică dacă primul număr este mai mare decât al doilea
     */
    public static boolean isGreater(int x, int y) {
        return x > y;
    }

    /**
     * Verifică dacă primul număr este mai mic decât al doilea
     */
    public static boolean isSmaller(int x, int y) {
        return x < y;
    }

    /**
     * Verifică dacă cele două numere sunt egale
     */
    public static boolean isEqual(int x, int y) {
        return x == y;
    }

    /**
     * Verifică dacă primul număr este divizibil cu al doilea
     * Aruncă excepție dacă împărțitorul este 0
     */
    public static boolean isDivisible(int x, int y) {
        if (y == 0) throw new IllegalArgumentException("Devider is 0");
        return x % y == 0;
    }

    /**
     * Verifică dacă suma a două numere este pozitivă
     */
    public static boolean isSumPositive(int x, int y) {
        return (x + y) > 0;
    }

    /**
     * Verifică dacă produsul a două numere este pozitiv
     */
    public static boolean isProductPositive(int x, int y) {
        return (x * y) > 0;
    }

    /**
     * Punctul de intrare al programului
     */
    public static void main(String[] args) {
        // --- Sarcina 1 ---
        // if (sum(1, 3) == 4) {
        //     System.out.println("Test1 passed.");
        // } else {
        //     System.out.println("Test1 failed.");
        // }

        // --- Sarcina 2 ---
        // try {
        //     int z = division(1, 0);
        //     System.out.println("Test3 failed.");
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Test3 passed.");
        // }

        System.out.println("Programul a rulat");
    }
}