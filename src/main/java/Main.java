import console.*;
import users.UserWarehouse;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Console console = new Console();
        UserWarehouse users = new UserWarehouse();
        Scanner keyboard = new Scanner(System.in);

        console.startApplication();

        int numericInput = keyboard.nextInt();
        String stringInput;

        if(numericInput == 1) {
            console.logIn();
            stringInput = keyboard.nextLine();


        }
        else if (numericInput == 2) {
            console.newUser();
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }



    }
}
