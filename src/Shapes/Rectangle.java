package Shapes;

public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle (int l, int w){
        this.length = l;
        this.width = w ;
    }
    public double area(){
        return this.length * this.width;
    }
      public double perimeter(){
        return this.length * 2 + this.width * 2 ;
    }
}
