package dias_da_semana;
import dias_da_semana.dias.checar;


public class ver_dias {
    public checar dia1;
    public checar dia2;
    public checar dia3;
    public checar dia4;
    public checar dia5;
    public checar dia6;
    public checar dia7;

    public ver_dias(checar dia1, checar dia2, checar dia3, checar dia4, checar dia5, checar dia6, checar dia7) {
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.dia3 = dia3;
        this.dia4 = dia4;
        this.dia5 = dia5;
        this.dia6 = dia6;
        this.dia7 = dia7;
    }

    public String toString(){
        return "dia 1: " + dia1
        +"\ndia 2: " + dia2
        + "\ndia 3: " + dia3
        +"\ndia 4: " + dia4 
        +"\ndia 5: " + dia5
        +"\ndia 6: " + dia6
        +"\ndia 7: " + dia7;
    }


    
}
