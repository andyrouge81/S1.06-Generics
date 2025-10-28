package level3.exercise1.model;

import level3.exercise1.interfaces.Phone;

public class Generic {

    public <T extends Phone> void callMethod(T arg){

		arg.call(555444555);
    }

    public <T extends Smartphone> void takePictureAndCallMethod(T arg){
        arg.takePicture();
        arg.call(555567788);
    }
}
