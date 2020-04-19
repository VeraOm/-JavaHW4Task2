import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.print("Вес (кг.): ");
        double weight = numb.nextInt();
        System.out.print("Рост (см.): ");
        double high = numb.nextInt();
        BmiService service = new BmiService();
        double bmi = service.calculate(high, weight);
        System.out.printf("Индекс Массы Тела - %f", bmi);
        numb.close();
    }

}
