package domain.factories;

import domain.Camiseta;
import domain.Camiseta.Cor;
import domain.Estoque;
import domain.LojaA;

public class LojaAFactory extends EstoqueFactory {

    private Estoque estoque;

    public LojaAFactory(){
        estoque = new LojaA();
    }

    @Override
    public Camiseta perdirCamiseta(Cor cor) {
        return estoque.pedirCamiseta(cor); 
    }


    
}
