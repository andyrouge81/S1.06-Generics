package level3.exercise1.model;

import level3.exercise1.interfaces.Phone;

public class Smartphone implements Phone {

    @Override
    public void call(int number){
        System.out.println("Extends Phone.");
        System.out.println("The calling number is: "+number);
    }

    public void takePicture(){
        System.out.println("Extends SmartPhone.");
        System.out.println("Click!.You take a picture!");
    }

}
