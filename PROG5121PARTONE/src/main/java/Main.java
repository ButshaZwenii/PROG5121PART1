 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("WELCOME TO CHATAPP");
            // ask for the registration info
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();
            System.out.print("Enter a username: ");
            String username = input.nextLine();
            System.out.print("Enter a password: ");
            String password = input.nextLine();
            System.out.print(
                    "Enter your South African cell phone number (+27...): "
            );          String cellPhoneNumber = input.nextLine();
            Login login = new Login(
                    firstName,
                    lastName,
                    username,
                    password,
                    cellPhoneNumber
            );          // Execute registration and store the outcome message.
            String registrationMessage = login.registerUser();
            // Output the registration result to the console.
            System.out.println();
            System.out.println(registrationMessage);
            // Stop execution if registration failed to prevent login attempts.
            if (!login.isRegistered()) {
                System.out.println();
                System.out.println("Registration was not completed.");
                input.close();
                return;
            }           // Proceed to login only after successful registration.
            System.out.println();
            System.out.println("---- LOGIN ----");
            // Prompt for login credentials to verify against stored data.
            System.out.print("Enter your username : ");
            String loginUsername = input.nextLine();
            System.out.print("Enter your password to : ");
            String loginPassword = input.nextLine();
            // Record the user's login attempt in the Login object.
            login.setEnteredUsername(loginUsername);
            login.setEnteredPassword(loginPassword);
            // Validate credentials against stored registration data.
// loginUser() returns true if the username and password match.
login.loginUser();
// Retrieve and display the final login status message.
String loginMessage = login.returnLoginStatus();
System.out.println();
System.out.println(loginMessage);
// Close the Scanner to release system resources.
        }
     
    }
}



