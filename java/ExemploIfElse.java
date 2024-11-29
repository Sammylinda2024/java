public class ExemploIfElse{
    public static void main (String [] args){
        int anosDeExperiencia = 5;
        if(anosDeExperiencia <2) {
            System.out.println("voce é um desenvolvedor júnior!");
        } else if (anosDeExperiencia >=2 && anosDeExperiencia <5) {
            System.out.println("voce é um desenvolvimento pleno!");
        } else {
            System.out.println("voce é um desenvolvedor sênior!");
        }
    }
}