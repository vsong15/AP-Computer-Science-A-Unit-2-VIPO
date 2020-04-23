import java.util.*;
public class ScannerDemo {
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      int x, y;
      double d,b;
      System.out.println("Enter two whole numbers separated by one or more spaces:");
      x = kb.nextInt();
      y = kb.nextInt();
      System.out.println("You entered "+x+" and "+y);
      System.out.println("Next enter two numbers. Decimals are okay.");
      d = kb.nextDouble();
      b = kb.nextDouble();
      System.out.println("You entered "+d+" and "+b);
      System.out.println("Next enter two words:");
      String w = kb.next();
      String f = kb.next();
      System.out.println("You entered \""+w+"\" " + " and " + "\""+f+"\"");
      System.out.println("Next enter a line of text");
      String t = kb.next();
      System.out.println("You entered \""+t+"\" "); 
   }
}