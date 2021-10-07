public class ComissionedEmployee extends Employee {

    private EmployeeRecord employeeRecord;

    public ComissionedEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    public Money calculatePay() {
        return new Money(100);
    }

}