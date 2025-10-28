package level3.exercise1.main;

import level3.exercise1.model.Generic;
import level3.exercise1.model.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone smart1 = new Smartphone();
        Generic gen1 = new Generic();

        gen1.callMethod(smart1);

        gen1.takePictureAndCallMethod(smart1);
    }
}
