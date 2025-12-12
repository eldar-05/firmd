package a_filewriter;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\eldar\\OneDrive\\Рабочий стол\\all_projects\\javas\\learing-java-from-zero\\day-four\\a_filewriter\\";
        String content =
        """
        How are you doing?
        Im fine?
        I think that every thing is good!

        """;
        try(FileWriter writer = new FileWriter( (filePath + "test.txt"))){
            writer.write(content);
            System.out.println("File has been writed!");
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file path");
        } catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}