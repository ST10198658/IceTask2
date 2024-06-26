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
public class POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login [] accounts = {};
        menu(accounts);
    }
    static void menu (Login [] accounts){
    //Prompt user whether they'd like to login or create a new account.
        System.out.println("Log in, Create New Account."+"\n"+"\n"+"1. Create a NEW account."+"\n"+"2. LOG IN to YOUR account."
                + "\n3. Close." );
        Scanner ab = new Scanner(System.in);
    //Receive menu selection.
        String input = ab.nextLine();
    //Process menu selection by user as stored in "response" varible.
       accounts = processResponse(input, accounts);
       menu(accounts);
    }
//Switch statement to process menu selection from user.
    static Login[] processResponse(String input, Login[] accounts){
        int response = 0;
        for (int i = 0; i < input.length(); i++){             
            if (Character.isDigit(input.charAt(i))){           
            response = Integer.parseInt(input);
        }else{
                menu(accounts);
                }
        }          
        Scanner sc = new Scanner (System.in);
        switch (response){
            //If user selects "1", create a new account.
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
                //If user selects "2", allow the user to attempt to log in, if there are no accounts, state so and redisplay the main menu.
            case 2:
                if (accounts.length < 0)
                {System.out.println("No accounts!");
                menu(accounts);                
                break;
                }
                //If there are accounts available, proceed.
                else{
                System.out.println("Log in to new account." );
                System.out.println("Please enter your USERNAME: " );
                String userLogin = sc.next();
                int matches = 0;
                //Find user account in "accounts" array using userName entered.
                for (int i = 0; i < accounts.length;){
                if (userLogin.equals(accounts[i].getUsername())){                  
                    matches++;
                    System.out.println("Account found.");
                    accounts[i].passwordVerify(accounts);
                    i++;
                }
                else{i++;}
                while(matches == 0 && i == accounts.length){
                    System.out.println("Account not found");
                    menu(accounts);
                    break;
                }
                }
                break;
                }
            case 3:
                System.out.println("Closing....." );
                System.out.println("Goodbye. :)" );
                System.exit(0);
                break;                  
            default:
                System.out.println("Please make sure to only make selections from the available menu item(s).");
                menu(accounts);
                break;        
        }
    return accounts;
        
        
    }}class Task{
        String input = "";
    private List<String> developers = new ArrayList<>();
    private List<String> taskNames = new ArrayList<>();
    private List<String> taskIDs = new ArrayList<>();
    private List<Integer> taskDurations = new ArrayList<>();
    private List<String> taskStatuses = new ArrayList<>();
    
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;
    }
    
    public String createTaskID(String taskName, int taskNumber, String developerLastName) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerLastName.substring(developerLastName.length() - 3).toUpperCase();
    }
    
    public String printTaskDetails(String taskStatus, String developerFirstName, String developerLastName, int taskNumber, String taskName, String taskDescription, String taskID, int taskDuration) {
        StringBuilder taskDetails = new StringBuilder();
        taskDetails.append("Task Status: ").append(taskStatus).append("\n");
        taskDetails.append("Developer Details: ").append(developerFirstName).append(" ").append(developerLastName).append("\n");
        taskDetails.append("Task Number: ").append(taskNumber).append("\n");
        taskDetails.append("Task Name: ").append(taskName).append("\n");
        taskDetails.append("Task Description: ").append(taskDescription).append("\n");
        taskDetails.append("Task ID: ").append(taskID).append("\n");
        taskDetails.append("Task Duration: ").append(taskDuration).append(" hours\n");
        return taskDetails.toString();
    }
    public void addTask(String taskName, String taskDescription, String developer, String taskID, int taskDuration, String taskStatus) {
        taskNames.add(taskName);
        developers.add(developer);
        taskIDs.add(taskID);
        taskDurations.add(taskDuration);
        taskStatuses.add(taskStatus);}
    
    }     
    public void showTaskReport() {
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < taskNames.size(); i++) {
            report.append("Task Name: ").append(taskNames.get(i)).append("\n");
            report.append("Developer: ").append(developers.get(i)).append("\n");
            report.append("Task ID: ").append(taskIDs.get(i)).append("\n");
            report.append("Task Duration: ").append(taskDurations.get(i)).append(" hours\n");
            report.append("Task Status: ").append(taskStatuses.get(i)).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, report.toString());
    } 
public void displayDoneTasks() {
        StringBuilder doneTasks = new StringBuilder();
        doneTasks.append("Tasks with status 'Done':\n");
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskStatuses.get(i).equals("Done")) {
                doneTasks.append("Developer: ").append(developers.get(i)).append(", ");
                doneTasks.append("Task Name: ").append(taskNames.get(i)).append(", ");
                doneTasks.append("Task Duration: ").append(taskDurations.get(i)).append(" hours\n");
            }
        }
        JOptionPane.showMessageDialog(null, doneTasks.toString());
    }