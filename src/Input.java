import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("It works");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int a = scan.nextInt();
        System.out.println("Enter no 2:");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println("Sum is: " + sum);
        scan.close();
    }
}
