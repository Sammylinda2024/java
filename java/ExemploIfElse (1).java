//Exercico que verifica o nivel de conhecimento de programaçao com base nos anos de anosDeExperiencia
import java.util.Scanner;

public class ExemploIfElse{
    public static void main (String [] args){
       Scanner scanner = new Scanner (System.in); // cria um objeto scanner para leitura de entrada do usuario
        
        System.out.print("Digite quantos anos de experiencia voce possui :"); // solicita a entrada do usuario
        
        int anosDeExperiencia = scanner.nextInt(); // le o nº de experiencia 
        if(anosDeExperiencia <2) {
            System.out.println("voce é um desenvolvedor júnior!");
        } else if (anosDeExperiencia >=2 && anosDeExperiencia <5) {
            System.out.println("voce é um desenvolvimento pleno!");
        } else {
            System.out.println("voce é um desenvolvedor sênior!");
        }
    }
}