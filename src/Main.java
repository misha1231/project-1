import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int value = scanner.nextInt();
            if (value == 1) stepTracker.addNewNumberStepsPerDay();
            else if (value == 2) stepTracker.changeStepGoal();
            else if (value == 3) stepTracker.printStatistic();
            else if (value == 4) {break;}
            else {
                System.out.println("Ты клоун");
            }

    }
    }

    public static void printMenu() {System.out.println(
            "Выберите команду\n 1 - ввести количество шагов за определённый день\n " +
                    "2 - изменить цель по количеству шагов в день\n " +
                    "3 - напечатать статистику за определённый месяц\n " +
                    "4 - выйти из приложения.");
    }
    }
