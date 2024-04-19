/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RC;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public Login() {
        this.username = "";
        this.password = "";
        this.firstName = "";
        this.lastName = "";
    }
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastname(){
        return this.lastName;
    }
    public void setPass(String name) {
            this.password = name;
    }
    public void setUsername(String username){
    this.username=username;
    }
    
    public void setPassword(String password){
    this.password=password;
    }
    
    public void setfirstName(String firstName){
    this.firstName=firstName;
    }
    
    public void setLastName(String lastName){
    this.lastName=lastName;
    }
    
    public void newAccount(){   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Create a new account." );
                
                System.out.println("*\n*\n*\nPlease enter your FIRST NAME......*\n*\n*\n");
                String name = sc.next();
                setfirstName(name);
                System.out.println("*\n*\n*\nPlease enter your LAST NAME......*\n*\n*\n");
                name = sc.next();
                setLastName(name);
                
                String uName;
                uName = newUserName();
                
                boolean userNameApproved = checkUserName(uName);
                
                while (userNameApproved == false){
                    System.out.println("Username does not meet requirements!");
                    uName = newUserName();
                    userNameApproved = checkUserName(uName);
                }
                this.username = uName;
                //Prompt for password.
                System.out.println("*\n*\n*\nPlease enter your PASSWORD......*\n*");
                System.out.println(""
                        + "CONDITIONS: "
                        + "*\n*"
                        + "\n1. Password must contain a capital letter."
                        + "\n2. Password must contain at least one special character."
                        + "\n3. Password must be at least 8 characters long."
                        + "\n4. Password must contain at least one digit.");
                String pass = checkPasswordComplexity();
                setPass(pass);
               
                
                System.out.println("Account created." );     
                System.out.println("Username: "
                        + this.username
                        + "\n"
                        + "First Name: "
                        + this.firstName
                        + "\n"
                        + "Last Name: "
                        + this.lastName
                        + "\n");
} public boolean checkUserName(String uName) {
        boolean approved = false;
        int underScore = 0, length = 0;
        
        //While the username does not meet the requirements, keep prompting for a new username.
        if (!uName.contains("_")){
            System.out.println("*\n*\n*\nUSERNAME MUST CONTAIN AN UNDERSCORE.\n*\n*\n*");
        }
        else{
        underScore++;
        }
        if (uName.length() > 5){
            System.out.println("*\n*\n*\nUSERNAME MUST BE LESS THAN 5 CHARACTERS.\n*\n*\n*");     
        } 
        else {
        length++;
        }
    //If the username contains an underscore and is shorter than five characters, accept the username;
         while (length == 0 || underScore == 0){
         return false;
        }
         if (length > 0 && underScore > 0){
         return true;
         }
        return approved;
    }
    

