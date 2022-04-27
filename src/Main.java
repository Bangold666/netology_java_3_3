public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double firstYear = (int) service.calculate(12);
        System.out.println(firstYear + " Ежемесячный платёж при сроке кредита 1 год ");
        double secondYear = (int) service.calculate(24);
        System.out.println(secondYear + " Ежемесячный платёж при сроке кредита 2 года  ");
        double thirdYear = (int) service.calculate(36);
        System.out.println(thirdYear + " Ежемесячный платёж при сроке кредита 3 года  ");
    }
}
