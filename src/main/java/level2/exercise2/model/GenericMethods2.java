package level2.exercise2.model;


public class GenericMethods2 {

    public <T> void generic3(T... listArgs){

        for(T list : listArgs){
            System.out.print(list);
        }
    }
}
