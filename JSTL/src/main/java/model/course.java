/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alina
 */
public class course {
  private String name;
private double marks;
private String grade;

    public course() {
    }

    public course(String name, double marks) {
        this.name = name;
        this.marks = marks;
        this.grade = GradeGetter.getGrade(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    


               
        
        
}
