public class CreditPaymentService {
    public double calculate(int month) {
        float percent = 9.99f;
        int creditSumm = 1_000_000;
        float monthProcent = percent / 12 / 100 + 1;
        double firstYear = (creditSumm * ((monthProcent - 1) * (Math.pow(monthProcent, month) / (Math.pow(monthProcent, month) - 1))));
        return firstYear;
    }
}
