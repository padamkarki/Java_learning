
//In Interface all methods needs to be implemented in children class exception for default method
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Welcome to Samsung");
    }// private method can be used for default method as follows.

    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K"); 
    }// default method may not need to be implement in other classes. and can be override
}

interface Wifi{
    String[] getNetworks(); //Arrays of Strings
    void connectToNet(String network);
}

class MyCellPhone{
    void call(int PhNo){
        System.out.println("Calling " + PhNo);
    }
        void picCall(){
        System.out.println("Connecting");
    }
}

class MySmartPhone extends MyCellPhone implements Camera, Wifi{
    public void takeSnap(){
        System.out.println("Taking Pic");
    }
    public void recordVideo(){
        System.out.println("Recording...");
    }
    public String[] getNetworks(){
        System.out.println("Geting Networks");
        String[] netList = {"Padam", "Vikram", "Ganesh"};
        return netList;
    };
    public void connectToNet(String network){
        System.out.println("Coonecting to network");
    };

}


public class InterfacesDefault {
    public static void main(String[] args) {
        MySmartPhone samsung = new MySmartPhone();
        String[] ar = samsung.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

    }
}
