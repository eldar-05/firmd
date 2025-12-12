package b_filereader_buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\eldar\\OneDrive\\Рабочий стол\\all_projects\\javas\\learing-java-from-zero\\day-four\\b_filereader_buffer\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("Could not locate file path");
        } catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
