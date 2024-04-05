/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PitjengTask2Prj {

    static Learner ab = new Learner();
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void getLearnerInput(){
        
        ab.setFname(JOptionPane.showInputDialog("Enter Full Name: "));
        ab.setSubject(JOptionPane.showInputDialog("Enter the Subject: "));
        ab.setAssignmentMark(Integer.parseInt(JOptionPane.showInputDialog("Enter the Assignment mark: ")));
        ab.setTeskMark(Integer.parseInt(JOptionPane.showInputDialog("Enter the Test mark: ")));
        ab.setExamMark(Integer.parseInt(JOptionPane.showInputDialog("Enter the Exam mark: ")));
    }
}
