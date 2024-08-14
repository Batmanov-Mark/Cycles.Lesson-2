public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int salary = 15_000;
        int totalMoney = 0;
        int month = 0;
        int initialDepositAmount = 2_459_000;
        while (totalMoney <= initialDepositAmount) {
            totalMoney *= 1.01;
            totalMoney = totalMoney + salary;
            ++month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей");
        }

        //Task 2
        System.out.println("Task 2");
        int number = 1;


        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Task 3
        System.out.println("Task 3");

        int totalNumberPeople = 12_000_000;
        int birthRate = 17;
        int mortality = 8;

        for (int i = 1; i <= 10; i++) {

            totalNumberPeople += totalNumberPeople / 1000 * (birthRate - mortality);
            System.out.println("Год " + i + " ,численность населения составляет " + totalNumberPeople);
        }

        //Task 4
        System.out.println("Task 4");
        month = 0;
        initialDepositAmount = 15_000;
        int finalDepositAmount = 12_000_000;

        while (initialDepositAmount <= finalDepositAmount) {
            ++month;
            initialDepositAmount *= 1.07;

            System.out.println("Месяц " + month + " , сумма накоплений " + initialDepositAmount);

        }

        //Task 5
        System.out.println("Task 5");

        month = 0;
        initialDepositAmount = 15_000;
        finalDepositAmount = 12_000_000;

        while (initialDepositAmount <= finalDepositAmount) {
            ++month;
            initialDepositAmount *= 1.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений " + initialDepositAmount);
            }
        }


        //Task 6
        System.out.println("Task 6");

        initialDepositAmount = 15_000;
        for (int i = 1; i <= (9 * 12); i++) {
            initialDepositAmount *= 1.07;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений " + initialDepositAmount);
            }
        }

        //Task 7
        System.out.println("Task 7");

        int friday1 = 1;
        int dayNumber = 7;
        while (friday1 <= 31) {
            System.out.println("Сегодня пятница, " + friday1 + " -е число. Необходимо подготовить отчет");
            friday1 += dayNumber;
        }


        //Task 8
        System.out.println("Task 8");

        int currentYear = 2024;
        int finishYear = currentYear + 100;
        int startYear = currentYear - 200;

        for (int i = startYear; i <= finishYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);


            }
        }
    }
}