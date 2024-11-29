import java.util.ArrayList;
import java.util.Collection;

public class MetodoAdd {

    public static void main(String[]args)  {

        // Criaçao de uma coleçao de Strings

        Collection <String> nomes =  new ArrayList<>();  // Adicionando o tipo generico 
        nomes.add("Germano");
        nomes.add("Paulo");
        nomes.add("Daiana");
        nomes.add("Jeferson");
        nomes.add("Igor");

        // Imprimindo a lista de nomes 
        System.out.println("Lista de nomes: " + nomes);
    }
}