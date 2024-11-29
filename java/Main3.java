//Classe abstrata Veículo
abstract class Veiculo {
    protected double cargaMaxima;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    //Método abstrato
    public abstract void transportar();

    //Método para obter a carga máxima
    public double getCargaMaxima() {
       return cargaMaxima;
    }
}

//Subclasse Caminhao
class Caminhao extends Veiculo {
     public Caminhao(double cargaMaxima) {
        super(cargaMaxima);
     }

     @Override 
     public void transportar() {
        System.out.println("Transportando carga com o caminhão. Carga máxima:" + cargaMaxima + " kg.");
     }
}

//Subclasse Van
class Van extends Veiculo{
    public Van(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga com a van. Carga máxima:" + cargaMaxima + " kg.");
    }
}
//Classe Principal 
public class Main3 {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao(10000); //10 toneladas
        Veiculo van = new Van(2000); //2 toneladas

        caminhao.transportar();
        van.transportar();
    }
}