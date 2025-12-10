import java.util.Scanner;

public class VariableArgumentTopic {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String[] quiz = {"2 + 2",
                         "3 + 7",
                         "4 + 6",
                         "3 + 4",
                         "7 + 4"
        };

        String[][] options = {{"1. 3", "2. 4","3. 5","4. 8"},
                              {"1. 11","2. 12","3. 10","4. 32"},
                              {"1. 10","2. 11","3. 9","4. 13"},
                              {"1. 6","2. 8","3. 7","4. 10"},
                              {"1. 11","2. 10","3. 12","4. 8"}
        };
        
        int[] answers = {2, 3, 1, 3, 1};

        int score = 0;
        for(int i = 0; i < quiz.length; i++){
            System.out.println(quiz[i]);
            for(int j = 0; j < 4; j++){
                System.out.println(options[i][j]);
            }
            int input = sc.nextInt();
            if(input == answers[i]){
                score += 1;
            }
        }
        System.out.println("Your score is: " + score);
    }
} 