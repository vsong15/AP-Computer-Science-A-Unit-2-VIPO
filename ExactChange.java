import java.util.*;
public class ExactChange{
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      int total;
      System.out.println("This program will find the combination of coins that equals the amount of change you enter. Enter a number from 0 to 99.");
      total = kb.nextInt();
      int q = total/25;
      int d = total%25/10;
      int n = total%25%10/5;
      int p = total%25%10%5/1;
      System.out.println(total + " can be given as:");
      System.out.println(q + " quarter(s)");
      System.out.println(d + " dime(s)");
      System.out.println(n + " nickel(s)");
      System.out.println(p + " pennies"); 
   }
}