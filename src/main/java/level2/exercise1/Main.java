package level2.exercise1;


import level1.exercise2.model.Person;


public class Main {
    public static void main(String[] args) {

        GenericMethods1 generics2 = new GenericMethods1();

		System.out.println("We add arguments, 'String', 'float', 'Object', in this order type.");
		generics2.generic("String| "+"Verifying generic types "+", Float|", 23.5, ", Object| "+new Person("Alfredo", "Hidalgo", 40)+"\n");

		System.out.println();
		System.out.println("We add arguments, 'Object', 'double', 'Integer', in this order type.");
		generics2.generic("Object| "+new Person("Matilda", "Windsor", 67)+", Double| ", 5.5, ", Integer| "+456);
    }


}
