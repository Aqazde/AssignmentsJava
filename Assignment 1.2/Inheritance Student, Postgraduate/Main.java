import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student Lucifile = new Student();
        Lucifile.setFirstName("Lucifile");
        Lucifile.setGroup("TVL");
        Lucifile.setAverageMark(5);
        System.out.println("Lucifile student Scholarship is: " + Lucifile.getScholarship() + "\n For average Mark: " + Lucifile.getAverageMark());

        Aspirant Dilya = new Aspirant();
        Dilya.setFirstName("Dilya");
        Dilya.setGroup("Sabotage");
        Dilya.setAverageMark(4.67);
        System.out.println("Dilya aspirant Scholarship is: " +Dilya.getScholarship() + "\n For average Mark: " + Dilya.getAverageMark() + "\n");

        Student[] students = {Lucifile, Dilya};
        for(int i = 0; i < students.length; ++i) {
            System.out.print("Student " + students[i].getFirstName());
            System.out.print(" from group: " + students[i].getGroup());
            System.out.print(" got Scholarship in amount: " + students[i].getScholarship() + "\n");
        }
    }
}