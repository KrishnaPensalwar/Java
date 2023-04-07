import java.util.Scanner;

public class Shape
{
    protected double x,y;

    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x.");
        x=sc.nextDouble();
        System.out.println("Enter the value of y.");
        y = sc.nextDouble();
    }




}
