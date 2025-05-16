/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla02;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Student's Account
 */
public class TLA02 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      HashMap<String,Integer>gm = new HashMap<>();
      
      gm.put("John", 85);
      gm.put("Alice", 90);
      gm.put("Mark",78);
      gm.put("Sophia",95);
      gm.put("Emma", 85);
      
    
        
        System.out.print("Enter student's name to find their score: ");
        
        String name = scan.nextLine();
        
       if (gm.containsKey(name)){
           System.out.println(name + "'s score is: " + gm.get(name));
       } else {
           System.out.println("Student not found.");
       }
       
        System.out.println(" ");
        
        System.out.print("Enter the student's name to update their score: ");
        name = scan.nextLine();
        
        if(gm.containsKey(name)){
            System.out.print("Enter the new score: ");
            int newscore = scan.nextInt();
            gm.put(name,  newscore);
            System.out.println(name + "'s" + " Score updated successfully.");
        }
        System.out.println(" ");
        
        System.out.println("List of students score:");
        for ( String students : gm.keySet()){
            System.out.println(students + ": " + gm.get(students));
        }
    }
}      
    

