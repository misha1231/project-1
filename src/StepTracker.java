import java.util.Scanner;

class StepTracker {
    Converter  convert = new Converter();
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }




    void addNewNumberStepsPerDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int numberMonth = scanner.nextInt();
        if((numberMonth > 12) || (numberMonth < 1)) {
            System.out.println("Вы ввели неккоректное значение месяца");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int numberDay = scanner.nextInt();
        if((numberDay > 30) || (numberDay < 1)) {
            System.out.println("Вы ввели неккоректное значение дня");
            return;
        }
        System.out.println("Введите количество шагов");
            int quantitySteps = scanner.nextInt();
            if(quantitySteps < 0) {
            System.out.println("Вы ввели неккоректное значение количества шагов");
            return;
        }
        MonthData monthData = monthToData[numberMonth - 1];
        monthData.days[numberDay-1] = quantitySteps;
    }
    void changeStepGoal() {
        System.out.println("Введите новую цель");
        int goal = scanner.nextInt();
        if (goal <= 0) {
            System.out.println("Вы ввели неккоректное значение цели");
            return;
        }
        goalByStepsPerDay = goal;
    }


    void printStatistic()
    {
        System.out.println("Введите номер месяца");

        int month = scanner.nextInt();
        if (month > 12)
        {
            System.out.println("Вы клоун");
            return;
        }
        if (month < 1)
        {
            System.out.println("Вы клоун");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("количество пройденных шагов по дням:");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("общее количество шагов за месяц:" +
                sumSteps);
        System.out.println("максимальное пройденное количество шагов в месяце:" +
                monthData.maxSteps());
        System.out.println("среднее количество шагов:" +
                sumSteps/30);
        System.out.println("пройденная дистанция (в км):" +
                convert.convertToKm(sumSteps));
        System.out.println("количество сожжённых килокалорий:" +
                convert.convertStepsToKilocalories(sumSteps));
        System.out.println("лучшая серия:" + monthData.bestSeries(goalByStepsPerDay));
    }
}