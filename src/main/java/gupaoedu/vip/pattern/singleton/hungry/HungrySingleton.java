package gupaoedu.vip.pattern.singleton.hungry;

/**
 *  饿汉式单例模式
 *  定义：类加载的首次就建立对象了
 *  优点：
 *  缺点：浪费空间
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
