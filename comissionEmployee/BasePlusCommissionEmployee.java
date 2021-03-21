package comissionEmployee;
// Fig. 9.11: BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee {
    private double baseSalary; // salario base por semana

    // variáveis de CommissionEmployee
    private CommissionEmployee empregadoPorComissao;

    // Construtor de seis argumentos
    public BasePlusCommissionEmployee(CommissionEmployee employee, double baseSalary) {

        // Instanciando objeto CommissionEmployee
        empregadoPorComissao = employee;

        // Se baseSalary é inválido, lança exceção
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // define salario base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // Retorna salário base
    public double getBaseSalary() {
        return baseSalary;
    }

    // Calcula Ganhos
    public double earnings() {
        return getBaseSalary() + empregadoPorComissao.earnings();
    }

    // retorna Representação de string de BasePlusCommissionEmployee
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", empregadoPorComissao.toString(), "base salary",
                getBaseSalary());
    }

    // Retorna todo o objeto CommissionEmployee
    public CommissionEmployee getEmployee() {
        return empregadoPorComissao;
    }
} // BasePlusCommissionEmployee