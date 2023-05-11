import cars.BMWModel;
import cars.Car;
import cars.FordModel;

public interface Factory {
    Car buildBMW(BMWModel model);
    Car buildFord(FordModel model);
}
