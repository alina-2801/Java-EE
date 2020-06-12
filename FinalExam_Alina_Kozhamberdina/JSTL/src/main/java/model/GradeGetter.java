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
public class GradeGetter {
    public static String getGrade(double marks ){
        return 
                marks>90? "A":
                marks>80? "B":
                marks>70? "C":
                marks>60? "D":
                marks>50? "E": "F";
              
    }
}
