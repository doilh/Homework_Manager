/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author doilhan
 */
public class FileHelper {
    final String FILE_NAME = "homeworks.sdv";
    BufferedReader reader;
    PrintWriter writer;
    public static void main(String[] args) {
        System.out.println("Testing my file helper class...");
        FileHelper f = new FileHelper();
        String[] lines = f.readTasks();
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);            
        }
    }
    String[] readTasks() {
        String[] tasks = new String[100];
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader(FILE_NAME));
            String line = reader.readLine();
            while (line != null) {
                tasks[count] = line;
                count = count + 1;
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException f) {
            System.out.print("Tasks file not found");
        } catch (IOException i) {
            System.out.print("Cannot read from tasks file");

        }
        return Arrays.copyOfRange(tasks, 0, count);
    }
    void writeTasks(String[] lines) {
        try {
            writer = new PrintWriter(new FileWriter(FILE_NAME));
            
            for (int i = 0; i < lines.length; i++) {
                if(lines[i] == null){
                }else{
                writer.println(lines[i]);
                }
            }
            writer.close();
            
        } catch (IOException i) {
            System.out.print("Cannot open tasks file for output");
        }
    }
    
}

