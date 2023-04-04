import java.util.Scanner;

public class Bag {
    private double weight;
    private String colour;
    private static double total_weight;
    private static int total_obj;

    public Bag()
    {
        colour = "Red";
        weight = 10.5;
        total_obj = total_obj + 1;
        total_weight = total_weight + weight;
    }
    public Bag(String colour)
    {
        this.colour = colour;
        weight = 10.5;
        total_obj = total_obj + 1;
        total_weight = total_weight + weight;
    }
    public Bag(double weight)
    {
        this.weight = weight;
        colour = "Red";
        total_obj = total_obj + 1;
        total_weight = total_weight + weight;
    }
    public Bag(String colour,double weight)
    {
        this.colour = colour;
        this.weight = weight;
        total_obj = total_obj + 1;
        total_weight = total_weight + weight;
    }
    public static double tot_wt()
    {
        return total_weight;
    }
    public static int tot_obj()
    {
        return total_obj;
    }
    public void display()
    {
        System.out.println("Colour is:"+colour+"\t\t\t\tWeight is:"+weight);
    }
    public double delete()
    {
        System.out.println("");
        total_weight = total_weight -weight;
        return total_weight;
    }
}
