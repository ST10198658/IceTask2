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
        
        accounts = processResponse(input, accounts);
       menu(accounts);
    }
    static Login[] processResponse(String input, Login[] accounts){
        int response = 0;
        for (int i = 0; i < input.length(); i++){             
            if (Character.isDigit(input.charAt(i))){           
            response = Integer.parseInt(input);
        }else{
                menu(accounts);
                }
            Scanner sc = new Scanner (System.in);
        switch (response){
            
            case 1:
                Login[] newAccount = new Login[accounts.length + 1];
                Login acc = new Login();
                for (int i = 0; i< accounts.length;i++){
                    newAccount[i] = accounts[i];
                }
                acc.newAccount();
                newAccount[newAccount.length-1]= acc;
                for (int x = 0; x < newAccount.length;x++){
                    System.out.println("ACCOUNTS ON SYSTEM:  "
                            + "\nNAME of user:" + newAccount[x].getFirstName());
                }
                return newAccount;
        }          
    
