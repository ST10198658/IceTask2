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
