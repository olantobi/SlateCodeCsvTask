/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slatecode.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olanrewaju.ebenezer
 */
public class CsvReader {
    private static final String CSV_FILE_NAME = "slatecode test.csv";
    private static final String CSV_DELIMITER = ",";
    
    public static void main(String[] args) {
        File file = new File(CSV_FILE_NAME);
        String lineRead = "";
        String[] lineReadArray = null;
        int rcCounter = 0;
        
        try (Scanner scanner = new Scanner(file)) {
            
           while (scanner.hasNextLine()) {
               
               lineRead = scanner.nextLine();               
               lineReadArray = lineRead.split(CSV_DELIMITER); 
               
               System.out.print(lineReadArray[rcCounter]);
               System.out.print(" ");
               rcCounter++;
           }           
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
