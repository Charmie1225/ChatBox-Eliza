import java.util.Random;

/**
 * The PromptBank class represents a collection of prompts used in the Eliza program.
 */
public class PromptBank {

    String[] statements; // Array to store statements
    String[] questions; // Array to store questions

    public PromptBank() {
        questions = new String[6]; // Arrays size for questions is 6
        statements = new String[6]; // Arrays size for statements is 6
        populateStatementsArray(); // Initialize the statements array
        populateQuestionsArray();  // Initialize the questions array
    }

    // Method for the statement array with 6 statements
    public void populateStatementsArray() {
        statements[0] = "Tell me more about BLANK1 and BLANK2.";
        statements[1] = "BLANK1 seems like it is good, so does BLANK2. Please tell me more.";
        statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
        statements[3] = "BLANK1 seems to be your favorite. What about BLANK2.";
        statements[4] = "You like BLANK1, but I'm more interested in BLANK2.";
        statements[5] = "BLANK1 is my favorite too, but let's talk about BLANK2 as well.";
    }

    // Method for the question array with 6 questions
    public void populateQuestionsArray() {
        questions[0] = "Is there anything else about BLANK1 and BLANK2?";
        questions[1] = "Does BLANK1 not that good? How about BLANK2?";
        questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
        questions[3] = "Is BLANK1 your favorite? How about BLANK2?";
        questions[4] = "Do you like BLANK1 more than BLANK2?";
        questions[5] = "Is there something interesting about BLANK1 and BLANK2?";
    }

    // Way to get the random statement from populate statements
    public String getRandomStatementTrunk() {
        Random random = new Random();
        int randomIndex = random.nextInt(statements.length);
        return statements[randomIndex];
    }

    // Way to get the random question from populate questions
    public String getRandomQuestionTrunk() {
        Random random = new Random();
        int randomIndex = random.nextInt(questions.length);
        return questions[randomIndex];
    }

    // Replace the Blank with actual words that the user entered for the first word and the last word
    public String replaceBlankWords(String statement, String word1, String word2) {
        return statement.replace("BLANK1", word1).replace("BLANK2", word2);
    }
}