package level1.exercise1L1.model;

public class NoGenericMethods {

    private String obj1;
    private String obj2;
    private String obj3;


    public NoGenericMethods(String obj1, String obj2, String obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;


    }

    public String getObj1(){
		return this.obj1;}

    public String getObj2(){
		return this.obj2;}

    public String getObj3(){
		return this.obj3;}



    public void setObj1(String obj1){

		this.obj1 = obj1;
    }

    public void setObj2(String obj2){

		this.obj2 = obj2;
    }

    public void setObj3(String obj3){

		this.obj3 = obj3;
    }



    @Override
    public String toString(){

		return "Name: "+getObj1()+" - Address: "+getObj2()+ " - Country: "+getObj3();
    }


}
