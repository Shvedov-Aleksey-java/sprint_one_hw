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
        int nullSeries = 0;
        int currentSeries = 1;
        int finalSeries = 0;
        for (int i = 0; i < days.length - 1; i++) {
            if (days[i] >= goalByStepsPerDay && days[i + 1] >= goalByStepsPerDay){
                currentSeries++;
            }else {
                currentSeries = 1;
            }
            if (days[i] == 0)nullSeries++;
            if (finalSeries < currentSeries)finalSeries = currentSeries;
        }
        System.out.println(nullSeries);
        if (nullSeries == 29&&days[29] == 0)finalSeries = 0;
        return finalSeries;
    }
}
