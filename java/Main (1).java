public class CaminhaoEncapsulamento {
    private String modelo;
    private double capacidadedeCarga;
    
    // Construtor 
    public CaminhaoEncapsulamento(String modelo, double capacidadeCarga){
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    // Metodos publicos para acesar os dados 
    public String getModelo() {
        return modelo;
    } 

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setCapacidadeCarga(double capacidadecarga) {
        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException( "A capacidade de carga nao pode ser negativa.");
        }
        this.capaciddeCarga = capacidadeCarga; 
        
    }
    // Metodo principal
    
    public static void main(String [] args) {
        // Criando um objeto cCaminhao
        CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulameto(modelo: "volvo FH",capacidade:25.5);
        
        //Exibindo os dados do CaminhaoEncapsulameto
        System.out.println(" Modelo: " + caminhao.getmodelo());
        System.out.println("Capacidade de carga:" + caminhao.getCapacidadeCarga() + "toneladas");
        
        // Atualizando os dados do caminhao
        Caminhao.setModelo(modelo:"Scania R450");
        caminhao.set.CaopacidadeCarga(capacidadeCarga:30.0);
        
        // Exibindo ps dados atualizados 
        System.out.println("Modelo atualizado: "+ caminhao.getModelo());
        System.out.printn("Capacidade de caraga atualizada:" + caminhao.getCapacidadeCaraga() + "toneladas");
    }}
        
        
    