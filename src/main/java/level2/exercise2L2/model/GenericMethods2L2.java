package level2.exercise2L2.model;


public class GenericMethods2L2 {

    public <T> void generic3(T... listArgs){

        for(T list : listArgs){
            System.out.print(list);
        }
    }
}
