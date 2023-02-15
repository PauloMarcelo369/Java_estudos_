package student;

public class estudante {
    public String Nome;
    public double nota1;
    public double nota3;
    public double nota2;

    private  double media(){
        return (nota1 + nota2 + nota3);
    }

    private String sub(){
        return "faltaram: " + String.format("%.2f", 60.00 - media()) + " pontos";
    }

    private String MediatoString(){
        return String.format("%.2f", media());
    }

    private String retornar(){
        if (media() >= 60.00)
            return Nome + "\n" + "Nota final = " + MediatoString() + "/n" + "PASSOU";

        // else
        return Nome + "\n" + "Nota final = " + MediatoString() + "\n" + "REPROVOU" + "\n" + sub(); 
    }

    public void Boletim(){

        System.out.println(retornar());

    }
    
}
