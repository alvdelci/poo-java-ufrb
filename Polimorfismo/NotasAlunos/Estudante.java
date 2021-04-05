package Polimorfismo.NotasAlunos;

public abstract class Estudante {
    private String firstName;
    private String lastName;
    private String matricula;
    private double nota1;
    private double nota2;

    public Estudante(String firstName, String lastName, String matricula, double nota1, double nota2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public abstract double calculaMedia();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

}
