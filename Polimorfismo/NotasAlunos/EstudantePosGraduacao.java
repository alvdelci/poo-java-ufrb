package Polimorfismo.NotasAlunos;

public class EstudantePosGraduacao extends Estudante {
    public EstudantePosGraduacao(String firstName, String lastName, String matricula, double nota1, double nota2) {
        super(firstName, lastName, matricula, nota1, nota2);
    }


    @Override
    public double calculaMedia() {
        return ((super.getNota1() * 0.5) + (super.getNota2() * 0.5));
    } 
}
