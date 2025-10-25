package level1.exercise2L1.main;

import level1.exercise2L1.model.GenericMethods;
import level1.exercise2L1.model.Person;


public class Main {
    public static void main(String[] args) {

        GenericMethods generics = new GenericMethods();
		System.out.println("We add arguments, 'Object', 'String', 'float', in this order type.");
        generics.genericMethod("Object| "+new Person("Juan", "Martin", 23), "String| "+"Ecuador circular", "Float| "+5.5);

		System.out.println();

		System.out.println("Now we add arguments 'Long', 'Object', 'String' int this order type.");
        generics.genericMethod("Long| "+34L, "Object| "+new Person("Ramon", "Salazar", 45), "String| "+"Tocadiscos");

    }
}
