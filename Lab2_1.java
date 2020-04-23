import java.util.*;
public class Lab2_1 {
   public static void main (String[]args){
   Scanner kb = new Scanner (System.in);
   System.out.println("Enter the length of the edge of a cube (integer).");
   int x = kb.nextInt();
   int y;
   y = 6*x*x;
   System.out.println("The surface area of the cube is " +y+ ".");
   }
}