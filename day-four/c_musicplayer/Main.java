package c_musicplayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\eldar\\OneDrive\\Рабочий стол\\all_projects\\javas\\learing-java-from-zero\\day-four\\c_musicplayer\\mot-avgust-eto-ty_MamSESiE.wav";
        File file = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); Scanner sc = new Scanner(System.in);){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter: ");

                response = sc.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Infalid choice");
                }
            }

        } 
        catch(FileNotFoundException e){
            System.out.println("Could not found file");
        } catch(UnsupportedAudioFileException e){
            System.out.println("Audio File is not supported");
        } catch(LineUnavailableException e){
            System.out.println("NO access to audio file");
        } catch(IOException e){
            System.out.println("Something went wrong");
        } finally{
            System.out.println("Quit the program");
        }
    }
}
