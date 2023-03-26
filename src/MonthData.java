public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth(){
        for (int i = 0; i < days.length; i++) {
            System.out.println(i + 1 + " день: " + days[i]);
        }
    }
    int sumStepsFromMonth(){
        int sum = 0;
        for (int i : days
        ) {
            sum += i;
        }
        return sum;
    }
    int maxSteps(){
        int max = 0;
        for (int i : days
        ) {
            if (i > max)max = i;
        }
        return max;
    }
    int bestSeries(int goalByStepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay && days[i + 1] >= goalByStepsPerDay)currentSeries++;
            if (finalSeries < currentSeries)finalSeries = currentSeries;
        }
        return finalSeries;
    }
}
