package domain.factories;

import domain.Estoque;
import domain.Camiseta;
import domain.Camiseta.Cor;
import domain.LojaB;

public class LojaBFactory extends EstoqueFactory {
    
    private Estoque estoque;

    public LojaBFactory(){
        estoque = new LojaB();
    }

    @Override
    public Camiseta perdirCamiseta(Cor cor) {
        return estoque.pedirCamiseta(cor); 
    }
}
