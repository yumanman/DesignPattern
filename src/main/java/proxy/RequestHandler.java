package proxy;

/**
 * Created by yumanman on 2017/8/1.
 */
public class RequestHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("RequestHandler.handle");
    }
}
