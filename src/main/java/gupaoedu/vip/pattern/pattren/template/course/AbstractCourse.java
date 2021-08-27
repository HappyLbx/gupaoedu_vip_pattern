package gupaoedu.vip.pattern.pattren.template.course;

import org.yaml.snakeyaml.events.Event;

public abstract  class AbstractCourse {

    protected final void createCourse(){
        //1.发布预习资料
        posetPreResoucse();

        // 2.制作ppt
        createPPT();

        //3.直播授课
        liveVideo();
        //4.上传课后资料
        postResource();
        //5.布置作业
        postHomework();

        // 6.是否要检查作业
        if (isCheckHomework()){
            checkHomework();
        }

    }
    protected boolean isCheckHomework(){return false;}

    protected  abstract void checkHomework();


    protected  void postHomework(){
        System.out.println("发布作业");
    };

    protected  void postResource(){
        System.out.println("上传课后资源");
    };

    protected  void liveVideo(){
        System.out.println("直播上课");
    };

    protected  void createPPT(){
        System.out.println("制作PPT");
    };

    protected  void posetPreResoucse(){
        System.out.println("发布预习资料");
    };
}
