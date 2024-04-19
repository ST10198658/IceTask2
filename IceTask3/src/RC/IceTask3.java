/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RC;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class IceTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Accounts array initialization.
       Login [] accounts = {};
        menu(accounts);
    }
    static void menu (Login [] accounts){
        System.out.println("Log in, Create New Account."+"\n"+"\n"+"1. Create a NEW account."+"\n"+"2. LOG IN to YOUR account."
            + "\n3. Close." );
        Scanner ab = new Scanner(System.in);
        
        String input = ab.nextLine();
    }
    
}
