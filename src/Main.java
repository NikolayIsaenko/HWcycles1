public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        // Задача 2
        System.out.println("Задача 2");

        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        // Задача 4
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        // Задача 5
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " - Високосный год");
        }
        // Задача 6
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задача 7
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Задача 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + total + " рублей. ");
        }
        // Задача 9
        System.out.println("Задача 9");
        salary = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + total + " рублей. ");
        }
        // Задача 10
        System.out.println("Задача 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + number + "=" + 2 * i);
        }
    }
}