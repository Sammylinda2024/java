public class Comprovantepagamentos {
    public void geraComprovante(String tipo) {
       if (tipo == "folha") {
           System.out.println("Comprovante de Pagamento");
       } else if (tipo == " Recebiveis") {
           System.out.println("Comprovamente de Pagamento ");
       } else if (tipo == "transferencia") {
           System.out.println("Comprovante de transferência");
       }
   }
}
interface ComprovanteInterface {
   public String getComprovante();
}
class Transferencia implements ComprovanteInterface {
   @Override
   public String getComprovante() {
       return "Comprovante de transferência";
   }
}
 
class FolhaPagamento implements ComprovanteInterface {
   @Override
   public String getComprovante() {
       return "Comprovante de Pagamento ";
   }
}
class TesteComprovante {
   public static void main(String[] args) {
       ComprovanteInterface transferencia = new Transferencia();
       ComprovanteInterface folha = new FolhaPagamento();
       System.out.println(folha.getComprovante());
       System.out.println(transferencia.getComprovante());
   }
}