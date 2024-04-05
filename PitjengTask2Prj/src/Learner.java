/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Learner {
    private String fname;
    private String subject;
    private int assignmentMark;
    private int testMark;
    private int examMark;
    
    public Learner(){
    this.fname="";
    this.subject="";
    this.assignmentMark=0;
    this.testMark=0;
    this.examMark=0;   
} 
    public String getFname(){
    return this.fname;
}

public String getSubject(){
    return this.subject;
}

public int getAssignmentMark(){
    return this.assignmentMark;
}

public int getTeskMark(){
    return this.testMark;
}
public int getExamMark(){
    return this.examMark;
}
}
