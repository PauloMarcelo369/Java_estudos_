package hotel.cadastro;

public class cad {
    private String nome; 
    private String email;
    private int quarto;

    public cad(){}

    public cad(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getQuarto() {
        return quarto;
    }
    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String toString(){
        return "Nome: " + nome + "\nEmail: " + email;
    } 
}
