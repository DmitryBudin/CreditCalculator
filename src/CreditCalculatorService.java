public class CreditCalculatorService {
    public double calculate (double Amount,double Period,double Rate){

        double monthRate = Rate /100 / 12;

        double monthPayment = Amount * monthRate / (1 - 1 / (Math.pow(1+ monthRate, Period)));
        return monthPayment;
    }

}
