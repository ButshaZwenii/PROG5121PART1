/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        // ask for the registration info
        
        System.out.print("Enter Username:");
        String userName = input.nextLine();
        
        System.out.print ("Enter Password:");
        String password = input.nextLine();
        
        System.out.print("Enter Cell Number:");
        String cellNumber = input.nextLine();
        
        System.out.print("Enter First Name:");
        String firstName = input.nextLine();
        
        System.out.print("Enter last name:");
        String lastName = input.nextLine();
        
        // Create a log in Object using entered info
        Login login = new Login(userName, password, cellNumber, firstName, 
                lastName);
        
        //Call registerUser() and display the returned messege
        System.out.println(login.registerUser());
        
        //ask log in details
        System.out.print("\nEnter username to login");
        String loginuserName = input.nextLine();
        
       System.out.print("Enter password to login");
       String loginpassword = input.nextLine();
       
       //update the log in  with entered login details
       login.setUsername(userName);
       login.setPassword(password);
       
       // call loginUser() and returnLoginStatus() to display the result
       System.out.println(login.returnLoginStatus());
       
       input.close();
                
        
        
    }
    
}
 