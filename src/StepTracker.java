import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("для выхода в преведущее меню ведите 0");
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber == 0)return;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("неверно введены данные повторите попытку");
            addNewNumberStepsPerDay();
            return;
        }
        System.out.println("вы ввели: " + monthNumber);
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (dayNumber == 0)return;
        if (dayNumber < 1 || dayNumber > 30) {
            System.out.println("неверно введены данные повторите попытку");
            addNewNumberStepsPerDay();
            return;
        }
        System.out.println("вы ввели: " + dayNumber);
        System.out.println("Введите количество шагов");
        int stepsOfNumber = scanner.nextInt();
        if (stepsOfNumber == 0)return;
        if (stepsOfNumber < 1) {
            System.out.println("неверно введены данные повторите попытку");
            addNewNumberStepsPerDay();
            return;
        }
        System.out.println("вы ввели: " + stepsOfNumber);

        MonthData monthData = this.monthData[monthNumber - 1];
        monthData.days[dayNumber - 1] = stepsOfNumber;
        System.out.println("данные успешно сохранены");
    }
    void changeStepGoal(){
        System.out.println("ведите новую цель по количеству шагов\n" +
                "для выхода в преведущее меню ведите 0");
        int stepsGoal = scanner.nextInt();
        if (stepsGoal == 0)return;
        if (stepsGoal < 1) {
            System.out.println("неверно введены данные повторите попытку");
            changeStepGoal();
            return;
        }
        goalByStepsPerDay = stepsGoal;
        System.out.println("данные успешно сохранены");
    }
    void printStatistic(){

        System.out.println("Введите число месяца");
        Converter converter = new Converter();
        MonthData monthData = this.monthData[scanner.nextInt() - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        System.out.println("сумма шагов за месяц: " + sumSteps);
        System.out.println("максимальное пройденноое количество шагов за месяц: " + monthData.maxSteps());
        System.out.println("среднее пройденное количество шагов за месяц: " + sumSteps / 30);
        System.out.println("пройденна за месяц дистанция в км: " + converter.convertToKm(sumSteps));
        System.out.println("количество сожжённых килокалорий за месяц: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));


    }
}
