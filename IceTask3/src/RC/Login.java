/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RC;

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
    
    }
}