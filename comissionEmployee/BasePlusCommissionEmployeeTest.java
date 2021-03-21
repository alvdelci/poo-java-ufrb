package comissionEmployee;

// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        //Instancia objeto CommissionEmployee
        CommissionEmployee commissionEmployee = new CommissionEmployee("Rafithy", "Haspy", "432-34-6435", 4000, .04);
        
        // instancia objeto BasePlusCommissionEmployee
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(commissionEmployee, 300);

        // obtem dados base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getEmployee().getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getEmployee().getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getEmployee().getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getEmployee().getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getEmployee().getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
    } // end main
} // end BasePlusCommissionEmployeeTest