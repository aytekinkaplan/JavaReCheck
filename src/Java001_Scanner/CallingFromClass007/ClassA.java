package Java001_Scanner.CallingFromClass007;

import java.util.Scanner;

public class ClassA {
    /* TASK->
    Ask user to enter mid-term grade, final grade, and project grade
    Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

     Example:
         INPUT: mid-term grade=78
                  final grade = 66
                  project grade = 90
         OUTPUT: "Your grade is : 81,6"

    */
    double midTermGrade = 0, finalGrade = 0, projectGrade = 0;

    public void scoreCalculating(double midTermGrade, double finalGrade, double projectGrade) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mid-term grade");
        midTermGrade = scanner.nextDouble();
        System.out.println("Enter your final grade");
        finalGrade = scanner.nextDouble();
        System.out.println("Enter your project grade");
        projectGrade = scanner.nextDouble();
        double yourGrade = midTermGrade * 0.3 + finalGrade * 0.5 + projectGrade * 0.2;
        System.out.println("Your mid_term grade is " +midTermGrade+"\n" +
                           "your final grade is "+finalGrade+"\n"+
                           "and your project is " + projectGrade+"\n" +
                           "and your passing grade is "+yourGrade);
    }
}
