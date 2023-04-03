import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double real,img;





            int n;


        Complex obj = new Complex();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner sc = new Scanner(System.in);
        do {


               System.out.println("Enter the operation no. you want to do:");
               n = sc.nextInt();

               switch (n) {
                   case 1: {
                       obj.add();
                       obj.adddisplay();
                       break;
                   }
                   case 2:
                       obj.sub();
                       obj.subdisplay();
                       break;
                   case 3:
                       obj.mul();
                       obj.muldisplay();
                       break;
                   case 4:
                       obj.div();
                       obj.divdisplay();
                       break;
                   default:
                       System.out.println("Enter Valid Input!!!");

               }
           }while(n!=0);
        }
    }

//   *********OUTPUT********
//  Enter the first complex number:
//          1
//          2
//          Enter the second complex number:
//          3
//          4
//          1.Addition
//          2.Subtraction
//          3.Multiplication
//          4.Division
//          Enter the operation no. you want to do:
//          1
//          Addition of the two complex numbers is:4.0+6.0i
//          Enter the operation no. you want to do:
//          2
//          Subtraction of the two complex numbers is:-2.0+-2.0i
//          Enter the operation no. you want to do:
//          3
//          Multiplication of the two complex numbers is:-5.0+10.0i
//          Enter the operation no. you want to do:
//          4
//          Division of the two complex numbers is:0.44+0.08i
//          Enter the operation no. you want to do:
//          5
//          Enter Valid Input!!!
//
//
//
//
//
//

//
//public class Main {
//    public static void main(String[] args)
//    {
//        Complex obj1 = new Complex();
//        Complex obj2 =new Complex();
//        Complex obj3 = new Complex();
//        obj3.add(obj1,obj2);
//        obj3.adddisplay();
//
//    }
//}
