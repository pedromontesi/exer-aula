package Classroom;

public class Exam {


    public String name;
    public double firstExam;
    public double secondExam;
    public double thirdExam;



    public String name(){
        return name;
    }

    public double finalResult(){
        return firstExam + secondExam + thirdExam;
    }

    public double missedExam(){
        return finalResult() - 60;
    }


}
