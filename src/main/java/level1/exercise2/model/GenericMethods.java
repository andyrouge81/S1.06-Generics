package level1.exercise2.model;

public class GenericMethods {

    public <T, U, V> void genericMethod(T obj1, U obj2, V obj3){

        System.out.print(obj1+", ");
        System.out.print(obj2+", ");
        System.out.print(obj3+", ");
    }

}
