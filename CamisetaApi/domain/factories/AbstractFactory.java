package domain.factories;

import domain.Camiseta;
import domain.Camiseta.Cor;;




public interface AbstractFactory {

    public Camiseta pedirCamiseta(Cor cor);

    
}
