package factory;

/**
 * Created by yumanman on 2017/8/1.
 */
public class AudiFactory implements Factory{
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
