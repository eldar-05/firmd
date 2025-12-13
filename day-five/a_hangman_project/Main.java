package a_hangman_project;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String filePath = "a_hangman_project\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){ 
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
            
        } catch(FileNotFoundException e){
            System.out.println("could not fine file path");
        } catch(IOException e){
            System.out.println("something went wrong!");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        System.out.println(word);

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("========== Polechudes ===========");

        while(wrongGuesses < 5){

            System.out.println("\n");
            System.out.println(getArt(wrongGuesses));

            System.out.println("Word:" );

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess word: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println("You win!");
                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("Wrong!");
            }
        }

        if(wrongGuesses >= 5){
            System.out.println(getArt(wrongGuesses));
            System.out.println("Game over!");
            System.out.println("The word was: " + word);
        }

        sc.close();
        
    }

    static String getArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
            HP: =*****=   
                    """;
            case 1 -> """
            HP: =**** =        
                    """;
            case 2 -> """
            HP: =***  =
                    """;
            case 3 -> """
            HP: =**   =
                    """;
            case 4 -> """
            HP: =*    =
                    """;
            case 5 -> """
            HP: =     =
                    """;
            default -> "";
        };

    }
}
 