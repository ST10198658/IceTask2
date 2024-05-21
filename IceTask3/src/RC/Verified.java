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
public class Verified {
    Task [] tasks;
String [] taskDeveloper;
String [] taskNames;
String [] taskIDs;
String [] taskDURATIONs;
String [] taskStatuses;


int tasksQauntity = 0;
    
    
    public Task[] Verified(Task [] tasksOG){

                
        if (tasks.length == 0){

        // Welcome to EASY KANBAN MENU (Before any tasks have been added.)
        Scanner sc = new Scanner(System.in);
                    
        System.out.println("Welcome to EasyKanban");
        System.out.println("\nPLEASE SELECT FROM THE FOLLOWING MENU:"
                + "\n1. Add TASKS."
                + "\n2. Show Report (COMING SOON.)"
                + "\n3. QUIT");
        // Receive user input. 
        int selection;
        try {selection = sc.nextInt();
                }
        catch (Exception e){
                selection = Integer.parseInt(sc.nextLine());
                }
        
        switch (selection){
            case 1:
                System.out.println("How many TASKS would you like to add?");
                int tasksQUANTITY;
                tasksQUANTITY = sc.nextInt();
                    
                Task [] newTasks = new Task[tasksQUANTITY + tasks.length];

                for (int i = 0; i < tasks.length; i++){
                    newTasks [i] = tasks[i];
                }

                for (int j = 0; j < tasksQUANTITY; j++){
                    Task task = new Task();
                    task.Tasker();
                newTasks[tasks.length + j] =  task;
                    System.out.println("Number of tasks: " + newTasks.length);
                }
                tasks = newTasks;
                Verified(tasks);
                return tasks;
            case 2:
                Verified user = new Verified();
                System.out.println("Coming Soon!");               
                Verified(tasks);               
            break;
            case 3:
                System.out.println("Closing.");
                  System.exit(0);
            break;
            default:
            Verified(tasks);
            break;
            
        }
        }else if (tasks.length>0){
        newMenu(tasks);
        }else{Verified(tasks);}
        return tasks;
    }
    public void newMenu(Task [] tasks){
         //tasks = p.Populate(tasks);
        // Populate arrays. (develeoper names, task names, task IDs, task durations, task statuses.)
        
        // Display a new menu for when the user has succesfully logged in. (This version of the menu is used once at least one task has been created)
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to EasyKanban");
        System.out.println("\nPLEASE SELECT FROM THE FOLLOWING MENU:"
                + "\n1. Add TASKS."
                + "\n2. Show Report."
                + "\n3. DISPLAY TASKS."
                + "\n4. Search tasks."
                + "\n5. QUIT.");
               // Receive user input. 
        int selection;
        try {selection = sc.nextInt();
                }
        catch (Exception e){
                selection = Integer.parseInt(sc.nextLine());
                }
        
        switch (selection){
            case 1:

                System.out.println("How many TASKS would you like to add?");
                int tasksQUANTITY;
                tasksQUANTITY = sc.nextInt();
                
                Task [] newTasks = new Task[tasks.length + tasksQUANTITY];    
                
                for (int i = 0; i < tasks.length; i++){
                    newTasks [i] = tasks[i];
                }

                for (int j = 0; j <  tasksQUANTITY;){
                    System.out.println("Creating task number " + (j + 1));
                    Task task = new Task();
                task.Number(tasks);
                task.Tasker();
                newTasks[tasks.length + j] =  task;
                j++;
                }
                tasks = newTasks;
                System.out.println("Tasks ADDED!");
                System.out.println("Number of task " + (tasks.length));
                Verified(tasks);
            break;
            case 3:
                System.out.println("DISPLAY TASKS.");
                displayTask();
                Verified(tasks);
            break;
            case 2:

                System.out.println("Show Report.");
                for (int i = 0; i < tasks.length; i++){
                    System.out.println("\n...TASK No: " + "(" + (i+1)+ " of " + tasks.length + ")" + " .........................");
                tasks[i].showReport();
                    System.out.println(".........................\n");
                    
                }
                Verified(tasks);
            break;
            case 4:
                System.out.println("Search for task selected.");
                SearchTasksMenu();
            case 5:
                  System.exit(0);
                break;
            default:
            Verified(tasks);    
        }
    }
}
