class HourlyEmployee extends Employee {

    private EmployeeRecord employeeRecord;

    public ComissionedEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    public abstract Money calculatePay() {
        return new Money(120);
    }
}