import java.util.Locale;
import java.util.Scanner;
import student.idade;

import student.estudante;

public class rain {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner escanear = new Scanner(System.in);
        estudante Aluno = new estudante();

        System.out.println("informe o nome do aluno: ");
        Aluno.Nome = escanear.nextLine();

        System.out.println("informe a primeira nota: ");
        Aluno.nota1 = escanear.nextDouble();

        System.out.println("informe a segunda nota: ");
        Aluno.nota2 = escanear.nextDouble();

        System.out.println("informe a terceira nota: ");
        Aluno.nota3 = escanear.nextDouble();

        System.out.println("\n");

        System.out.println(idade.inserir_idade(10));

        Aluno.Boletim();

        escanear.close();
    }
}
