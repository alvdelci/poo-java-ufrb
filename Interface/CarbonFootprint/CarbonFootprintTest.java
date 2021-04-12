package Interface.CarbonFootprint;

public class CarbonFootprintTest {
    
    public static void main(String [] args) {
        Car carro = new Car(20, 10);

        System.out.println("\nPegada de Carbono (Carro a gasolina): " + carro.getCarbonFootprint() + " Kg CO2");
    }
}
