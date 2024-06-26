/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    }private String newUserName() {
        String userName = "";
        Scanner sc = new Scanner(System.in);
                System.out.println("Please enter your USERNAME......"
                        + "CONDITIONS: "
                        + "*\n*"
                        + "\n1. Username must include an UNDERSCORE \"_\""
                        + "\n2. Usernname can not be longer than 5 characters.");
                userName = sc.next();
                checkUserName(userName);
                return userName;
    }static String checkPasswordComplexity() {
        String approval = "";
        String password;
        int length = 0, capital = 0, digit = 0, specialChar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("PASSWORD: ");
        password = sc.next();
        
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matchers matcher = pattern.matcher(password);
        if(matcher.find() == true){
        specialChar++;
        };
        for (int i = 0; i < password.length(); i++) {
        if (Character.isUpperCase(password.charAt(i))) {
            capital++;
            
        }if (Character.isDigit(password.charAt(i))) {
            digit++;
            
        }if (password.length() > 8)
             length++;
        
        if (specialChar == 0){
            System.out.println("Password must contain a special charcter.");
            checkPasswordComplexity();
        }else if (length == 0){
            System.out.println("Password must be at least 8 characters long.");
            checkPasswordComplexity();
        }else if (digit == 0){
            System.out.println("Password must contain at least one DIGIT.");
            checkPasswordComplexity();            
        }else if (capital == 0){
            System.out.println("Password must contain at least one capital letter.");
            checkPasswordComplexity();            
        }else{
        // If so, store it in the "approved" variable and return.
        approval = password;
        }
        return approval;
    }
        public void passwordVerify(Account [] accounts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your PASSWORD: ");
        String password = "";
               password = sc.next();
        for (int i = 0; i < accounts.length; i++)
        if (password.equals(accounts[i].getPass())){
            System.out.println("Password accepted");
            this.tasks = returnLoginStatus();
            return;
        }
        else{
            System.out.println("Password incorrect.");
            passwordVerify(accounts);
            return;
        }
        }
    private static Task[] returnLoginStatus() {
        System.out.println("Login Sucessful!");
        // New session with verified user.
        Verified user = new Verified();
        Task []tasks = {};
        Task [] newTask = {};
        newTask = user.Verified(tasks);
        tasks = newTask;
        return tasks;
    }}

    

