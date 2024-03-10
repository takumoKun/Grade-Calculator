// class to calculate the grade of the student
public class GradeCalculator {

    // constructor method
    public GradeCalculator() {
        // nothing... kasi wala
    }

    char calculateGrade(int score) {
        // use if, else-if to determine the appropriate letter
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        }

        // returns F as default
        return 'F';
    }

    String getLetterGradeDescription(char grade) {
        String output;

        // use switch-case to check the grade and display the appropriate message
        switch (grade) {
            case 'A':
                output = "Excellent! You're a genius!";
                break;
            case 'B':
                output = "Good! Keep up the good work!";
                break;
            case 'C':
                output = "Average! Not bad!";
                break;
            case 'D':
                output = "Below Average! Please try to study more!";
                break;
            default:
                output = "Failed! Oh no!";
                break;
        }

        // returns the output string
        return output;
    }

}
