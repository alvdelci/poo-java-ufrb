package Polimorfismo.NotasAlunos;

public class EstudanteTest {
    public static void main(String []args) {
        EstudanteMedio estudanteMedio = new EstudanteMedio("Jão", "Medio", "2012984843", 4.5, 8.4);
        EstudanteGraduacao estudanteGraduacao = new EstudanteGraduacao("Jão", "Graduate", "2012984843", 4.5, 8.4);
        EstudantePosGraduacao estudantePosGraduacao = new EstudantePosGraduacao("Jão", "Pos", "2012984843", 4.5, 8.4);


        Estudante estudante[] = new Estudante[3];

        estudante[0] = estudanteMedio;
        estudante[1] = estudanteGraduacao;
        estudante[2] = estudantePosGraduacao;

        int i = 0;
        for(Estudante currentEstudante : estudante) {
            System.out.printf("Estudante: %s %s \nMatricula: %s \nNível: %s \nMédia: %.2f\n\n", currentEstudante.getFirstName(), currentEstudante.getLastName(), currentEstudante.getMatricula(), estudante[i].getClass().getName().substring(25), currentEstudante.calculaMedia());
            i++;
        }
    }
}
