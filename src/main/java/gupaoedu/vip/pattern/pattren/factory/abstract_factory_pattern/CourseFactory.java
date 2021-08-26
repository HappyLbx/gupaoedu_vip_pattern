package gupaoedu.vip.pattern.pattren.factory.abstract_factory_pattern;

public abstract class CourseFactory {
    public void start() {
        System.out.println("初始化");
    }

    abstract Course createCourse();

    abstract Video createVideo();

    abstract Note createNote();
}
