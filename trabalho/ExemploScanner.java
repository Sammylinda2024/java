import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // 1. Criar uma instância do Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Ler uma linha de texto (String)
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // 3. Ler um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // 4. Ler um número de ponto flutuante
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        // 5. Exibir os dados inseridos
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);

        // 6. Fechar o Scanner para liberar recursos
        scanner.close();
    }
}