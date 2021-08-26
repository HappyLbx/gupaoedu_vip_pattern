package gupaoedu.vip.pattern.pattren.factory.abstract_factory_pattern;

public class JavaCourseFactory extends CourseFactory {

    @Override
    Course createCourse() {
        return new JavaCourse();
    }

    @Override
    Video createVideo() {
        return new JavaVideo();
    }

    @Override
    Note createNote() {
        return new JavaNote();
    }
}
