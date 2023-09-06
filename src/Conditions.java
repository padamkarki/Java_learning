import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //checking if  all 33+ and total above 40%
        // byte m1, m2, m3;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your marks for maths: ");
        // m1 = scan.nextByte();
        // System.out.println("Enter your marks for eng: ");
        // m2 = scan.nextByte();
        // System.out.println("Enter your marks for sci: ");
        // m3 = scan.nextByte();
        // scan.close();

        // float avg = (m1+m2+m3)/3.0f;
        // System.out.println("your percentage is: " + avg);
        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("Congratulations you are passed");
        // }else{System.out.println("Please try again");}

        //Leapyear program
        int year;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter Year to check leap year:");
        year = scanIn.nextInt();
        if (year%4 == 0 && (year%400 == 0 || year%100 != 0)){
            System.out.println("It is an leap year");
        }else{
            System.out.println("It is not a leapyear");
        }
        scanIn.close();
    }
}
