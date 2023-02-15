package ENUM.order;
import ENUM.order.enumerar.e;

public class ord {

    private e passo;
    private int number1;
    private int number2;
    
    public ord(e passo, int number1, int number2) {
        this.passo = passo;
        this.number1 = number1;
        this.number2 = number2;
    }

    public e getPasso() {
        return passo;
    }
    public void setPasso(e passo) {
        this.passo = passo;
    }
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String toString(){
        return "dados: " + passo + " " + number1 + " " + number2;
    }
}
