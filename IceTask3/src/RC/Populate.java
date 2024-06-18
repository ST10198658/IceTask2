/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RC;

/**
 *
 * @author RC_Student_lab
 */
public class Populate {
    public Task [] Populate (Task [] tasks){
    if (tasks.length > 2){
        return tasks;
        }else{
        Task[] newTasks = new Task[tasks.length + 4];

      newTasks[0] = new Task();
      newTasks[0].setTask("Create Login", "0001", "5", "To Do", "Mike Smith");

      newTasks[1] = new Task();
      newTasks[1].setTask("Create Add Features", "0002", "8", "Doing", "Edward Harrison");

      newTasks[2] = new Task();
      newTasks[2].setTask("Create Report", "0003", "2", "Done", "Samantha Paulson");

      newTasks[3] = new Task();
      newTasks[3].setTask("Add Arrays", "0004", "11", "To Do", "Glenda Oberholzer");
      
      for (int i = 3; i < tasks.length; i++) {
        newTasks[i + 1] = tasks[i];
    
    }
}
