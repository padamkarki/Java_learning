public class Method {
    public static void main(String[] args) {
        int a = 24;
        int b = 32;
        int c = logic(a, b);
        System.out.println(c);

        int a1 = 64;
        int b1 = 32;
        int c1 = logic(a1, b1);
        System.out.println(c1);
    }
        //Method
        static int logic(int x, int y){
        int z;
        if(x>y){
            z= x/y;
        }else{
            z=x*y;
        }
        return z;
    }
}
