package level2.exercise2.main;

import level1.exercise2.model.Person;
import level2.exercise2.model.GenericMethods2;


public class Main {
    public static void main(String[] args) {

        GenericMethods2 generics3 = new GenericMethods2();

        generics3.generic3("String| "+"Casa",", Integer| "+23,", float| "+5.5,", Object| " +new Person("Pedro", "Coslada", 55), 45L+"\n");
        generics3.generic3("String| "+"Alfredo", ", Integer| "+23,", Long| "+ 88L+"\n");

        generics3.generic3("Object| "+new Person("Ana", "Fernandez", 39));
    }
}
