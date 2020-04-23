import java.util.*;
public class VipoEx{
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      int age, ageTimes2; //Variables
      String name;
      System.out.println("Enter your age.(int)");
      age=kb.nextInt(); //Input
      System.out.println("Enter your first name only!");
      name = kb.next();
      ageTimes2=age*2; //Process
      System.out.println("Your name is "+name+ 
         " and your age doubled is " +ageTimes2+ ".");//Output
   }
}