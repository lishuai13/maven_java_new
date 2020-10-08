package staticTest;

import static staticTest.App1.*;

public class App2 {

    public static void main(String[] args) {

        test1();
        App1 app1 = new App1();
        app1.test2();
    }
}
