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
    
    public Login (String username , String password, String  cellNumber , String firstName, String lastName){
        this.userName = userName;
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
   
}
