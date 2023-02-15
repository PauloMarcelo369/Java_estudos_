import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.enums.color;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Shape> list = new ArrayList<>();

        System.out.print("Enter the number of Shapes: ");
        int Number = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= Number; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char Option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLUE, RED, BLACK): ");
            String Color = sc.next();

            if (Option == 'r'){
                System.out.print("Width: ");
                double Width = sc.nextDouble();
                System.out.print("Height: ");
                double Height = sc.nextDouble();
                list.add(new Rectangle(color.valueOf(Color), Width, Height));
            }
            else{
                System.out.print("Radius: ");
                double Radius = sc.nextDouble();
                list.add(new Circle(color.valueOf(Color), Radius));
            }
            System.out.println();
        }

        System.out.println("Shapes Area:");
        for (Shape sh : list){
            System.out.printf("%.2f\n", sh.Area());
        }
        sc.close();
    }

}