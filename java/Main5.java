//Classe Motor
class Motor {
    private int potencia;
    private String tipo;  
    
    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;        
    }

    public void ligar() {
        System.out.println("Motor " + " ligado com potência de " + potencia + " CV.");
    }

    public void desligar() {
        System.out.println("Motor " + tipo + " desligado.");
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }
}

//Classe Carro
class Carro {
     private String modelo;
     private String cor;
     private Motor motor;

     public Carro(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
     }
    
     public void acelerar() {
        motor.ligar();
        System.out.println("O carro " + cor + " " + modelo + " está acelerando com potência de " + motor.getPotencia() + " CV.");
     }

     public void frear() {
        System.out.println("O carro " + cor + " " + modelo + " está freando.");
        motor.desligar();       
    }
}

//Classe principal
public class Main5 {
    public static void main(String[] args) {
        Motor motor = new Motor(150, "Gasolina");
        Carro carro = new Carro("Fusca", "Azul", motor);

        carro.acelerar();
        carro.frear();

    }
}