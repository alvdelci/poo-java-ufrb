package comissionEmployee;

// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        //Instancia objeto CommissionEmployee(firstname, lastName, socialSecurityName, grossSales, commissionRate)
        CommissionEmployee commissionEmployee = new CommissionEmployee("Rafithy", "Haspy", "432-34-6435", 4000, .4);
        
        // instancia objeto BasePlusCommissionEmployee(commissionEmployee, baseSalary)
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(commissionEmployee, 600);

        // obtem dados base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
        System.out.printf("%s %.2f%n", "Earnings is", employee.earnings());

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee.toString());
    } // end main
} // end BasePlusCommissionEmployeeTest