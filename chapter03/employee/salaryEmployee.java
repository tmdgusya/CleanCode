public class SalaryEmployee extends Employee {

    private EmployeeRecord employeeRecord;

    public ComissionedEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    public Money calculatePay() {
        return new Money(120);
    }

}