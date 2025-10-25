package level1.exercise2L1.model;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age){
        this.name= name;
        this.surname= surname;
        this.age=age;
    }

    public String getName(){
		return this.name;}
    public String getSurname(){
		return this.surname;}
    public int getAge(){
		return this.age;}

    @Override
    public String toString(){

		return "Name: "+getName()+ " - Surname: "+getSurname()+ " - Age: "+getAge();
    }
}


