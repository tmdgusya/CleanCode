public class PayRoll {

    private static final String COMISSIONED = "COMISSIONED";
    private static final String HOURLY = "HOURLY";
    private static final String SALARIED = "SALARIED";

    public Money calculatePay(Employee e) {
        switch(e.type) {
            case COMISSIONED:
                return calculateComissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
        }
    }

    private Money calculateComissionedPay(Employee e) {
        return new Money(100);
    } 

    private Money calculateHourlyPay(Employee e) {
        return new Money(80);
    } 

    private Money calculateSalariedPay(Employee e) {
        return new Money(120);
    } 

}