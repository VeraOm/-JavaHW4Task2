import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.print("Вес (кг.): ");
        int weight = numb.nextInt();
        System.out.print("Рост (см.): ");
        int high = numb.nextInt();
        BmiService service = new BmiService();
        double bmi=service.calculate(high, weight);
        System.out.printf("Индекс Массы Тела - %f", bmi);
        numb.close();
    }

}
