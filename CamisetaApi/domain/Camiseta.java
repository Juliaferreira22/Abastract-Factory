import java.util.ArrayList;
import java.util.List;

public abstract class Camiseta {

    public static enum Cor {
        Amarelo,
        Vermelho,
        Azul,
        Verde
    }

String marca;
String tamanho;
String genero; 
List<String> tecidos = new ArrayList<String>();

public String getMarca(){
    return marca;
}

public void procurar(){
    System.out.println("Procurando " + marca)

}

public void separar(){
    System.out.println("Separando " + marca)

}

public void embalar(){
    System.out.println("Embalando " + marca)

}

public void enviar(){
    System.out.println("Enviando " + marca)

}

public String toString(){
    StringBuffer detalhes = new StringBuffer();
    detalhes.append("**************************************\n");
    detalhes.append("Camiseta solicitada saiu para entrega!\n");
    detalhes.append("**************************************\n");
    detalhes.append("Classe: " + this.getClass().getCanonicalName() +  "\n");
    detalhes.append(marca  + "\n");
    detalhes.append(tamanho + "\n");
    detalhes.append(genero + "\n");
    for (String tecido : tecidos) {
        detalhes.append(tecido + "\n");
    }
    return detalhes.toString();
}


}

