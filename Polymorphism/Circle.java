import java.util.Scanner;

public class Circle extends Shape {
    private double x;

    @Override
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x.");
        x=sc.nextDouble();
    }


    public void compute_area() {
        double area = Math.PI*x*x;
        System.out.println("Area of circle is: "+area);
    }

}
