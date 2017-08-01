package singleton;

/**
 * Created by yumanman on 2017/8/1.
 * 单例模式:饿汉方式：启动时加载,线程安全，效率低
 */
public class EHanSingleton {
    private EHanSingleton(){

    }
    private static final  EHanSingleton instance=new EHanSingleton();
    public EHanSingleton getInstance(){
        return instance;
    }

}
