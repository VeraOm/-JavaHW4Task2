public class BmiService {
    public double calculate(int high, int weight) {
//        System.out.printf("h=%d, w=%d", high, weight);
//        System.out.println();
        double dWeight=(double)weight;
        double dHigh=(double)high;
        double bmi=(dWeight*10000/(dHigh*dHigh));
        return bmi;
    }
}
