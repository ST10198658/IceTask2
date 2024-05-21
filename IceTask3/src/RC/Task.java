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
public class Task {
    Scanner sc = new Scanner(System.in);
    String taskName, taskDESC, devDETAILS, taskDURATION,taskID,status;
    int taskNUM, hours, minutes, taskDurationNumerical = (this.hours*60) + this.minutes;
    
    public void setTask (String tName, String tID, String taskDuration, String tStatus, String devName) {
        devDETAILS = devName;
        taskName = tName;
        taskDURATION = taskDuration;
        hours = Integer.parseInt(taskDURATION);
        status = tStatus;
        taskID = tID;
    
}
    public void Tasker(){
        System.out.println("ADDING A NEW TASK!"
                + "\n."
                + "\n."
                + "\nTASK NAME: ");
        nameTask();

        System.out.println("\n."
                + "\n."
                + "TASK DESCRIPTION:");
        this.taskDESC = taskDesc();
        
        System.out.println("\n."
                + "\n."
                + "DEVELOPER DETAILS:");
        devDeets();
        System.out.println(this.devDETAILS);
        
        System.out.println("\n."
                + "\n."
                + "TASK DURATION:");
        setDuration();   
        
        System.out.println("\n."
                + "\n."
                + "TASK IDENTIFICATION NUMBER:");
        taskID();
        
        System.out.println("\n."
                + "\n."
                + "TASK STATUS:");
        taskStatus();
    } 
 public void Number(Task [] tasks){
            System.out.println("\n."
                + "\n."
                + "TASK NUMBER:");
        this.taskNUM = (tasks.length + 1);
    }
 public void showReport(){
        System.out.println("TASK NAME:...................");
        System.out.println(this.taskName);
        System.out.println("TASK NUMBER:.................");
        System.out.println("0" + this.taskNUM);
        System.out.println("TASK DESCRIPTION:............");
        System.out.println(this.taskDESC);
        System.out.println("DEVELOPER DETAILS:...........");
        System.out.println(this.devDETAILS);
        System.out.println("TASK DURATION:...............");
        System.out.println(this.taskDURATION);
        System.out.println("TASK IDENTIFICATION NUMBER:..");
        System.out.println(this.taskID);       
    }
 public String taskDesc(){
        System.out.println("Please enter a TASK DESCRIPTION."
                + "\nTASK DESCRIPTION can not be longer than 50 characters.");
        String desc = sc.next();
        while (desc.length()>50){
        System.out.println("Please enter a TASK DESCRIPTION."
                + "\nTASK DESCRIPTION can not be longer than 50 characters.");
        desc = sc.next();
        }
        return desc;
    }
 public void devDeets(){
        System.out.println("The first and last name of the developer assigned to the task.");
        String fName, name = " ", lName;
        System.out.println("FIRST NAME: ");
        fName = sc.next();
        System.out.println("LAST NAME: ");
        lName = sc.next();
        System.out.println("Save name?\n" + fName + " " + lName);
        System.out.println("Save-1."
                + "\nRename-2.");
        int x = sc.nextInt();
        switch(x){
            case 1:
                name = fName + " " + lName;
                this.devDETAILS = name;
                break;
            case 2:
                devDeets();
                break;
            default:
        System.out.println("Save name?" + fName + " " + lName);
        System.out.println("Save-1"
                + "\nRename-2");
        x = sc.nextInt();
                switch(x){
            case 1:
                name = fName + " " + lName;
                this.devDETAILS = name;
                break;
            case 2:
                devDeets();
                break;
        }
    }
}
    public void setDuration(){
        System.out.println("Estimated duration of TASK?");
        System.out.println("Hours: ");
        int i = sc.nextInt();
        System.out.println("Minutes: ");
        int j = sc.nextInt();
        String duration = String.format("%02d", i) + ":" + String.format("%02d", j);
        System.out.println("Save this duration?"
                + "\n1.Save."
                + "\n2.Re-set.");
                int x = sc.nextInt();
        switch(x){
            case 1:
                this.hours = i;
                this.minutes = j;
                duration = String.format("%02d", i) + ":" + String.format("%02d", j);
                System.out.println("Duration, hours: " + this.hours + " and " + this.minutes + "minutes.");
                this.taskDURATION = duration;
                break;
            case 2:
                setDuration();
                break;
            default:
        System.out.println("Save this duration?"
                + "\n1.Save."
                + "\n2.Re-set.");
                x = sc.nextInt();
                switch(x){
            case 1:
                this.hours = i;
                this.minutes = j;
                duration = String.format("%02d", i) + ":" + String.format("%02d", j);
                System.out.println("Duration, hours: " + this.hours + " and " + this.minutes + "minutes.");
                this.taskDURATION = duration;                
                break;
            case 2:
                setDuration();
                break; 
                }
                
                
        }

    }
    public void nameTask() {
    System.out.println("Task name must contain at least two characters.");
    
String[] words = sc.next().split(" ");
String name = Arrays.toString(words);
name = name.substring(1, name.length() - 1);
System.out.println(name);
    if (name.length() < 2) {
            nameTask();
        } else {
            this.taskName = name;
        }
}
    public void taskID(){
        this.taskID = this.taskName.substring(0, 2).toUpperCase() + " : " + this.taskNUM + " : " + this.taskName.substring(this.taskName.length() - 3).toUpperCase();
    }
