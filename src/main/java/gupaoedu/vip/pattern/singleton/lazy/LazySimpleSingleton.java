package gupaoedu.vip.pattern.singleton.lazy;

/**
 *  懒汉式单例：
 *
 *  定义：
 *  优点：
 *  缺点：
 *
 */

public class LazySimpleSingleton {

    // 方式一：
    private static LazySimpleSingleton instince;

    private LazySimpleSingleton(){}

    public LazySimpleSingleton getInstince(){
        if (null == instince) {
            instince = new LazySimpleSingleton();
        }
        return instince;
    }

    // 方式二：

    // 方式三：

    // 方式四：

}
