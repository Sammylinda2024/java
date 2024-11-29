// Faça um programa para calcular o estoque médio de uma peça, sendo que: 
// ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua quantidade mínima: ");
        int quantidadeMinima = scanner.nextInt();
        
        System.out.println("Digite sua quantidade máxima: ");
        int quantidadeMaxima = scanner.nextInt();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("Seu estoque médio é: " + estoqueMedio);

        scanner.close();
    }
}