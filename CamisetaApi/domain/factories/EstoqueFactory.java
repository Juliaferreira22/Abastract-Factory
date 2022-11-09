package domain.factories;

import domain.Camiseta.Localidade;

public class EstoqueFactory implements AbstractFactory {
   
    public static AbstractFactory getFactory(domain.Estoque.Localidade localidade) {

        AbstractFactory factory;
        if (localidade.equals(domain.Estoque.Localidade.LojaA)){
            factory = new LojaAFactory();
        } else {
            factory = new LojaBFactory();
        }

        return factory; 
    }
    
}
