package Polimorfismo.NotasAlunos;

public class EstudanteMedio extends Estudante {
    
    public EstudanteMedio(String firstName, String lastName, String matricula, double nota1, double nota2) {
        super(firstName, lastName, matricula, nota1, nota2);
    }


    @Override
    public double calculaMedia() {
        return ((super.getNota1() * 0.3) + (super.getNota2() * 0.7));
    } 
}
