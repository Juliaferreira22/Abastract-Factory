package domain;

public class LojaB {

    Camiseta organizarEnvio(Camiseta.Cor cor) {
        if(cor.equals(Camiseta.Cor.Amarelo)) {
            return new CamisetaAmarela(); 
         } else if (cor.equals(Camiseta.Cor.Azul)) {
            return new CamisetaAzul();
         } else if (cor.equals(Camiseta.Cor.Verde)){
            return new CamisetaAzul();
         } else if (cor.equals(Camiseta.Cor.Vermelho)){
            return new CamisetaVermelha();
         } else return null; 

        }
    
}
