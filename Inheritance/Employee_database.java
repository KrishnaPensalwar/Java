import java.util.Scanner;

public class Employee_database
{
    public static void main(String[] args)
    {
        int age;
        String name,address;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:");
        age = sc.nextInt();

        System.out.print("Enter name:");
        name = sc.next();

        System.out.print("Enter address:");
        address = sc.next();

        Employee e = new Employee(name,age,address);

//        e.getdata();
//        e.accept();
        e.display();
        e.output();
    }
}
