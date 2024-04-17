package src.lesson1;

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
        System.out.println(
                year % 400 == 0 ? "True" :
                        year % 4 == 0 && year % 100 != 0 ? "true" : "False"
        );
    }

}