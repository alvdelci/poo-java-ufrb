package HerancaComposicao.comissionEmployee;
// Fig. 9.10: CommissionEmployee.java

public class CommissionEmployee extends Employee {
    // variaveis de instancia
    private double grossSales; // Vendas brutas
    private double commissionRate; // porcentagem e comissao

    // Contrutor de cinco argumentos
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        // Chamando contrutor de Employee
        super(firstName, lastName, socialSecurityNumber);

        // if grossSales is invalid throw exception
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setSocialSecurityNumber(socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    // Retorna firstName
    public String getFirstName() {
        return super.getFirstName();
    }

    // retorna lastName
    public String getLastName() {
        return super.getLastName();
    }

    // retorna socialSecurityName
    public String getSocialSecurityNumber() {
        return super.getSocialSecurityNumber();
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
        return String.format(super.toString() + "\nGross sales " + getGrossSales() + "\nCommission rate " +
                getCommissionRate() + "\nEarnings " + earnings());
    }
} // CommissionEmployee