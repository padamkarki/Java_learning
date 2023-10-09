public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public float div(float a, float b){
        return a / b;
    }
    public int multi(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Calculator obj = new Calculator();
        // System.out.println("Sum of " + a + "+" + b + " = " + obj.add(a, b));
        // System.out.println("Difference of " + a + "-" + b + " = " + obj.sub(a, b));
        // System.out.println("Division of " + a + "/" + b + " = " + obj.div(a, b));
        // System.out.println("Multiplication of " + a + "*" + b + " = " + obj.multi(a, b));

        // System.out.println("a++:" + a++);
        // System.out.println("a:" + a);
        // System.out.println("++a:" + ++a);
        // System.out.println("a:" + a);

        Sum sumObj = new Sum();
        int countEven = sumObj.countE(new int[]{10, 12, 13, 14});
        System.out.println(countEven);

        System.out.printf("Sum of %d and %d = %d \n" , a,b, obj.add(a, b));
        System.out.printf("Difference of %d and %d = %d \n" , a,b, obj.sub(a, b));
        System.out.printf("Division of %d and %d = %f \n" , a,b, obj.div(a, b));
        System.out.printf("Multiplication of %d and %d = %d \n" , a,b, obj.multi(a, b));
    }
}
