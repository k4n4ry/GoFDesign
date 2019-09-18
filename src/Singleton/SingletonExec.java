package Singleton;

public class SingletonExec {

    public static void exec() {
        System.out.println("Start");
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();

        if(instanceA==instanceB) {
            System.out.println("same");
        } else {
            System.out.println("defer");
        }
    }
}
