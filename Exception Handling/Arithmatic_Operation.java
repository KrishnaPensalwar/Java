import java.util.Scanner;
public class Arithmatic_Operation
{
    private int num1,num2,result;
    Scanner sc = new Scanner(System.in);

//    public void getadata()
    public Arithmatic_Operation()
    {
        System.out.print("Enter the first number.");
        num1 = sc.nextInt();

        System.out.print("Enter the second number.");
        num2 = sc.nextInt();
    }

    public void division()
    {
        try {
            result = num1 / num2;
            System.out.println("Result of the division is: " + result);
        }catch(ArithmeticException e) // Here order of exception classes should be maintained.
        {
            System.out.println("Arithmatic Exception is handled.");
//            e.printStackTrace();   This will give us the type of exception we get.
        }

    }


    public void input_mismatch()
    {
        try {
            System.out.println("Enter the number you want to be square.");
            int num =sc.nextInt();
            System.out.println("Square of the number is:"+num*num);
        }catch (Exception e)
        {
            System.out.println("Input Mismatch exception is handled.");
            e.printStackTrace();
        }
    }
}
