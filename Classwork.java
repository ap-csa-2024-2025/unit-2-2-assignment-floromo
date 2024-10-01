import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);


    // ---------- Shopping ----------
    System.out.println("What type of item are you buying?");
    String item = sc.nextLine();
    System.out.println("How many are you buying?");
    int amt = sc.nextInt();
    System.out.println("How much does each one weigh?");
    double weight = sc.nextDouble();
    System.out.println(amt + " " + item + " at " + weight + " pounds each will weigh " + (amt*weight) + " pounds total");


    // ---------- Quote ----------
    System.out.println("\n\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");


    // ---------- Rabbit ----------
    System.out.println("\n(\\(\\\n( - -)\n((') (')");
  }

}
