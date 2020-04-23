import java.util.*;
public class Temperature{
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      int f, c;
      System.out.println("Enter a temperature in Farenheit.");
      f = kb.nextInt();
      c = (f-32)*5/9;
      System.out.println("The temperature in Celcius is " +c+ ".");
   }
}