import java.util.*;
public class MyInfo{
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      String name, address, phoneNumber;
      System.out.println("Enter your name.");
      name=kb.nextLine(); //Input
      System.out.println("Enter your address");
      address = kb.nextLine();
      System.out.println("Enter your phone number");
      phoneNumber = kb.nextLine();
      System.out.println(name);//Output
      System.out.println(address);
      System.out.println(phoneNumber);
   }
}