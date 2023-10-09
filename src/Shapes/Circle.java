package Shapes;

import java.security.InvalidParameterException;

public class Circle extends Shape {
    int radius;

    public Circle(int r){
        if(r > 10){
            throw new InvalidParameterException();
        }
        this.radius = r;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
      public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
    public void setRadius(int r){
        if(r > 10){
            throw new InvalidParameterException();
        }
        this.radius = r;
    }
}
