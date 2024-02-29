public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задача 2
        System.out.println("Задача 2");

        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2) {
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


        // Домашка 2-ая часть циклов.
        // Задача 1

        System.out.println("Задача 1");
        salary = 15000;
        total = 0;
        int i = 1;
        while (total <= 1_495_000) {
            i = i + 1;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + total + " рублей. ");
        }

        // Задача 2
        System.out.println("Задача 2");
        int q = 1;
        for (; q <= 10; q++) {
            System.out.print(q + " ");
        }

        System.out.println();
        for(q =10;q >=0;q--) {
        System.out.print(q + " ");
        }
        System.out.println();

    // Задача 3
        System.out.println("Задача 3");

    int Y = 12_000_000;
    int diffPeople = 1000 / (18 - 7);
        for(
    int year = 1;
    year <=10;year++)

    {
        Y = Y + diffPeople;
        System.out.println("Год - " + year + " , население = " + Y);
    }

    // Задача 4
        System.out.println("Задача 4");


    int percentageOfTheDeposit = (15_000 / 100) * 7;
    total =15000;
        for(
    int month = 1;
    total <=12_000_000;month++)

    {
        total = total + percentageOfTheDeposit;
        System.out.println("Месяц - " + month + ", сумма накоплений равна " + total + " рублей. ");
    }

    // Задача 5
        System.out.println("Задача 5");
    total =15000;
    percentageOfTheDeposit =(15_000/100)*7;
        for(
    int month = 1;
    total <=12_000_000;month++)

    {
        total = total + percentageOfTheDeposit;
        if (month % 6 == 0) {
            System.out.println("Месяц - " + month + ", сумма накоплений равна " + total + " рублей. ");
        }
    }

    // Задача 6
        System.out.println("Задача 6");
    total =15000;
    percentageOfTheDeposit =(15_000/100)*7;
        for(
    int month = 1;
    total <=12_000_000;month++)

    {
        total = total + percentageOfTheDeposit;
        if (month % 6 == 0 && month <= 108) {
            System.out.println("Месяц - " + month + ", сумма накоплений равна " + total + " рублей. ");
        } // 9 лет - 108 месяцев
    }
    // Задача 7
        System.out.println("Задача 7");
    int dayOfWeek = 2;
        for(;dayOfWeek <=31;dayOfWeek++)

    {
        if (dayOfWeek % 7 == 0) {
            System.out.println("Сегодня пятница, " + dayOfWeek + " -е число. Необходимо подготовить отчет");
        } else {
            System.out.println(" Отчёт делать не нужно");
        } // Вроде для понятности надо написать было каждый день недели, но в условиях к задаче этого не было =)
    }

    // Задача 8
        System.out.println("Задача 8!");


        for(
    int flightComet = 0;
    flightComet< 2124;flightComet =flightComet +79)

    {
        if ((flightComet % 79 == 0 && flightComet > 1824) && flightComet < 2224) {
            System.out.println(flightComet);
        }
    }


}
}