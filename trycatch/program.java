import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.InvalidWithDrawn;

import java.util.InputMismatchException;

public class program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("With drawn limit: ");
            double limit = sc.nextDouble();

            Account ac = new Account(number, name, balance, limit);
            System.out.print("Enter amount withdrawn: ");
            ac.withDrawn(sc.nextDouble());
            System.out.printf("%.2f", ac.getBalance());
        }

        catch (InvalidWithDrawn ERROR){
            System.out.print("WithDrawn error: " + ERROR.getMessage());
        }
        catch(InputMismatchException ERROR){
            System.out.println("Invalid date!");    
        }

        

    }
}