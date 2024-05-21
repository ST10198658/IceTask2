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
    public Task newTask() {
        Task task = new Task(); 
        task.Tasker();
        return task;
    }
    public void AccrueTaskArrays(){
    
// Create a new destination array with a larger size than the original "tasks" array.
String[] newDevDETAILSArray = {};
int length;
length = tasks.length;
for (int i = 0; i < length; i++) {
    newDevDETAILSArray[i] = tasks[i].devDETAILS;
}
taskDeveloper = newDevDETAILSArray;

// Create a new destination array with a larger size than the original "tasks" array.
String[] newTaskNameArray = new String[tasks.length];

// copy all the "taskName" from each task in the "tasks" array to the new array
for (int i = 0; i < tasks.length; i++) {
    newTaskNameArray[i] = tasks[i].taskName;
}
    taskNames = newTaskNameArray;

// Create a new destination array with a larger size than the original "tasks" array.
String[] newTaskID = new String[tasks.length];

// copy all the "taskIDs" from each task in the "tasks" array to the new array
for (int i = 0; i < tasks.length; i++) {
    newTaskID[i] = tasks[i].taskID;
}
taskIDs = newTaskID;

// Create a new destination array with a larger size than the original "tasks" array.
String[] newTaskDurations = new String[tasks.length];

// copy all the "taskDURATION" from each task in the "tasks" array to the new array
for (int i = 0; i < tasks.length; i++) {
    newTaskDurations[i] = tasks[i].taskDURATION;
}
taskDURATIONs = newTaskDurations;
    
// Create a new destination array with a larger size than the original "tasks" array.
String[] newTaskStatuses = new String[tasks.length];

// copy all the "taskStatuses" from each task in the "tasks" array to the new array
for (int i = 0; i < tasks.length; i++) {
    newTaskStatuses[i] = tasks[i].status;
}
      taskStatuses = newTaskStatuses;
        
    }
    public void SearchTasksMenu(){
    Scanner sc = new Scanner(System.in);
// Select search method.
    System.out.println("Please select a search method"
            + "\nSearch by:"
            + "\n1. Developer Name."
            + "\n2. Task Names."
            + "\n3. Task ID."
            + "\n4. Task Duration."
            + "\n5. Task Status");
    String response = sc.next();
    switch (response){
            case "1":
                SearchByDeveloper();
                break;
            case "2":
                SearchByName();
                break;
            case "3":
                SearchByTaskID();
                break;
            case "4":
                SearchByDuration();
                break;
            case "5":
                SearchByStatus();
                break;
            default:
                SearchTasksMenu();
                break;

    }                
    Verified(tasks);
}  
public void SearchByDeveloper(){
    Scanner sc = new Scanner(System.in);
// Prompt user for known developer name.
    System.out.println("Please enter the NAME of the DEVELOPER of the task you are looking for.");
    System.out.print("\nDEVELOPER NAME: ");
    String target = sc.next();

  // Loop through the array
  for (int i = 0; i < tasks.length; i++) {
    // Compare each element with the target
    if (tasks[i].devDETAILS.toLowerCase().contains(target.toLowerCase())) {
      // Return the index if a match is found
        System.out.println("Task found!: " + tasks[i].devDETAILS + " at index " + i);
        String status = "";
        switch(tasks[i].status){
            case "1":
                status = "To Do";
                break;
            case "2":    
                status ="Doing";
                break;
            case "3":
                status="Done";
                break;
        }
        System.out.println("TASK NAME: " + tasks[i].taskName + "TASK STATUS: " + tasks[i].status );
        return;
    }else{
        // If not found.
        System.out.println("Not found!");
  }
}
}
public void SearchByName(){
    Scanner sc = new Scanner(System.in);
// Prompt user for known developer name.
    System.out.println("Please enter the NAME of the task you are looking for.");
    System.out.print("\nTASK NAME: ");
    String target = sc.next();

  // Loop through the array
  for (int i = 0; i < tasks.length; i++) {
    // Compare each element with the target
    if (tasks[i].taskName.toLowerCase().contains(target.toLowerCase())) {
      // Return the index if a match is found
        System.out.println("Task found!: " + tasks[i].taskName + " at index " + i);
        System.out.println("TASK NAME: " + tasks[i].taskName + "TASK STATUS: " + tasks[i].status );
        return;
    }else{
        // If not found.
        System.out.println("Not found!");
  }
}
}