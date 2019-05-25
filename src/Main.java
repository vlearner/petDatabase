import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int userInput = ' ';
        Scanner s = new Scanner(System.in);
        System.out.println("Pet Database Program.");
        System.out.println();


        while (true){
            System.out.println("What would you like to do?");
            System.out.println("1. View all pets");
            System.out.println("2. Add new pets");
            System.out.println("3. Remove a pet");
            System.out.println("4. Exit program");
            System.out.print("Your choice: ");
            userInput = s.nextInt();


            if (userInput == 1) {
                petList();
            }
            else if (userInput == 2){
                while (true){
                System.out.print("Type exit to go main menu\n");
                System.out.print("add pet (name, age):");
                String petInfo = s.next();


                if ( petInfo.equals("Exit") | petInfo.equals("exit")){ break;}

                }
            }
            else if (userInput == 3){
                System.out.println("\n3 do something\n");
            }
            else {
                exitProgram();
            }

        }//end while (true)



    }//end main

    private static void petList(){
        System.out.println("ID  Name  Age");

    }//end petList

    private static void exitProgram(){
        System.out.println("Done");
        System.exit(0);
    }//end exitProgram

}//end class Main
