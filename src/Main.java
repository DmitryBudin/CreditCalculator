public class Main {
    public static void main(String[] args) {

        CreditCalculatorService service= new CreditCalculatorService();

        double monthPayment1= service.calculate(1000000,12,9.99);
        System.out.println(monthPayment1);
        double monthPayment2= service.calculate(1000000,24,9.99);
        System.out.println(monthPayment2);
        double monthPayment3= service.calculate(1000000,36,9.99);
        System.out.println(monthPayment3);





    }
}
