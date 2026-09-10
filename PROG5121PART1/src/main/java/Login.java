/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Login {
    
    // declaring variable 
    
    private String userName;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;
    
    
    //  Constructor 
    
    /*
    Runs when you create a new object. It sets up the initial values for your fields.
    */
    
    public Login (String username , String password, String  cellNumber ,
            String firstName, String lastName){
        this.userName = username;
        this.password = password;
        this.cellNumber = cellNumber;
        this.firstName = firstName;
        this.lastName = lastName;      
    }
    
    // Getterts 
    
    /*
    Allow you to read private data from outside the class safely.
    */
    
    public String getUsername() {return userName;}
    public String getPassword(){return password;}
    public String getCellNumber(){return cellNumber;}
    public String getFirstName(){ return firstName;}
    public String getLastName() {return lastName;}
    
    // setters 
    /*
    Allow you to change private data from outside the class safely.
    */
    
    public void setUsername(String username) {this.userName = username;}
    public void setPassword(String password) {this.password = password;}
    public void setCellNumber(String cellNumber) {this.cellNumber = cellNumber;}
    public void setFirstname(String firstName) {this.firstName = firstName;}
    public void setLastNmae (String lastName) {this.lastName = lastName;}
   
    
    //Method 
    
    public boolean checkuserName() {
        
        // check if the user name has underscore and has <= 15 characters and 
        // and return  true if both condition are true
       
        //User name can have an underscore but its optiona;
        boolean hasUnderscore = userName.contains("_");
        boolean validLength = userName.length()<= 5;
        return  hasUnderscore && validLength;
           
    }
    
    public boolean checkPasswordComplexity() {
        //checks all password rules from the brief
        
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar =password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean validLength = password.length() >= 8;
        return hasUppercase && hasDigit && hasSpecialChar && validLength;  
    }
    
    public boolean checkCellPhoneNumber(){
        // Now checks for international code (+27) and max 10 digits after it
        return cellNumber.matches("\\+27\\d{9}");
       
        
    }
    
        
    
      // call validation method and return the exact messeges required
    public String registerUser(){
        if  (!checkuserName()) {
         return "Invalid username,Please use an underscore and max 5 characters";
        }else if (!checkPasswordComplexity()) {
            return "\"Invalid password. Must have 8+ chars, a capital, number, "
                    + "and special symbol.\"";    
        } else if(!checkCellPhoneNumber()) {
            return "Invalid cell number. Include +27 and 10 digits.";
            
        }else {
            return "\"Username, password, and cell number captured"
                    + " successfully.\";";
        }
    }
       
    public boolean loginUser(String enteredUserName, String enteredPassword){
        // Compare entered login details with stores registration details
        return userName.equals(this.userName)&& password.equals(this.password);
        
    }
    
    public String returnLoginStatus(){
        // return the correct success / failure login message
        if (loginUser (userName, password)){
            return "Welcome" + firstName + "" + lastName + "Its great to see "
                    + "you again ";                  
                                    
        }else {
            return "Username or password incorrect please try again";
        }
    }
        
    
        
    }
        
        
    

