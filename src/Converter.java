public class Converter {
    int convertToKm(int steps){
        return (int) steps * 75 / 100000;
    }
    int convertStepsToKilocalories(int steps){
        return steps * 50000;
    }
}
