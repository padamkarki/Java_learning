
class Employees{
    private int salary;
    public Employees(int n){
        salary = n;
    }

    public Employees(){
        salary = 5000;
    }

    public int getSalary(){
        return salary;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employees padam = new Employees(10000);
        System.out.println(padam.getSalary());
        Employees adam = new Employees();
        System.out.println(adam.getSalary());
    }
}
