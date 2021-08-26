package gupaoedu.vip.pattern.pattren.factory.abstract_factory_pattern;

public class Test {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        Course course = factory.createCourse();
        course.record();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
