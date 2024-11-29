//Exercico sobre arrays/ coleções.
//Exercícios percorrendo array de inteiros

public class ExemploForEach{
    public static void main(String[] args){
        int[]numeros = {1,2,3,4, 5}; // vetor inteiro "numeros"
        for (int numero : numeros){
        // lado esquerdo: lado direito 
        /*lado esquerdo: declara a variavel para o aramazenamento temporario do valor do elemento durante a repetição
        lado direito : é o array/coleção que estamos percorrendo*/
           System.out.println(numero);
        }
    }
}