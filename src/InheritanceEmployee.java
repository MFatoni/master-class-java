public class InheritanceEmployee extends InheritanceWorker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public InheritanceEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = InheritanceEmployee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "InheritanceEmployee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
