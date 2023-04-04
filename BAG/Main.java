import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bag[] obj = new Bag[10];
        int n;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("================ MENU ===============");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4.Exit");

            n = sc.nextInt();
            switch (n) {
                case 1:
                    int a;
                    System.out.println("Enter the choice:");
                    System.out.println(" 1.Both default");
                    System.out.println("2.Both user");
                    System.out.println("3.Weight default");
                    System.out.println("4.Colour default");
                    a = sc.nextInt();
                    switch (a) {
                        case 1: {
                            obj[Bag.tot_obj()] = new Bag();
                            break;
                        }
                        case 2:
                            double weight;
                            String colour;
                            System.out.println("Enter colour:");
                            colour = sc.next();
                            System.out.println("Enter weight:");
                            weight = sc.nextDouble();
                            obj[Bag.tot_obj()] = new Bag(colour,weight);
                            break;

                        case 3:
//                            String colour;
                            System.out.println("Enter colour:");
                            colour = sc.next();
                            obj[Bag.tot_obj()] = new Bag(colour);
                            break;

                        case 4:
//                            double weight;
                            System.out.println("Enter weight:");
                            weight = sc.nextDouble();
                            obj[Bag.tot_obj()] = new Bag(weight);
                            break;

                    }
                    break;
                case 2:
                    for (int k = 0; k < Bag.tot_obj(); k++) {

                        obj[k].display();
                    }
                    System.out.println("Total weight is="+Bag.tot_wt());
                    System.out.println("Nuber of objects is="+Bag.tot_obj());
                    break;

                case 3:
                    int index,i;
                    System.out.println("Index:");
                    index = sc.nextInt();
                    obj[index-1].delete();
                    for (i = index-1; i <Bag.tot_obj() ; i++) {
                        if(index +1<Bag.tot_obj()){
                            obj[i]=obj[i+1];
                        }

                        obj[obj.length-1]= null;
                    }
                case 4:
                    break;
            }
        } while (n!=4);



    }
}