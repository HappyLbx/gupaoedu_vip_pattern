package gupaoedu.vip.pattern.pattren.factory.simple_factory_pattern;

public class CourseFactory {
    public Course create(Class<? extends Course> clazz) {
//  传入 String name
//        if ("java".equals(name)) {
//            return new JavaCourse();
//        } else if ("python".equals(name)) {
//            return new PythonCourse();
//        }else {
//            return null;
//        }
//    }
// 传入的是String classname
//        try {
//            if (!(null == classname || "".equals(classname))) {
//                // 传入是全类名
//                return (Course) Class.forName(classname).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;


        try {
            if (null != clazz) {
                // 传入Class clazz 其中 为什么需要强转呢？ 因为返回的是小类，传入的大类，这是可以在传入的参数上进行控制，缩小范围
//                return clazz.newInstance();
                //传入Class<? extends Course> 相当于传入的类必须继承或实现这个Course类
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }


}
