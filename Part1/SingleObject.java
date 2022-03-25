package Part1;

public class SingleObject{
    //create an instance of SingleObject
    private static SingleObject instance = new SingleObject();

    //constructor is private to prevent instantiation
    private SingleObject(){}

    //only instance available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}