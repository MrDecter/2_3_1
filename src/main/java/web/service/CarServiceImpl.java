package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> carCount(List<Car> list , int count) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(list.get(i));
        }
        return carList;
    }

    @Override
    public List<Car> createCar() {

        List<Car> create = new ArrayList<>();

        create.add(new Car("Test1",2,1900));
        create.add(new Car("Test2",5,1890));
        create.add(new Car("Test3",3,1800));
        create.add(new Car("Test4",8,1540));
        create.add(new Car("Test5",10,2000));

        return create;
    }
}
