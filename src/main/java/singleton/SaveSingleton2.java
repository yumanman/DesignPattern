package singleton;

/**
 * Created by yumanman on 2017/8/1.
 * 单例模式：懒汉安全模式2，线程安全，效率高
 */
public class SaveSingleton2 {
    private SaveSingleton2(){

    }
    private static SaveSingleton2 instance;
    public SaveSingleton2 getInstance(){
        if(instance==null){
            synchronized (SaveSingleton2.class){
                if(instance==null){
                    instance=new SaveSingleton2();
                }
            }
        }
        return instance;
    }
}
