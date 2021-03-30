package comissionEmployee;
// Fig. 9.11: BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee {
    private double baseSalary; // salario base por semana

    // variável CommissionEmployee
    private CommissionEmployee empregadoPorComissao;

    // Construtor de seis argumentos
    public BasePlusCommissionEmployee(CommissionEmployee employee, double baseSalary) {

        // Instanciando objeto CommissionEmployee
        empregadoPorComissao = employee;

        // Se baseSalary é inválido, lança exceção
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        setBaseSalary(baseSalary);
    }

    // define salario base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // Retorna salário base
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // Calcula Ganhos
    public double earnings() {
        return getBaseSalary() + empregadoPorComissao.earnings();
    }

    // retorna Representação de string de BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format(empregadoPorComissao.toString() + "\nbase salary " + getBaseSalary());
    }

    //Retorna todo firstName
    public String getFirstName() {
        return empregadoPorComissao.getFirstName();
    }

    //Retorna lastName
    public String getLastName() {
        return empregadoPorComissao.getLastName();
    }

    //Retorna socialSecurityNumber
    public String getSocialSecurityNumber() {
        return empregadoPorComissao.getSocialSecurityNumber();
    }

    //Retorna grossSales
    public double getGrossSales() {
        return empregadoPorComissao.getGrossSales();
    }

    //Retorna commissionRate
    public double getCommissionRate() {
        return empregadoPorComissao.getCommissionRate();
    }
} // BasePlusCommissionEmployee