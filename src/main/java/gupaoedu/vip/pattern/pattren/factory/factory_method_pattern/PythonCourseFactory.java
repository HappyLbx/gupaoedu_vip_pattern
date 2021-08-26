package gupaoedu.vip.pattern.pattren.factory.factory_method_pattern;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Course create() { return new PythonCourse(); }
}
