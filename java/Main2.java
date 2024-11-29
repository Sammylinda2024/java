//Superclasse Carro 
class Carro {
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

// Subclasse Fusca 
class Fusca extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O fusca acelera lentamene: vruum!");
    }
}

//Subclasse Gol 
class Gol extends Carro {
    @Override public void acelerar() {
        System.out.println("o gol acelera com potencia: vruuuuum!");
    }
}

// Superclasse Jetta
class Jetta extends Carro {
    @Override
    public void acelerar () {
        System.out.println("O jetta acelera rapidamente: vruuuuuuuuum!");
    }
}

// Classe Principal para Testar o Polimorfismo
public class Main2 {
    public static void main(String [] args) {
        // criando um array de carros 
        Carro[] carros = new Carro [3];
        carros[0] = new Fusca ();
        carros[1] = new Gol ();
        carros[2] = new Jetta();

        // Chamando o metodo acaelarar () para cada carro
        for (Carro carro : carros){
            carro.acelerar(); // Polimorfismo em açao
        }
    }
}

