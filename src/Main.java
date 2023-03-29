import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true){
            printMenu();
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    stepTracker.changeStepGoal();
                    break;
                case 3:
                    stepTracker.printStatistic();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("����� ������� ���");

            }

        }
    }
    static void printMenu(){
        System.out.println("1-������ ���������� ����� �� ����������� ����\n" +
                "2-�������� ���� �� ���������� ����� � ����\n" +
                "3-���������� ���������� �� ����������� �����\n" +
                "4-����� �� ����������");
    }
}
