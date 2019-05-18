import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int userInput = ' ';
        Scanner s = new Scanner(System.in);
        System.out.println("Pet Database Program.");
        System.out.println();


        do {
            System.out.println("What would you like to do?");
            System.out.println("View all pets");
            System.out.println("Add more pets");
            System.out.println("Update an existing pet");
            System.out.println("Remove an existing pet");
            System.out.println("Search pets by name");
            System.out.println("Search pets by age");
            System.out.println("Exit program");
            System.out.print("Your choice: ");
            userInput = s.nextInt();


            if (userInput == 1) {
                System.out.println("1");
            }

        }while(userInput != 7);

          if(userInput == 7) {
              System.out.println("Done");

              System.exit(0);
          }



//        Scanner petName = new Scanner(System.in);
//        System.out.println("Enter Pet Name: ");
//        String name = petName.next();
//        System.out.println(name);

//        petName.close();


    }
}
