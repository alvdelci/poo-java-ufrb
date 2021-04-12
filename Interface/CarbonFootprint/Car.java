package Interface.CarbonFootprint;

//Calculo da pegada de carbono para um carro a gasolina
public class Car implements CarbonFootprint {
    private double kilometros; // Kilometros percorridos
    private double taxaConsumo; // Taxa de consumo do veiculo

    //Construtor de dois argumentos
    public Car(double kilometros, double taxaConsumo) {
        this.kilometros = kilometros;
        this.taxaConsumo = taxaConsumo;
    }

    @Override
    public double getCarbonFootprint() {
        /**
         * Combustivel consumido x
         * porcentagem de gasolina pura no combustivel (dispensando o etanol) x
         * Fator de transformação de gasolina em CO2 x
         * Densidade da gasolina, respectivamente
         */
        //Resultado em Kg
        return (kilometros / taxaConsumo) * 0.82 * 3.7 * 0.75;
    }

    public double getKilometros() {
        return this.kilometros;
    }

    public double getTaxaConsumo() {
        return this.taxaConsumo;
    }

}
