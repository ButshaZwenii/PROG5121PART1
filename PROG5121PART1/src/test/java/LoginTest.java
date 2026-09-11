/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LoginTest {
    
    @Test
    public void testUsernameValid(){
        // arrange
        Login login = new Login("kyl_1", "Ch&8.sec@ke99!", "+27838986976", 
                "Smith", "John");
        //
        
        //Act
        boolean actual = login.checkuserName();
        //Assert comment
        // Assert
        assertTrue(actual);
        
        
    }
    @Test
    public void testuserNameInvalid(){
        //Arrange
        Login login = new Login("kyle!!!!!!!", "Ch&8.sec@ke99!", "+27838986976",
                "Smith", "John");
        
        //Act
        boolean actual = login.checkuserName();
        
        //Assert
           assertFalse(actual);
    }
    @Test
    public void testPasswordValid() {
        // Arrange
        Login login = new Login("kyl_1", "Ch&8.sec@ke99!", "+27838986976",
                "Smith", "John");

        // Act
        boolean actual = login.checkPasswordComplexity();

        // Assert
        assertTrue(actual);
        
    }
     @Test
    public void testPasswordInvalid() {
        // Arrange
        Login login = new Login("kyl_1", "password", "+27838986976", "Smith"
                , "John");

        // Act
        boolean actual = login.checkPasswordComplexity();

        // Assert
        assertFalse(actual);
    }
    @Test
    public void testCellNumberValid() {
        // Arrange
        Login login = new Login("kyl_1", "Ch&8.sec@ke99!", "+27838986976",
                "Smith", "John");

        // Act
        boolean actual = login.checkCellPhoneNumber();

        // Assert
        assertTrue(actual);
    }
     @Test
    public void testCellNumberInvalid() {
        // Arrange
        Login login = new Login("kyl_1", "Ch&8.sec@ke99!", "08966553", 
                "Smith", "John");

        // Act
        boolean actual = login.checkCellPhoneNumber();

        // Assert
        assertFalse(actual);
    }
    @Test
    public void testLoginSuccess() {
        // Arrange
        Login login = new Login("kyl_1", "Ch&8.sec@ke99!", "+27838986976",
                "Smith", "John");

        // Act
        boolean actual = login.loginUser("kyl_1", "Ch&8.sec@ke99!");

        // Assert
        assertTrue(actual);
    }
     @Test
    public void testLoginFail() {
        // Arrange
        Login login = new Login("kyl_1", "Ch&8.sec@ke99!", "+27838986976"
                , "Smith", "John");

        // Act
        boolean actual = login.loginUser("wrongUser", "wrongPass");

        // Assert
        assertFalse(actual);
    }
    
    
    
    
        
    
    
}
    
            
  