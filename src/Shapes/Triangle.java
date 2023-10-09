package Shapes;

public class Triangle extends Shape {
    int base;
    int height;
    int diagnol;
    public Triangle(int b, int h, int c){
        this.base = b;
        this.height = h;
        this.diagnol = c;
    }
    public double area(){
        return this.base * this.height * 0.5;
    }
      public double perimeter(){
        return this.diagnol + this.base + this.height;
    }
}
