import Decorator.*;
import Factory.FactoryExec;

public class Main {

    public static void main(String[] args) {
//        main_decorator();
        FactoryExec.exec();
    }

    private static void main_decorator() {
        Display b1 = new StringDisplay("Hello world");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
    }
}
