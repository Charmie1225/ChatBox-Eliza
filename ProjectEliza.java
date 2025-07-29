//https://youtu.be/TliQUaOB2Ok
//https://www.dropbox.com/scl/fi/0kpey9691mml8af94ei2x/Project2-video.mp4?rlkey=rxk863qi562g7jdvyqfi86r4o&dl=0
import java.util.Scanner;

public class ProjectEliza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // use scanner to get the input from the user
        PromptBank promptBank = new PromptBank(); // create a new promptBank class
        // The output to greet the user
        System.out.println("ELIZA: Hello, my name is Eliza, I am program that love to talk about TV shows. What is your name?"); 
        String userName = scanner.nextLine(); // input from the user
        System.out.println("ELIZA: Hello, " + userName + " Tell me what is your favorite TV show of all time.");

        while (true) {
            String userSentence = scanner.nextLine(); // input from the user 

            if (userSentence.equalsIgnoreCase("EXIT")) { // if the user enter the word exit 
                System.out.println("ELIZA: Do you want to run the session again? (Y/N)");
                String response = scanner.nextLine(); // user answer, yes or no(Y/N)
                if (response.equalsIgnoreCase("N")) { // if the input from the user is N
                    System.out.println("ELIZA: Goodbye, until next time.");
                    break; // The loop will stop, so the program will close
                } else { // if the input from the user is Y
                    System.out.println("ELIZA: Hello, " + userName + " Tell me what is your favorite TV show of all time.");
                    userName = scanner.nextLine(); // The loop will continue and start over
                }
            }

            String[] words = userSentence.split(" "); // array to store the words from sentence
            String word1 = words.length > 0 ? words[0] : "";// to check if the array is not empty, if it is not this method will get the first word in the sentence
            String word2 = words.length > 0 ? words[words.length - 1] : ""; //if the array is not empty it will get the last word in the sentence 

            if (userSentence.endsWith("?")) { // if the user sentence ends with a question mark
            	//this method will print a random question from the populate question.
                System.out.println(promptBank.replaceBlankWords(promptBank.getRandomQuestionTrunk(), word1, word2));
            } else if (userSentence.endsWith("!")) {// if the user sentence ends with an exclamation mark
            	//this method will print "WOW! Dramatic! and it will print a random statement from the populate statement
                System.out.println("ELIZA: WOW! Dramatic! " + promptBank.replaceBlankWords(promptBank.getRandomStatementTrunk(), word1, word2));
            } else { //if the user does not use question or exclamation mark, it will randomly select a statement from the populate statement
                System.out.println(promptBank.replaceBlankWords(promptBank.getRandomStatementTrunk(), word1, word2));
            }
        }

        scanner.close(); // close the scanner
    }
}