package gupaoedu.vip.pattern.pattren.factory.factory_method_pattern;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Course create() { return new JavaCourse(); }
}
