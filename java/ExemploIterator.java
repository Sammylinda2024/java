import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterator {

    public static void main(String[] args){
        ArrayList<String>frutas = new ArrayList<>();
        frutas.add("Maçâ");
        frutas.add("Banana");

        Iterator<String> interator = frutas.iterator();

        while (interator.hasNext()) {

            String fruta = interator.next();
            System.out.println(fruta);
            
        }
    }
}
