import java.util.*;
public class Factorial {
   public static void main (String[]args) {
      Scanner kb = new Scanner (System.in);
      System.out.println("Pick a positive integer from 1 to 10");
      int user = kb.nextInt();
      int answer = 1;
      for (int i=1; i<=user; i++) {
         answer *= i; 
      }
      System.out.println(user+"! is "+answer);
   }
}