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

}