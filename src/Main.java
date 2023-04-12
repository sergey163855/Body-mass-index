// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();

        int bmt = service.calculate(98, 1.87);
        System.out.println("Индекс массы тела:" + bmt);
    }
}
