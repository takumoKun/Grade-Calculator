/*
Made by: Leonardo B. Magdarag Jr.
Date: March 9, 2024
Description:
A simple grade calculator program that calculates the grade of a student based on the score entered by the user.
*/
import java.util.Scanner;

public class GradeCalculatorRunner {
    static Scanner scanner = new Scanner(System.in);
    static final String validScore = "^[0-9]*$";
    static final String validYesNo = "^[1-2]$";
    static final int run = 1;

    public static void main(String[] args) {
        // Create an instance of the GradeCalculator class
        GradeCalculator student = new GradeCalculator();
        int score, rerun = run;

        // create a while loop so that the user can keep using the program
        while (rerun == run) {
            System.out.println(
                    "\n=============================================================================================");

            // get the score from the user
            score = getInput(
                    validScore,
                    "\nEnter Student Score [0-100]: ",
                    "Entered an invalid Grade! Please enter a valid one!"
            );

            // call the calculateGrade method and store the result in the variable 'grade'
            char grade = student.calculateGrade(score);
            // call the getLetterGradeDescription method and store the result in the variable 'remark'
            String remark = student.getLetterGradeDescription(grade);
            // display the grade and its description
            System.out.println("The score " + score + " is equivalent to the grade " + grade + " which means that the grade is " + remark);

            System.out.println(
                    "\n=============================================================================================");

            // ask the user if they want to run the program again
            rerun = getInput(
                    validYesNo,
                    "\nDo you want to use this calculator again? \nEnter 1 for Yes and 2 to end the code: ",
                    "Input error! Please only enter 1 for YES and 2 for NO!");

            // if the user does not want to run the program again, exit the program
            if (rerun != run) {
                System.out.println("Thank you for using the Grade Calculator!");
                System.exit(0);
            }
        }
    }

    // method to get the user's input
    public static Integer getInput(String regexToCompare, String question, String errorMsg) {
        // display the question and get the user's input
        System.out.print(question);
        String userInput = scanner.nextLine();

        // use regex to check if the user's input is valid and within the range
        if (!userInput.matches(regexToCompare) || Integer.parseInt(userInput) > 100) {
            // display an error message and ask the user to input again
            System.out.println(errorMsg);
            System.out.println("User's input: " + userInput);

            // use recursion to call the method again until the user's input is valid
            return getInput(regexToCompare, question, errorMsg);
        }
        // return the user's input if it is valid
        return Integer.parseInt(userInput);
    }
}
