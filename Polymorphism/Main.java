
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter your choice");

        do {
            System.out.println("1.Area of circle.");
            System.out.println("2.Area of triangle.");
            System.out.println("3.Area of rectangle.");
            System.out.println("4.Exit.");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    Circle obj = new Circle();
                    obj.getdata();
                    obj.compute_area();
                    break;

                case 2:
                     Triangle obj1 = new Triangle();
                    obj1.getdata();
                    obj1.compute_area();
                    break;

                case 3:
                     Rectangle obj2 = new Rectangle();
                    obj2.getdata();
                    obj2.compute_area();
                    break;

                case 4:
                    break;
            }
        }while(ch!=4);


    }
}