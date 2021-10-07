public class EmployeeFactoryImpl implements EmployeeFactory {

    public Employee makeEmployee(EmployeeRecord r) {
        switch(e.type) {
            case COMISSIONED:
                return ComissionedEmployee(e);
            case HOURLY:
                return HourlyEmployee(e);
            case SALARIED:
                return SalaryEmployee(e);
        }
    }

}