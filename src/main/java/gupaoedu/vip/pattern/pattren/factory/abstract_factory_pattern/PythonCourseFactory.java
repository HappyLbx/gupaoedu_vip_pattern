package gupaoedu.vip.pattern.pattren.factory.abstract_factory_pattern;

public class PythonCourseFactory extends CourseFactory {

    @Override
    Course createCourse() {
        return new PythonCourse();
    }

    @Override
    Video createVideo() {
        return new PythonVideo();
    }

    @Override
    Note createNote() {
        return new PythonNote();
    }
}
