

class Employee{
    int salary;
    String name;

    //methods
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class Phone{
    public void call(){
        System.out.println("Calling...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
}


public class Classess {
    public static void main(String[] args) {
        Employee padam = new Employee();
        padam.setName("Padam Karki");
        padam.salary = 3000;
        System.out.println("Employee name is: " + padam.name + " with salary of " + padam.salary);

        Phone samsung = new Phone();
        samsung.call();
        samsung.vibrate();
        samsung.ring();
    }
}
