public class CreditPaymentService {
    public long calculate(long amountOfCredit, long timeMonth, double loanRate) {
        double interestRate = loanRate / (100 * timeMonth);
        double payment = amountOfCredit * (interestRate / (1 - Math.pow(1 + interestRate,
                -timeMonth)));
        return (long) payment;
    }
}