package Part1;

public class SingletonPatternDemo {
    public static void main(String[] args){
        //illegal construct
        //The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //only instance available
        SingleObject object = SingleObject.getInstance();

        //prints message
        object.showMessage();
    }
}