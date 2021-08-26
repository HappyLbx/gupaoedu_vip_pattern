package gupaoedu.vip.pattern.singleton.hungry;

public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
    }
}
