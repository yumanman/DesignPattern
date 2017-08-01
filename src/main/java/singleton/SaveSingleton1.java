package singleton;

/**
 * Created by yumanman on 2017/8/1.
 * 单例模式：懒汉方式，线程安全，但效率低
 */
public class SaveSingleton1 {
    private SaveSingleton1(){

    }
    private static SaveSingleton1 instance;
    public synchronized SaveSingleton1 getInstance(){
        if(instance==null){
            instance=new SaveSingleton1();
        }
        return instance;
    }
}
