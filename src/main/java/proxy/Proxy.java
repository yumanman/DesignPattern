package proxy;

/**
 * Created by yumanman on 2017/8/1.
 */
public class Proxy implements Handler{
    private Handler handler;
    public Proxy(Handler handler){
        this.handler=handler;
    }

    @Override
    public void handle() {
        System.out.println("before");
        handler.handle();
        System.out.println("after");
    }
}
