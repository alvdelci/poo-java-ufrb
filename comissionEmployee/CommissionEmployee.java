package comissionEmployee;
// Fig. 9.10: CommissionEmployee.java

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Contrutor de cinco argumentos
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        // implicit call to Object constructor occurs here

        // if grossSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    // Retorna nome
    public String getFirstName() {
        return firstName;
    }

    // retorna sobrenome
    public String getLastName() {
        return lastName;
    }

    // retorna numero da previdencia social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // define valor de venda bruto
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    // retorna valor de venda bruto
    public double getGrossSales() {
        return grossSales;
    }

    // define taxa de comissão
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // retorna taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // calcula ganhos
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // retorna string de representação de objeto CommissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", getFirstName(),
                getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
} // CommissionEmployee