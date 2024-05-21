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
