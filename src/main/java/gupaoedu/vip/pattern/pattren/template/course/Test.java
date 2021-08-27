package gupaoedu.vip.pattern.pattren.template.course;

public class Test {
    public static void main(String[] args) {
        System.out.println("=========java课程===========");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setCheckHome(true);
        javaCourse.createCourse();
        System.out.println("=========python课程===========");
        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();


    }
}
