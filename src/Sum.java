import java.util.Arrays;

public class Sum {
    public int evenSum(int[] arr){
        int op = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                op = op + arr[i];
            }
        }
        return op;
    }

    public int oddSum(int[] arr){
        int op = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                op += arr[i];
            }
        }
        return op;
    }

    public int total(int[] arr){
        int sum = 0;
        // for(int i=0; i < arr.length; i++){
        //     //sum = sum + arr[i];
        //     sum += arr[i];
        // }
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int countE(int[] arr){
        int count = 0;
        int i = 0;
        for(; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++; //count = count + 1; return = count
            }
        }
        return count;
    }

    public int countO(int[] arr){
        int count = 0;
        int i = 0;
        for(; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++; //count = count + 1; return = count
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = {10, 12, 13, 14};
        Sum obj = new Sum();
        System.out.println(Arrays.toString(input));
        //total even/odd
        System.out.println("sum of even " + obj.evenSum(input));
        System.out.println("sum of odd " + obj.oddSum(input));
        //total
        System.out.println("Total sum " + obj.total(input)); 
        //count of even/odd
        System.out.println("Count Even: " + obj.countE(input));
        System.out.println("Count Odd: " + obj.countO(input));
    }
}
