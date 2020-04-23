import java.util.*;
public class Lab2_2 {
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      double r, d, c, a, sa, v;
      System.out.println("Enter the radius of a sphere. (Decimal)");
      r = kb.nextDouble();
      d = 2*r;
      c = Math.PI*2*r;
      a = Math.PI*r*r;
      sa = 4*Math.PI*r*r;
      v = (4.0/3)*Math.PI*Math.pow(r,3);
      System.out.println("The diameter of the sphere is "+d);
      System.out.println("The circumference of the sphere is "+c); 
      System.out.println("The area of the sphere is "+a);
      System.out.println("The surface area of the sphere is "+sa);
      System.out.println("The volume of the sphere is "+v);
   }
}
