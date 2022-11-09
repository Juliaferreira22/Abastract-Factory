package domain;

public abstract class Estoque {

    public static enum Localidade {
        LojaA,
        LojaB
    }

    abstract Camiseta organizarEnvio(Camiseta.Cor cor);

    public Camiseta pedirCamiseta(Camiseta.Cor cor){
        Camiseta camiseta = organizarEnvio(cor);
        System.out.println("Separando" +camiseta.getMarca() + "");
        camiseta.procurar();
        camiseta.separar();
        camiseta.embalar();
        camiseta.enviar();
        return camiseta; 
        
    }
    
}
