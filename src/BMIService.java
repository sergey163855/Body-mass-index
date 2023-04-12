public class BMIService {

    public int calculate(int weight, double height) {
        double bmt = weight / (height * height);

        return (int) bmt;
    }
}
