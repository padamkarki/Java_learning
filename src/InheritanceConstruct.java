
class Base{
    public int number;
    public int getNumber(){
        return number;
    }
    public void setNumber(int a){
        this.number = a;
    }

    public Base(){
        System.out.println("I am base a contructor");
    }
       public Base(int x){
        System.out.println("I am a base contructor with int a parameter");
    }
}
class Base2 extends Base{

    public Base2(int a){
        super(a);
        System.out.println("I am base2 int overloaded contructor");
    }
}


public class InheritanceConstruct {
    public static void main(String[] args) {
        Base2 myObj = new Base2(45);
        System.out.println("Successfully use base contructor with int input for derived or base2 class");
    }
}
