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
            System.out.println("1. View all pets");
            System.out.println("2. Add more pets");
            System.out.println("3. Update an existing pet");
            System.out.println("4. Remove an existing pet");
            System.out.println("5. Search pets by name");
            System.out.println("6. Search pets by age");
            System.out.println("7. Exit program");
            System.out.print("Your choice: ");
            userInput = s.nextInt();


            if (userInput == 1) {
                System.out.println("1");
            }
            if(userInput == 2){
                while (true){

                System.out.print("\nadd pet (name, age):");
                String petInfo = s.next();
                System.out.print("Type exit to go main menu");
                if ( petInfo.equals("Exit") | petInfo.equals("exit")){ break;}

                }
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
