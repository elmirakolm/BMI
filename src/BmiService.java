public class BmiService {

    public int calculate(double weight, double height) {
        int bmi = (int) (weight / (height * height));

        return bmi;
    }
}