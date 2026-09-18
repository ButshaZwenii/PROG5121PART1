# PROG5121 Part 1 – Sign Up and Login

## Student Info

**Name:** Butsha Zweni 
**Student Number:** ST10503505
**Module:** PROG5121 – Programming 1A  
**Task:** Part 1 – Sign Up and Login

## What This Project Does

This is a Java program that runs in the console. It lets a user create an account with a username, password, and South African cell number. Then the user can log in with those same details.

## What It Can Do

- Check the username is valid
- Check the password is strong enough
- Check the cell number is a valid SA number
- Register a new user
- Log a user in
- Greet the user by first and last name
- Test valid and invalid inputs using JUnit

## Tools Used

- Java
- Apache Maven
- NetBeans
- JUnit
- Git and GitHub

## Project Files

- **Main.java** – Gets input from the user and runs the program.
- **Login.java** – Does the checking, registering, and login logic.
- **LoginTest.java** – Has the JUnit tests for Part 1.

## How to Run

1. Open the Maven project in NetBeans.
2. Run **Main.java**.
3. Follow the prompts in the console to register and log in.

## Testing

The tests are in **LoginTest.java**. They check:
- Valid and invalid usernames
- Valid and invalid passwords
- Valid and invalid cell numbers
- Successful and failed logins
- The correct messages are returned

## Regex Reference

The South African cell number pattern used is:

```
^\+27\d{9}$
```

This pattern follows the South African numbering rules from the Independent Communications Authority of South Africa (ICASA). ICASA says SA numbers are 10 digits. The country code **+27** is used for international format. The leading **0** is dropped, leaving **+27** followed by nine digits.

Source: Independent Communications Authority of South Africa (ICASA), *Numbering*. Accessed 17 September 2026.



