import java.util.Scanner;

public class PercentageQuiz {
    public static void main(String[] args) {
        Scanner scanMarks = new Scanner(System.in);
        System.out.println("Enter marks for subject 1: ");
        int a = scanMarks.nextInt();
        System.out.println("Enter marks for subject 2: ");
        int b = scanMarks.nextInt();
        System.out.println("Enter marks for subject 3: ");
        int c = scanMarks.nextInt();
        System.out.println("Enter full marks for one subject: ");
        int outof = scanMarks.nextInt();
        int totalMarks = a+b+c;
        float percentage = (totalMarks/(3.0f*outof))*100;
        System.out.println("Your Percentage: "+ percentage);
        scanMarks.close();
    }
}
