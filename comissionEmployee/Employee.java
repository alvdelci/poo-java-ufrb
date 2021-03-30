package comissionEmployee;

public class Employee {
    // Variaveis de instancia
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Contrutor de 3 argumentos
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }// fim construtor

    // Metodo retorna firstName
    public String getFirstName() {
        return this.firstName;
    }

    // Metodo retorna lastName
    public String getLastName() {
        return this.lastName;
    }

    // Metodo retorna socialSecurityNumber
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    // Metodo define firstName
    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    // Metodo define lastName
    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    // Metodo define socialSecurityNumber
    public String setSocialSecurityNumber(String socialSecurityNumber) {
        return this.socialSecurityNumber = socialSecurityNumber;
    }
    @Override
    public String toString() {
        return String.format("Commission employee " + getFirstName() + " " +
                getLastName() + "\nSocial security number " + getSocialSecurityNumber());
    }

}