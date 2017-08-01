package factory;

/**
 * Created by yumanman on 2017/8/1.
 * 普通工厂模式
 */
public class CarFactory {
    //如果是static方法，就是静态工厂模式
    public Car getCar(String model){
        switch (model){
        case "audi":
            return new AudiCar();
        case "bmw":
            return new BmwCar();
        default:
            return null;
        }
    }
}
