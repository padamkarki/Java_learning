public class Method {
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
    //for array/obj method is referencing to obj/array, so it will update
    static void change(int [] arr){
        arr[0] = 95;
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 32;
        int c = logic(a, b);
        System.out.println(c);

        int a1 = 64;
        int b1 = 32;
        int c1 = logic(a1, b1);
        System.out.println(c1);

        //array method call
        int [] marks = {12,13,54,46,66};
        change(marks);
        System.out.println("Updated 0th index: " + marks[0]);
    }

}
