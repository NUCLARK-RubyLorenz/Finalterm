/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activityforloop;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ActivityForloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double[] grades = new double[5];
        String[] subjects = {"ITC","ITP","STS","U-Self","PathFit"};
        
        System.out.print("Please enter the grades of the following subjects: \n");
        
        for(int i = 0; i < subjects.length; i++){
        //System.out.print(subjects[i] + " : ");
        //grades[i] = scanner.nextDouble();
        double grade;
        do {    
            System.out.print(subjects[i] + ": ");
            while (!scanner.hasNextDouble()){
                System.out.println("Invalid input!!");
                scanner.next();
            }
            grade = scanner.nextDouble();
            if(grade < 0 || grade > 100) {
                System.out.println("Invalid, please enter a proper value!!");
            }
        }while(grade < 0 || grade > 100);
        grades[i] = grade;
        
    }
    System.out.println("Total No. of Subject: " + grades.length); 
        
        int totalgrade = 0;
        
        for (int i = 0; i < grades.length; i++){
            totalgrade += grades[i];
        }
        
        double average = (double)totalgrade / grades.length;
        
        System.out.println("The average grade is: " + average);
    
    scanner.close();
}
}