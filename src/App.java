import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        System.out.println("");
        System.out.println("");
       System.out.println("--------------------------------------------Hello in RAYANE FOOD APPLICATOIN WITH JAVA--------------------------------------------");
       System.out.print("-->First, what's Your Name please ? -");
       Scanner scan = new Scanner(System.in);
       String name = scan.next();
        System.out.println(" ");
       
         System.out.println("--->Welcom again '"+name+ "' Please Create Your Own Password...");
       // do {
         System.out.print("PASSWORD : ");
         
         String passw = scan.next();
          System.out.println("");

        //   System.out.println("Please Confirm Your password again :");
         //   System.out.print("Confirm Password :");
          //  String cpassw = scan.next();
      //  }while (!passw.equals(cpassw));        //this methode is working...

    System.out.println("So ,Your password is : "+passw);
    System.out.println("Please enter you password :");
    String answ = scan.next();

    while (!passw.equals(answ)) {
        System.out.println("The Password is wrong ,Please Try again :");
        System.out.print("PASSWORD : ");
        answ = scan.next();
    }

    System.out.println("---->Password successfully<----");

    System.out.print("---> ARE YOU HUNGRY ? [YES / NO ] :");
    String answh = scan.next();

    if (answh.equals("yes") || (answh.equals("YES"))){

        System.out.println("-------<>Good ,Choose Something you want to eat :");
        System.out.print("--_PIZZA_-- , --_SANDWITCH_-- , --_BURGER_-- , --_FISH_-- : ");
        String food =scan.next();
        while (!food.equals("PIZZA") && !food.equals("SANDWITCH") &&  !food.equals("BURGER") && !food.equals("FISH")) {
            System.out.println("Sorry, we don't prapare this food today ,Please Choose another food :");
            System.out.println("Between only : PIZZA ,SANDWITCH ,BURGER ,FISH :");
            food = scan.next();
        }
         if (food.equals("PIZZA") || food.equals("SANDWITCH") || food.equals("BURGER")  || food.equals("FISH")){
           System.out.println("Do you Want something to drink with "+food+" ,[YES / NO ]");
           String drin = scan.next();
           while (!drin.equals("YES") && !drin.equals("yes") && !drin.equals("no") && !drin.equals("NO")) {
              System.out.print("Wrong Command ,Please Try again :");
              drin = scan.next();
           }

           if (drin.equals("yes") || drin.equals("YES")){
              System.out.println("Do you wanna drink -<cocacola>- or -<juice>- ?");
              String drinkchoose = scan.next();
                while (!drinkchoose.equals("cocacola") && !drinkchoose.equals("juice")){
                    System.out.println("Sorry , we don't hava it ,what would you like between cocacola and juice ? :");
                     drinkchoose = scan.next();
                }
                 
                
                System.out.println("GREAT , you have ordered "+food+ " and " +drinkchoose+".");
            
                System.out.print("Please confirm the password to complet the ordered :");
                String ordrepass = scan.next();
                while (!answ.equals(ordrepass)){
                    System.out.print("The Password is wrong ,Please Try again :");
                    ordrepass = scan.next();
                }
                System.out.println("");
                 System.out.println("------->Thank you your order is on it's way ");

            }else {
                System.out.println("GREAT , you have ordered "+food);

                System.out.println("Please confirm the password to complet the ordered :");
                String ordrepass = scan.next();
                while (!answ.equals(ordrepass)){
                    System.out.println("The Password is wrong ,Please Try again :");
                    ordrepass = scan.next();
                }
                 System.out.println("--------->Thank you your order is on it's way.");

            }
        
          }

          System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }else {
        System.out.println("-----------Well ,have a good day-----------");
   
    }
  }
}
