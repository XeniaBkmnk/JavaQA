package src.lesson1;

import java.util.Random;

public class Lesson_1 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 22;
        int b = -1;
        int x = a + b;

        if (x >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 46;
        int b = 0;
        if (a >= b) {
            System.out.println("a>=b");
        } else
            System.out.println("a<b");
    }

    public static void checkBoolean() {
        int a = 11;
        int b = -15;
        int sum = a + b;
        boolean isInRange = sum >= 10 && sum <= 20;
        System.out.println(isInRange);
    }

    public static void positiveOrNegativeNumber() {
        int a = -4;

        if (a >= 0) {
            System.out.println("Положительное число");
        } else
            System.out.println("Отрицательное число");
    }

    public static void isNegative() {
        int a = -10;

        boolean isNegative = a < 0;
        System.out.println(isNegative);
    }

    public static void outputArgument(String x, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(x);
        }
    }

    public static void booleanLeapYear() {
        int year = 2024;
        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeapYear);
    }

    public static void replaceValue() {
        int[] array = {1, 1, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void fillInArrayDifferentNumber() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

}