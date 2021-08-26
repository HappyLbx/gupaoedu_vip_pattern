package gupaoedu.vip.pattern.pattren.factory.factory_method_pattern;

public class Test {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        Course course = factory.create();
        course.record();
    }
}
