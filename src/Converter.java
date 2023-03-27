public class Converter {
    private int stepLengthCm = 75;
    private int stepCalories = 50;
    private int kmConvertMetr = 1000;
    private int smConvertMetr = 100;
    private int kiloConvertCalories = 1000;
    int convertToKm(int steps){
        return (int) steps * stepLengthCm / kmConvertMetr / smConvertMetr;
    }
    int convertStepsToKilocalories(int steps){
        return (int) steps * stepCalories / kiloConvertCalories;
    }
}
