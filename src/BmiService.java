public class BmiService {
    public double calculate(double high, double weight) {
//        System.out.printf("h=%d, w=%d", high, weight);
//        System.out.println();
//        double dWeight=(double)weight;
//        double dHigh=(double)high;
        double bmi = (weight * 10000 / (high * high));
        return bmi;
    }
}
