package estoque;
import java.util.Scanner;

public class product {

    private String produto;
    private double preco;
    private int quantidade;
    
    //gets e sets que retornam e inserem valores respectivamente
    public String getProduto() {return produto;}

    public void setProduto(String produto) {this.produto = produto;}

    public double getPreco() {return preco;}

    public void setPreco(double preco) {this.preco = preco;}

    public int getQuantidade() {return quantidade;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    //construtor default
    public product(){}

    //construtor
    public product(String produto, double preco, int quantidade){
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //sobrecarga de metodos usando um segundo construtor
    public product(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public void InformaçõesDoProduto(){
        System.out.println(produto + ": custa -> " + preco + " a unidade e possui " 
        + quantidade + " em estoque, o valor absoluto é de:" + (double)quantidade * preco);
    }

    public void inserir(){
        System.out.println("insira a quantidade de produtos a serem adicionados ao estoque: ");
        Scanner escanear = new Scanner(System.in);

        int adicionar = escanear.nextInt();
        escanear.close();
        quantidade = quantidade + adicionar;
        InformaçõesDoProduto();
    }

    public void remover(){
        System.out.println("insira a quantidade de produtos a serem removidos do estoque: ");
        Scanner escanear = new Scanner(System.in);
        int subtrair = escanear.nextInt();
        quantidade -= subtrair;
        InformaçõesDoProduto();
        escanear.close();
    }

    
}
