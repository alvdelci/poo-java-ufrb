package Polimorfismo;
//PieceWorker subclasse de Employee
public class PieceWorker extends Employee {
    //Variaveis de instancia
    private double wage;
    private int piece;

    //Construtor de 5 argumentos
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int piece) {
        super(firstName, lastName, socialSecurityNumber);

        //Tratamento de dados
        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        if (piece < 0) {
            throw new IllegalArgumentException("Piece must be >= 0");
        }

        //Setando as variaveis de instancia
        this.wage = wage;
        this.piece = piece;
        
    }// Fim construtor

    //O metodo abstrato da superclasse eh sobrescrito e passa a ser concreto da subclasse
    @Override
    public double earnings() {
        return this.wage * this.piece;
    }
    //Retorna valor pago por peca
    public double getWage() {
        return wage;
    }
    //Retorna quantidade de peças
    public int getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s:", super.toString(), "payment per piece: " + getWage() + "\nproduction: " + getPiece());
    }
    
} //Fim PieceWorker
