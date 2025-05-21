public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Ironman", 1, 84000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Superman", 2, 20, 340);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("Initial Employee Details");
        payrollSystem.displayEmployees();
        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employees Details: ");
        payrollSystem.displayEmployees();
    }
}