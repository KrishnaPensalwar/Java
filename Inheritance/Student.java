import java.util.Scanner;

public class Student
{
    private String name;
    private int age;

//    public void getdata()
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the name:");
//        name = sc.next();
//        System.out.print("Enter the age: ");
//        age = sc.nextInt();
    }
    public void display()
    {
        System.out.print("Name is: "+name+"\nAge is: "+age+"\n");
    }
}
