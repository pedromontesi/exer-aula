package Student;

import Classroom.Exam;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();
        Locale.setDefault(Locale.US);

        System.out.print("Type our name: ");
        exam.name = sc.nextLine();
        System.out.println();
        System.out.println("Type our three results: ");
        exam.firstExam = sc.nextDouble();
        exam.secondExam = sc.nextDouble();
        exam.thirdExam = sc.nextDouble();

        if (exam.finalResult() <= 60) {
            System.out.print(exam.name());
            System.out.println(" failed the exam");
            System.out.println("Total points: " + exam.finalResult());
            System.out.println("Missed points: " + exam.missedExam());
        } else {
            System.out.print(exam.name());
            System.out.println(" passed the exam");
            System.out.print("Total points: " + exam.finalResult());

        }


    }
}