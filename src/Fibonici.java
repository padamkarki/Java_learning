import java.util.Arrays;

public class Fibonici {

    public long[] fiboSeries(int n){
        long[] arr = new long[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < n; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;

    }
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21
        Fibonici obj = new Fibonici();
        long[] output = obj.fiboSeries(100);
        System.out.println(Arrays.toString(output));
    }
}
