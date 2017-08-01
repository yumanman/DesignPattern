import factory.AudiFactory;
import factory.Car;
import factory.CarFactory;
import factory.Factory;
import org.junit.Test;

/**
 * Created by yumanman on 2017/8/1.
 */
public class FactoryTest {
    @Test
    public void testNormalFactory(){
        CarFactory carFactory=new CarFactory();
        Car car=carFactory.getCar("audi");
        car.produce();
    }

    @Test
    public void testAbstractFactory(){
        Factory factory=new AudiFactory();
        Car car=factory.createCar();
        car.produce();
    }

}
