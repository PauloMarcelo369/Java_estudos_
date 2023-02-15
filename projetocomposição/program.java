import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.OrderItem;
import entities.client;
import entities.product;
import entities.order;
import entities.enums.OrderStatus;


public class program{
    public static void main(String[] args){
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String Name = sc.nextLine();
        System.out.print("Email: ");
        String Email = sc.next();
        System.out.print("Birth Day (DD/MM/YY): ");
        String Date = sc.next();
        client C1 = new client(Name, Email, LocalDate.parse(Date, fmt1));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String Status = sc.next();

        order CLIENT = new order(LocalDateTime.now(), OrderStatus.valueOf(Status), C1);

        System.out.print("How many itens to this order? ");
        int number = sc.nextInt();


        for (int i = 1; i <= number; i++){
            sc.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product Name: ");
            String Productname = sc.nextLine();
            System.out.print("Price: ");
            Double Price = sc.nextDouble();
            System.out.print("Quantity: ");
            int Quantity = sc.nextInt();

            CLIENT.AddOrderItem(new OrderItem(Quantity, new product(Productname, Price)));
        }
        System.out.println();
        System.out.println("ORDER SUMARY: ");
        System.out.println(CLIENT);

        sc.close();
    }
}