import org.junit.Test;
import proxy.Proxy;
import proxy.RequestHandler;

/**
 * Created by yumanman on 2017/8/1.
 */
public class ProxyTest {

    @Test
    public void testProxy(){
        Proxy proxy=new Proxy(new RequestHandler());
        proxy.handle();
    }
}
