

class MyEmployee{

    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}


public class Private {
    public static void main(String[] args) {
        
        MyEmployee padam = new MyEmployee();
        padam.setName("Padam Karki");
        padam.setId(23);
        System.out.printf("Employee name is %s and his id is %d", padam.getName(), padam.getId());
    }
}
