public class LoopPractice {
    public static void main(String[] args) {
        // int n= 4;
        // for(int i=n; i>0; i--){
        //     for(int j=0; j>i; j++){
        //         System.out.print("X");
        //     }
        //     System.out.print("\n");
        // }

        // sum of n even no's
        // int sum = 0;
        // int n = 5;
        // for(int i=1; i<n; i++){
        //     sum = sum + (2*i);
        // }
        // System.out.println("Sum of eeven no is: " + sum);

        // //mutiple table
        // int n = 5;
        // for(int i = 1; i<=10; i++){
        //     System.out.printf("%d X %d = %d\n", n, i, n*i);
        // }

        // //reverse mutiple table
        // System.out.println("Reverse table");
        // int r = 10;
        // for(int i = 10; i>0; i--){
        //     System.out.printf("%d X %d = %d\n", r, i, r*i);
        // }

        // //factorial
        // int f = 5;
        // int factorial = 1;
        // for(int i=1; i<=f; i++){
        //     factorial *= i;
        // }
        // System.out.println(factorial);

        //sum of mutiples table
        int n = 8;
        int sum = 0;
        for(int i = 1; i<=10; i++){
            int m = n*i;
            System.out.println(m);
            sum += m;
        }
        System.out.println(sum);
    }

}
