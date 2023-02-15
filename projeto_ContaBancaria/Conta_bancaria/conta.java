package projeto_ContaBancaria.Conta_bancaria;

public class conta {
    private String nome;
    private int N_conta;
    private double dinheiro;

    //gets
    public String getNome(){return this.nome;}
    public int getNconta(){return this.N_conta;}
    public double getDinheiro(){return this.dinheiro;}

    /*sets, Nota: apenas um Set, pois não posso alterar o 
    valor do meu saldo livremente, além de não poder mudar o numero da conta.
    */
    public void setNome(String nome){
        this.nome = nome;
        SituaçãoCadastral();
        }
    
    /*sobrecarga de metodos usando dois construtores, um para caso o usuario 
    não tenha dinheiro para colocar na conta e outro para caso ele tenha.
    */
    public conta(String nome, int N_conta){
        this.nome = nome;
        this.N_conta = N_conta;
    }
    public conta(String nome, int N_conta, double dinheiro){
        this.nome = nome;
        this.N_conta = N_conta;
        adicionar_ao_saldo(dinheiro);
    }
    //metodos de alteração de saldo:

    //adiciona grana ao saldo
    public void adicionar_ao_saldo(double dinheiro){
        this.dinheiro+=dinheiro;
        SituaçãoCadastral();
    }
    //remove dinheiro da conta + a taxa do banco
    public void SacarGrana(double dinheiro){
        this.dinheiro = this.dinheiro - dinheiro - 5.00;
        SituaçãoCadastral();
    }
    //mostra o cadastro na tela: 
    public void SituaçãoCadastral(){
        System.out.println("Nome: " + getNome());
        System.out.println("N da conta: " + getNconta());
        System.out.printf("Saldo total: %.2f", getDinheiro());
    }
}
