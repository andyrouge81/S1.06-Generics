package level2.exercise2L2.main;

import level1.exercise2L1.model.Person;
import level2.exercise2L2.model.GenericMethods2L2;


public class Main {
    public static void main(String[] args) {

        GenericMethods2L2 generics3 = new GenericMethods2L2();

        generics3.generic3("String| "+"Casa",", Integer| "+23,", float| "+5.5,", Object| " +new Person("Pedro", "Coslada", 55), 45L+"\n");
        generics3.generic3("String| "+"Alfredo", ", Integer| "+23,", Long| "+ 88L+"\n");

        generics3.generic3("Object| "+new Person("Ana", "Fernandez", 39));
    }
}
