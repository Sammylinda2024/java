import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Dois_Collections {

    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");

         Collection<String> vogais2 = Arrays.asList("o","U");

         // Recebe todos os elementos da coleçao adicionando na coleçao vogais
         vogais.addAll(vogais2);

         System.out.println("Lista das vogais "+vogais);
    }
}