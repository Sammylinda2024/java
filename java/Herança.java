import java.util.Date;

// Superclasse
class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;
    
    public Pessoa(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        
    }
}

// Subclasse Aluno 
class Aluno extends Pesspa {
    public String matricula;
    
    public Aluno(String nome, String cpf ,  date dataNascimento, String matricula) {
        super(nome, cpf,dataNascimento); // chama o construtor da superclasse
        this.matricula = matricula;
        
    }
}

public void exibirInformaçoes() {
    System.out.println("nome: + nome");
    System.out.println("CPF: " + CPF)
}