package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private final Car car;

    public CarServiceImp(Car car) {
        this.car = car;
    }

    private  final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("model_1", 1, "color_1"));
        cars.add(new Car("model_2", 2, "color_2"));
        cars.add(new Car("model_3", 3, "color_3"));
        cars.add(new Car("model_4", 4, "color_4"));
        cars.add(new Car("model_5", 5, "color_5"));
    }


    @Override
    public List<Car> getCars() {
        return cars;
    }
}
