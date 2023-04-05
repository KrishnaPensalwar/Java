import java.util.Scanner;

public class Employee extends Student
{
    private String address;

//    public void accept()
    public Employee(String name,int age,String address)
    {
        super(name,age);
        this.address = address;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the address:");
//        address = sc.next();


    }
    public void output()
    {
        System.out.print("Address is: "+address);
    }
}
