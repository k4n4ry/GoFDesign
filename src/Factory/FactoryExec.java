package Factory;

import Factory.framework.Factory;
import Factory.framework.Product;
import Factory.idcard.IDCard;
import Factory.idcard.IDCardFactory;

public class FactoryExec {
    public static void exec() {
        Factory f = new IDCardFactory();
        Product card1 = f.create("tanaka");
        Product card2 = f.create("suzuki");
        Product card3 = f.create("takahashi");

        card1.use();
        card2.use();
        card3.use();
    }
}
