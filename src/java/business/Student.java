/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Student {
    private int studentId;
    private String studentName;
    private LocalDate birthdate;

    public Student(int studentId, String studentName, LocalDate birthdate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthdate = birthdate;
    }

    public Student() {
    }
    
    
}
