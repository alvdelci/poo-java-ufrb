package comissionEmployee;

// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        //Instancia objeto CommissionEmployee(firstname, lastName, socialSecurityName, grossSales, commissionRate)
        CommissionEmployee commissionEmployee = new CommissionEmployee("Natiry", "Haspy", "345-33-9435", 4000, .4);

        // obtem dados base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", commissionEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", commissionEmployee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", commissionEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", commissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", commissionEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Earnings is", commissionEmployee.earnings());

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", commissionEmployee.toString());
    } // end main
} // end BasePlusCommissionEmployeeTest