public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(1,569,69,5));
    }
    //Methods
    static int sum(int x, int ...arr){
        int result = x;
        for(int a: arr)
            result += a;
        return result;
    }
}
