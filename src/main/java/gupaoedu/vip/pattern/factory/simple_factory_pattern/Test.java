package gupaoedu.vip.pattern.factory.simple_factory_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
        //
//        Course javaCourse = new JavaCourse();
//        javaCourse.record();
        // 通过if-else 或者  switch 对 标识进行判断
//        Course java = new CourseFactory().create("java");
//        java.record();
        // 通过获取全类名进行创建类，使用的是：(Course) Class.forName(classname).newInstance(); 缺点写错了怎么办
//        Course java = new CourseFactory().create("gupaoedu.vip.pattern.factory.simple_factory_pattern.JavaCourse");
//        java.record();

        // 通过Class对象进行传参，这样就能不用写类的名称和全路径，必须写已有的类
//        Course java = new CourseFactory().create(JavaCourse.class);
//        java.record();

        // 验证为什么  \\& 等于&
//        System.out.println("\\&".equals("&"));
//        String str = "";
//        String pattern = "a/&2";
//
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(str);
//        System.out.println(m.matches());

    }
}


