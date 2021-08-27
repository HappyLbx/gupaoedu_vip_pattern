package gupaoedu.vip.pattern.pattren.template.course;

public class JavaCourse extends AbstractCourse {


    private  boolean checkHome = false;

    public void setCheckHome(boolean checkHome) {
        this.checkHome = checkHome;
    }

    @Override
    protected boolean isCheckHomework() {
        return checkHome;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查java作业");
    }
}
