package singleton;

/**
 * Created by yumanman on 2017/8/1.
 * 单例模式：懒汉方式，延迟加载,线程不安全，但效率比较高
 */
public class LanHanSingleton {
    private LanHanSingleton(){

    }
    private static LanHanSingleton instance;
    public LanHanSingleton getInstance(){
        if(instance==null){
            instance=new LanHanSingleton();
        }
        return instance;
    }
}
