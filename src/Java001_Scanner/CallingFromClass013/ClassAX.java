package Java001_Scanner.CallingFromClass013;

import java.util.Scanner;

public class ClassAX {
    double score1, score2, finalScore;
    public void classScore(double score1, double score2, double finalScore){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Vizeni gir: ");
        score1 = scanner.nextDouble();
        System.out.println("2. Vizeni gir: ");
        score2 = scanner.nextDouble();
        System.out.println("Final notunu gir");
        finalScore = scanner.nextDouble();
        double passingScore = ((score1+score2)/2)*0.3 + (finalScore*0.7);
        System.out.println("Notunuz: "+passingScore);
    }
}
