import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String>frutas = new ArrayList<>();
        frutas.add( "Maça");
        frutas.add( "Banana");
        frutas.add( "Laranja");
        frutas.add( "Banana"); // Duplicata permitida

        System.out.println("Frutas na lista"+ frutas);
        System.out.println("Primeira fruta"+ frutas.get(0)); // Acesso por indice
    }
}