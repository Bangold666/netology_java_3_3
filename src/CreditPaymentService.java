public class CreditPaymentService {
    public double calculate(int month) {
        float percent = 9.99f;
        int creditsumm = 1_000_000;
        float monthprocent = percent/12 /100 + 1 ;
        double firstYear =  (creditsumm * ((monthprocent-1) * (Math.pow(monthprocent,month)/(Math.pow(monthprocent,month)-1))));
        return firstYear;
    }
}
