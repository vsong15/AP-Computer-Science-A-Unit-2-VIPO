import java.util.*;
public class ClassSchedule{
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      String p1, p2, p3, p4, p5, p6, p7, p8;
     
     
      System.out.println("Hello.");
      System.out.println("I will ask for your class schedule and display it all at once.");
   
   
      System.out.println("What is your 1st Period class?");
      p1 = kb.nextLine(); //Input
      System.out.println("What is your 2nd Period class?");
      p2 = kb.nextLine();
      System.out.println("What is your 3rd Period class?");
      p3 = kb.nextLine();
      System.out.println("What is your 4th Period class?");
      p4 = kb.nextLine();
      System.out.println("What is your 5th Period class?");
      p5 = kb.nextLine();
      System.out.println("What is your 6th Period class?");
      p6 = kb.nextLine();
      System.out.println("What is your 7th Period class?");
      p7 = kb.nextLine();
      System.out.println("What is your 8th Period class?");
      p8 = kb.nextLine();
      System.out.println("Your schedule is");
      System.out.println(p1);//Output
      System.out.println(p2);
      System.out.println(p3);
      System.out.println(p4);
      System.out.println(p5);
      System.out.println(p6);
      System.out.println(p7);
      System.out.println(p8);
    
     
   }
}