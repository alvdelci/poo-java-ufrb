package Interface.CarbonFootprint;


/**
 * Nao encontrei informacoes que pudesse usar para calcular
 * a pegada de carbono para construcoes
 */

public class Building implements CarbonFootprint {

    public Building() {

    }


    @Override
    public double getCarbonFootprint() {
        
        return 0;
    }
    
}