package cadastro.cad;

public class user {

    private String Nome;
    private int idade;
    private int cpf;
    private int senha;
    
    public String getNome() {return Nome;}
    public void setNome(String nome) {Nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public int getCpf() {return cpf;}
    public void setCpf(int cpf) {this.cpf = cpf;}
    
    private int getSenha() {return senha;}

    public user(){}

    public user(String nome, int idade, int cpf, int senha) {
        Nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        alterarSenha(senha);
    }

    public String toString(){
        return "Seu nome é: " + 
        Nome + " tem a idade de: " + 
        idade +  " e seu CPF é: " + cpf;
    }

    public void alterarSenha(int NovaSenha){
        senha = NovaSenha;
    }

    public void Mostrar_Senha(){
        System.out.println("Sua senha é: " + getSenha());
    }

}
