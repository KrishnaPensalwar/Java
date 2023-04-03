import java.util.Scanner;

public class Complex {


    private double real,img,real1,img1,real2,img2,real3,img3,real4,img4,real5,img5,real6,img6;

    public Complex()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number:");
        real1=sc.nextDouble();
        img1= sc.nextDouble();

        System.out.println("Enter the second number:");
        real2 =sc.nextDouble();
        img2 = sc.nextDouble();

    }

    public void add(){

        real3 = real1+real2;
        img3 = img1+img2;
    }

    public void adddisplay()
    {
        System.out.println("Addition of the two complex numbers is:" + real3 + "+" + img3 + "i");
    }

    public void sub()
    {

        real4 = real1 - real2;
        img4 =  img1 - img2;
    }

    public void subdisplay() {
        System.out.println("Subtraction of the two complex numbers is:" + real4+ "+" + img4 + "i");
    }

    public void mul()
    {

        real5 = (real1*real2)-(img1*img2);
        img5 = (real1*img2)+(real2*img1);
    }

    public void muldisplay() {
        System.out.println("Multiplication of the two complex numbers is:" + real5+ "+" + img5+ "i");
    }

    public void div()
    {

        real6 = ((real1*real2)+(img1*img2))/((real2*real2)+(img2*img2));
        img6 = ((img1*real2)-(real1*img2))/((real2*real2)+(img2*img2));
    }

    public void divdisplay()
    {
    System.out.println("Division of the two complex numbers is:"+real6+"+"+img6+"i");
    }

}
