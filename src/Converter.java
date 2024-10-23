public class Converter {
    int convertToKm(int steps)
    {
        int metrs = (int) (steps * 0.00075);
        return metrs;
    }
    int convertStepsToKilocalories(int steps)
    {
        int cal = (int) (steps/20);
        return cal;
    }
}
