
/*abstract class can't create objects as it doesnt have return statement for methods, so its children class where all
abstract methods are overriden and have return statement can create objs*/
//Cannot use multiple abstract classes to create one new class, only one abstract for one class, opposite to Interface
abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor method of parent class");
    }
    //abstract class can have normal methods as well
    public void sayHello(){
        System.out.println("Hello");
    }
    //abstract method dont define its return statement, its for children use, to create autnomously
    abstract public void greet(); //its forced to children class to override
}

class Children2 extends Parent2{
    //abstract children must override parents abstract method or it will need to be an abstract class as well
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}


public class AbstractCl {
    public static void main(String[] args) {

        //Parent2 son = new Parent2(); // Not alloowed, its an abstract class
        Children2 son = new Children2(); //alloowed
        son.greet();
    }
}
 