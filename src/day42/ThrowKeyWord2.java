package day42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowKeyWord2 {
    public static void method1(){
        try {
            new FileInputStream( "");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void method2(){
        method1();
    }
    public static void method3() throws InterruptedException {
        method2();
        Thread.sleep(1000);
    }
}
