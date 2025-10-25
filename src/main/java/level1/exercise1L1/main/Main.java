package level1.exercise1L1.main;

import level1.exercise1L1.model.NoGenericMethods;

public class Main {
    public static void main(String[] args) {

    NoGenericMethods obj1 = new NoGenericMethods("Pedro", "Train Street", "Netherlands");

    NoGenericMethods obj2 = new NoGenericMethods("Fake Street", "Juna", "Puerto Rico");
    NoGenericMethods obj3 = new NoGenericMethods("Brussels", "Carlos", "Deep Street");

        obj1.setObj1("Charlie");

        obj3.setObj2("Colorado Stree");

        obj2.setObj3("Vietnam");

        System.out.println(obj1);

        System.out.println(obj3);

        System.out.println(obj2);


    }
}
